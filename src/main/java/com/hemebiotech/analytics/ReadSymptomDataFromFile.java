package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it,
	 *                 one per line
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	@Override
	public List<String> GetSymptoms() {
		ArrayList<String> result = new ArrayList<String>();

		if (filepath != null) {

			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepath));

				try {
					String line;

					while ((line = reader.readLine()) != null) {
						result.add(line);

					}
				} finally {
					reader.close();
				}
			}

			catch (IOException e) {
				e.printStackTrace();
			}

		}
		return result;
	}
}
