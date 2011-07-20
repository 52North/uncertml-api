package org.uncertml.io;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;

import org.uncertml.IUncertainty;
import org.uncertml.exception.UncertaintyParserException;

/**
 * Interface for all UncertML parsers, i.e. XML and JSON.
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public interface IUncertaintyParser {

    /**
     * Method that parses a given <code>String</code> into an UncertML object.
     * 
     * @param uncertml String representation of the UncertML object.
     * @return an object that implements the <code>IUncertainty</code> interface.
     * 
     * @throws UncertaintyParserException when there is an exception during the
     * parsing process.
     */
    public IUncertainty parse(String uncertml) throws UncertaintyParserException;

    /**
     * Method that parses a given <code>Stream</code> object into an UncertML object.
     * 
     * @param stream <code>Stream</code> containing the UncertML object.
     * @return an object that implements the <code>IUncertainty</code> interface.
     * 
     * @throws UncertaintyParserException when there is an exception during the
     * parsing process.
     */
    public IUncertainty parse(InputStream stream) throws UncertaintyParserException;

    /**
     * Method that parses a given <code>File</code> object into an UncertML object.
     * 
     * @param file <code>File</code> containing the UncertML object.
     * @return an object that implements the <code>IUncertainty</code> interface.
     * 
     * @throws UncertaintyParserException when there is an exception during the
     * parsing process.
     */
    public IUncertainty parse(File file) throws UncertaintyParserException;

    /**
     * Method that parses a given <code>Reader</code> object into an UncertML object.
     * 
     * @param reader <code>Reader</code> containing the UncertML object.
     * @return an object that implements the <code>IUncertainty</code> interface.
     * 
     * @throws UncertaintyParserException when there is an exception during the
     * parsing process.
     */
    public IUncertainty parse(Reader reader) throws UncertaintyParserException;

}
