package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class Launcher {

	public static void main(String[] args) throws IOException {
		
		//INSTANCIATION DE L'OBJET ANALYTICSCOUNTER
		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		
		//Setup a list from the symptoms file
		List<String> symptoms = analyticsCounter.getSymptoms();
		
		//Count the occurrences of a list and put it in a TreeMap
		TreeMap<String, Integer> counting = analyticsCounter.getSymptomsCount(symptoms);
		
		//Put all occurrences in a output file
		analyticsCounter.WriteSymptomFile(counting);
		

	}
}

