package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		// next generate output
		writeFormatDataToFile("symptoms.txt", "result2.out");

		// display the presentation on screen for Helène
		afficherResultat("result.out");
	}

	// write the data in form to file "result.out"
	private static void writeFormatDataToFile(String fileNameInput, String fileNameOutput) {
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(fileNameInput);

		try {
			FileWriter writer = new FileWriter(fileNameOutput);

			try {
				List<String> list = readSymptomDataFromFile.GetSymptoms();
				Set<String> distint = new TreeSet<>(list);

				for (String s : distint) {
			writer.write(s + ": " + Collections.frequency(list, s) + " \n");
					
				}
			}

			finally {
				writer.close();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	// method to display the result on the screen 
	public static void afficherResultat(String fileName) {
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(fileName);

		for (String string : readSymptomDataFromFile.GetSymptoms()) {
			System.out.println(string);

		}
	}
}
