package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class WriteSyntomDataToFile {

	public void write(String fileNameInput, String fileNameOutput) {
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(fileNameInput);
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(fileNameOutput));

			try {
				List<String> list = readSymptomDataFromFile.GetSymptoms();
				Set<String> distint = new TreeSet<>(list);
				for (String s : distint) {
					bw.write(s + ": " + Collections.frequency(list, s) + " \n");

				}
			}

			finally {
				bw.close();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	// method to display the result on the screen
	public void afficherResultat(String fileName) {
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(fileName);

		for (String string : readSymptomDataFromFile.GetSymptoms()) {
			System.out.println(string);

		}

	}
}
