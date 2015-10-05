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
    public void readCsv(String filePath) {
        //BufferedReader reader = null;
        System.out.println("hello again!");


        try {
            String readerLine;

            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            while ((readerLine = reader.readLine()) != null) {
                System.out.println(readerLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
