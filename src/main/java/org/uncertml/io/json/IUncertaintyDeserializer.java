package org.uncertml.io.json;

import java.lang.reflect.Type;
import java.util.ArrayList;

import org.uncertml.IUncertainty;
import org.uncertml.distribution.IDistribution;
import org.uncertml.distribution.WeightedDistribution;
import org.uncertml.distribution.continuous.MixtureModel;
import org.uncertml.statistic.IStatistic;
import org.uncertml.statistic.StatisticCollection;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 * 
 * @author Richard Jones
 * @version 2.0
 */
public class IUncertaintyDeserializer implements JsonDeserializer<IUncertainty> {

    @Override
    public IUncertainty deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject json = element.getAsJsonObject();
        String uncertaintyType = json.entrySet().iterator().next().getKey();
        if (uncertaintyType.equals("StatisticCollection")) {
            // special case
            StatisticCollection collection = new StatisticCollection();
            JsonArray members = json.get("StatisticCollection").getAsJsonObject().get("members").getAsJsonArray();
            for (JsonElement member : members) {
                collection.add((IStatistic) context.deserialize(member, IUncertainty.class));
            }
            return collection;
        } else if (uncertaintyType.equals("MixtureModel")) {
            // another special case
            ArrayList<WeightedDistribution> distributions = new ArrayList<WeightedDistribution>();
            JsonArray components = json.get("MixtureModel").getAsJsonObject().get("components").getAsJsonArray();
            for (JsonElement component : components) {
                double weight = component.getAsJsonObject().get("weight").getAsDouble();
                IDistribution distribution = (IDistribution) context.deserialize(component.getAsJsonObject().get("distribution"), IUncertainty.class);
                distributions.add(new WeightedDistribution(weight, distribution));
            }
            return new MixtureModel(distributions);
        } else {
            Class<?> uncertaintyClass = getUncertaintyClass(uncertaintyType);
            if (uncertaintyClass != null) {
                return context.deserialize(json.get(uncertaintyType), uncertaintyClass);
            }
        }
        return null;
    }

    private Class<?> getUncertaintyClass(String uncertaintyType) {
        Class<?> uncertaintyClass = null;
        try {
            uncertaintyClass = Class.forName("org.uncertml.statistic." + uncertaintyType);
        } catch (ClassNotFoundException e) {
        }
        try {
            uncertaintyClass = Class.forName("org.uncertml.sample." + uncertaintyType);
        } catch (ClassNotFoundException e) {
        }
        try {
            uncertaintyClass = Class.forName("org.uncertml.distribution.categorical." + uncertaintyType);
        } catch (ClassNotFoundException e) {
        }
        try {
            uncertaintyClass = Class.forName("org.uncertml.distribution.continuous." + uncertaintyType);
        } catch (ClassNotFoundException e) {
        }
        try {
            uncertaintyClass = Class.forName("org.uncertml.distribution.discrete." + uncertaintyType);
        } catch (ClassNotFoundException e) {
        }
        try {
            uncertaintyClass = Class.forName("org.uncertml.distribution.multivariate." + uncertaintyType);
        } catch (ClassNotFoundException e) {
        }
        return uncertaintyClass;
    }

}
