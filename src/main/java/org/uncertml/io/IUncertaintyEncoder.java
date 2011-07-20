package org.uncertml.io;

import java.io.File;
import java.io.OutputStream;
import java.io.Writer;

import org.uncertml.IUncertainty;
import org.uncertml.exception.UncertaintyEncoderException;
import org.uncertml.exception.UnsupportedUncertaintyTypeException;

/**
 * Interface for all UncertML encoders, i.e. XML and JSON.
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public interface IUncertaintyEncoder {

    /**
     * Method that encodes a given <code>IUncertainty</code> object into a String
     * representation
     * @param element the UncertML object to encode, can be any object that implements
     * the <code>IUncertainty</code> interface.
     * @return A String representation of the encoded object.
     * @throws UnsupportedUncertaintyTypeException when an unsupported UncertML object
     * is passed as a parameter.
     * @throws UncertaintyEncoderException when an exception occurs during the encoding
     * process.
     */
    public String encode(IUncertainty element) throws UnsupportedUncertaintyTypeException, UncertaintyEncoderException;

    /**
     * Method that encodes a given <code>IUncertainty</code> object to a provided <code>File</code> object.
     * 
     * @param element the UncertML object to encode, can be any object that implements
     * the <code>IUncertainty</code> interface.
     * @param file the <code>File</code> object to encode the element to.
     * 
     * @throws UnsupportedUncertaintyTypeException when an unsupported UncertML object
     * is passed as a parameter.
     * @throws UncertaintyEncoderException when an exception occurs during the encoding
     * process.
     */
    public void encode(IUncertainty element, File file) throws UnsupportedUncertaintyTypeException, UncertaintyEncoderException;

    /**
     * Method that encodes a given <code>IUncertainty</code> object to a provided <code>OutputStream</code> object.
     * 
     * @param element the UncertML object to encode, can be any object that implements
     * the <code>IUncertainty</code> interface.
     * @param stream the <code>OutputStream</code> object to encode the element to.
     * 
     * @throws UnsupportedUncertaintyTypeException when an unsupported UncertML object
     * is passed as a parameter.
     * @throws UncertaintyEncoderException when an exception occurs during the encoding
     * process.
     */
    public void encode(IUncertainty element, OutputStream stream) throws UnsupportedUncertaintyTypeException, UncertaintyEncoderException;

    /**
     * Method that encodes a given <code>IUncertainty</code> object to a provided <code>Writer</code> object.
     * 
     * @param element the UncertML object to encode, can be any object that implements
     * the <code>IUncertainty</code> interface.
     * @param writer the <code>Writer</code> object to encode the element to.
     * 
     * @throws UnsupportedUncertaintyTypeException when an unsupported UncertML object
     * is passed as a parameter.
     * @throws UncertaintyEncoderException when an exception occurs during the encoding
     * process.
     */
    public void encode(IUncertainty element, Writer writer) throws UnsupportedUncertaintyTypeException, UncertaintyEncoderException;

}
