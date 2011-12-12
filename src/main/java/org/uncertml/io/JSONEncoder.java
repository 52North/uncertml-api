package org.uncertml.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.uncertml.IUncertainty;
import org.uncertml.distribution.WeightedDistribution;
import org.uncertml.distribution.continuous.MixtureModel;
import org.uncertml.exception.UncertaintyEncoderException;
import org.uncertml.exception.UnsupportedUncertaintyTypeException;
import org.uncertml.sample.AbstractRealisation;
import org.uncertml.sample.CategoricalRealisation;
import org.uncertml.sample.ContinuousRealisation;
import org.uncertml.statistic.IStatistic;
import org.uncertml.statistic.StatisticCollection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

/**
 * JSON implementation of an UncertML encoder.
 * 
 * @author Richard Jones
 * @version 2.0
 */
public class JSONEncoder implements IUncertaintyEncoder {

    // uses the GSON library to encode.
    private Gson gson;

    public JSONEncoder() {
        GsonBuilder builder = new GsonBuilder();
        gson = builder.create();
    }

    @Override
    public String encode(IUncertainty element) {
        return gson.toJson(encodeAsJSONObject(element));
    }

    /**
     * Encodes the <code>IUncertainty</code> object into a <code>JsonObject</code>
     * 
     * @param element the UncertML object to encode as JSON.
     * @return a JSON representation of the UncertML object.
     */
    private JsonObject encodeAsJSONObject(IUncertainty element) {
        // let gson do all the serializing work!
        // problems here are that any IUncertainty objects within the root one will be serialized 
        // in a standard way.
    	String name = element.getClass().getSimpleName();
        JsonElement uncertainty;
        if (element instanceof StatisticCollection) {
            // special case for collection
            uncertainty = new JsonObject();
            JsonArray members = new JsonArray();
            uncertainty.getAsJsonObject().add("members", members);
            for (IStatistic member : (StatisticCollection) element) {
                JsonObject json = new JsonObject();
                json.add(member.getClass().getSimpleName(), gson.toJsonTree(member));
                members.add(json);
            }
        } else if (element instanceof MixtureModel) {
            // another special case for a collection
            uncertainty = new JsonObject();
            JsonArray components = new JsonArray();
            uncertainty.getAsJsonObject().add("components", components);
            for (WeightedDistribution component : (MixtureModel) element) {
                JsonObject json = new JsonObject();
                json.add("weight", new JsonPrimitive(component.getWeight()));
                JsonObject dist = new JsonObject();
                dist.add(component.getDistribution().getClass().getSimpleName(), gson.toJsonTree(component.getDistribution()));
                json.add("distribution", dist);
                components.add(json);
            }
        } else if (element instanceof AbstractRealisation) {
        	name = "Realisation";
        	uncertainty = new JsonObject();
        	AbstractRealisation r = (AbstractRealisation)element;
        	
        	// add values/categories
        	if (r instanceof CategoricalRealisation) {
        		uncertainty.getAsJsonObject().add("categories", gson.toJsonTree(((CategoricalRealisation)r).getCategories()));
        	} else {
        		uncertainty.getAsJsonObject().add("values", gson.toJsonTree(((ContinuousRealisation)r).getValues()));
        	}
        	
        	// add additional properties
        	if (r.getId() != null) {
        		uncertainty.getAsJsonObject().addProperty("id", r.getId());
        	}
        	if (!Double.isNaN(r.getWeight())) {
        		uncertainty.getAsJsonObject().addProperty("weight", r.getWeight());
        	}
        } else {
            uncertainty = gson.toJsonTree(element);
        }

        // add uncertainty to base json object
        JsonObject json = new JsonObject();
        json.add(name, uncertainty);
        return json;
    }

    @Override
    public void encode(IUncertainty element, File file) throws UnsupportedUncertaintyTypeException, UncertaintyEncoderException {
        try {
            FileWriter writer = new FileWriter(file);
            gson.toJson(encodeAsJSONObject(element), writer);
            writer.close();
        } catch (IOException e) {
            throw new UncertaintyEncoderException(e);
        }
    }

    @Override
    public void encode(IUncertainty element, OutputStream stream) throws UnsupportedUncertaintyTypeException, UncertaintyEncoderException {
        OutputStreamWriter writer = new OutputStreamWriter(stream);
        gson.toJson(encodeAsJSONObject(element), writer);
        try {
            writer.flush();
        } catch (IOException e) {
            throw new UncertaintyEncoderException(e);
        }
    }

    @Override
    public void encode(IUncertainty element, Writer writer) throws UnsupportedUncertaintyTypeException, UncertaintyEncoderException {
        gson.toJson(encodeAsJSONObject(element), writer);
    }

}
