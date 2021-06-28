package com.hemebiotech.analytics;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		
		WriteSymptomDataToFile writeSyntomDataToFile = new WriteSymptomDataToFile();
		writeSyntomDataToFile.write("symptoms.txt", "result.out");
		writeSyntomDataToFile.afficherResultat("result.out");
		writeSyntomDataToFile.afficherResultat("result.out");
// ajouter pour tester commit
		//
}
}
