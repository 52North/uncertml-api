/**
 * Copyright 2014 52°North Initiative for Geospatial Open Source Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
