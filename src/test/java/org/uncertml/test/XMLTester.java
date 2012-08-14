/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uncertml.test;

import java.io.File;

import org.uncertml.IUncertainty;
import org.uncertml.io.XMLEncoder;
import org.uncertml.io.XMLParser;

/**
 *
 * @author williamw
 */
public class XMLTester {

    public XMLTester() {
    }

    /*
    public static void main(String[] args) {
    XMLTester t = new XMLTester();
    t.testAll(new File("test/input"), new File("test/output"));
    }
     */

    
    /**
     * Tests all XML files in a specified folder
     * @param input the folder to read the XML files from
     * @param output the folder to output the resulting XML files to
     */
    public void testAll(File input, File output) {

        // Test that input is a directory
        if (!input.isDirectory()) {
            throw new IllegalArgumentException(input.getAbsolutePath() + " is not a folder");
        }

        // Test that output is a directory
        if (!output.isDirectory()) {
            throw new IllegalArgumentException(output.getAbsolutePath() + " is not a folder");
        }

        testRecursively(input, output, "");
    }

    private void testRecursively(File input, File output, String currentDirectory) {
        createOutputDirectory(output, currentDirectory);
        // Initialise XMLParser
        XMLParser parser = new XMLParser();
        // Initialise XMLEncoder
        XMLEncoder encoder = new XMLEncoder();

        // loop through all files
        File[] files = input.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                // Is a directory, recurse
                System.out.println("Entering directory: " + file.getPath());
                this.testRecursively(file, output, file.getName());
            } else {
                // is a file, see if its XML
                String filename = file.getName();
                String extension = filename.substring(filename.lastIndexOf(".") + 1);
                if (!extension.equalsIgnoreCase("xml")) {
                    // Not an XML file, skip
                    System.out.println("Skipping file " + filename);
                    continue;
                }
                System.out.println("Parsing file: " + file.getName());
                try {
                    // Parse the file
                    IUncertainty uncertainty = parser.parse(file);
                    // Create the new output file
                    String outputFile = output.getAbsolutePath() + File.separator + currentDirectory + File.separator + file.getName();
                    File out = new File(outputFile);
                    System.out.println("Writing file to " + outputFile);
                    out = new File(outputFile);
                    encoder.encode(uncertainty, out);

                } catch (Exception ex) {
                    System.out.println("Exception on file " + filename + ": " + ex.getMessage());
                }
            }
        }
    }

    /*
     * Method that checks for the existence of the correct output directory.
     * Creates a new directory if it does not exist.
     */
    private void createOutputDirectory(File output, String currentDirectory) {
        // See if this current directory exists in the output tree
        String outputFile = output.getAbsolutePath() + File.separator + currentDirectory;
        File out = new File(outputFile);
        if (!out.exists()) {
            System.out.println("Creating directory " + outputFile);
            out.mkdir();
        }
    }

}
