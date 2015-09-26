/**
 * Created by junjaytan on 9/26/15.
 */
package com.junjaytan.java.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * This example class implements a CSV reader using the default Java libraries
 * see: http://crunchify.com/how-to-read-convert-csv-comma-separated-values-file-to-arraylist-in-java-using-split-operation/
 */
public class csvReader {
    public static void main(String[] args) {
        //BufferedReader reader = null;

        try {
            String readerLine;

            BufferedReader reader = new BufferedReader(new FileReader("/Users/junjaytan/IdeaProjects/file-read-write/src/test/resources/sample.csv"));

            while ((readerLine = reader.readLine()) != null) {
                System.out.println(readerLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
