package com.hemebiotech.analytics;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		
		WriteSyntomDataToFile writeSyntomDataToFile = new WriteSyntomDataToFile();
		writeSyntomDataToFile.write("symptoms.txt", "result.out");
		writeSyntomDataToFile.afficherResultat("result.out");

}
}
