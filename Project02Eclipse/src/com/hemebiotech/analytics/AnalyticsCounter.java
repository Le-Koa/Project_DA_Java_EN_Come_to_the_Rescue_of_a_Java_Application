package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;
/**
 *@author Bennour Ilyass
 *@version 0.0.1
 *
 *AnalyticsCounter read a file, list them alphabetically and count the number
 *of repetition, this class call: "CountingSymptoms", "ReadSymptomDataFromFile",
 *"WriteSymptomFile"  
 */
public class AnalyticsCounter {
	
	/**
	 * 
	 */
	static final String inputFilepath = "Project02Eclipse/symptoms.txt";
	static final String outputFilepath = "Project02Eclipse/results.out";
	
	/**
	 * @return List of symptoms
	 */
	public List<String> getSymptoms(){
	
		//Read a list of string from a specified path and put it in a List
		
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(inputFilepath);
		List<String> symptomsList = readSymptomDataFromFile.getSymptoms();
		
		return symptomsList;
		
	}
	
	/**
	 * @param symptomsList
	 * @return TreeMap(K:Symptoms,V:Occurrences)
	 * @throws IOException
	 */
	
	public TreeMap<String, Integer> getSymptomsCount(List<String> symptomsList) throws IOException {
		
		//Count the occurrences of a list of symptoms
		
		CountingSymptoms countingSymptoms = new CountingSymptoms();
		TreeMap<String, Integer> symptomsMap = (TreeMap<String, Integer>) countingSymptoms.getSymptomsCount(symptomsList);	
		
		return symptomsMap;
		
	}
		/**
		 * @param symptomsMap
		 */
	
	public void WriteSymptomFile(TreeMap<String, Integer> symptomsMap) {
		
		//Create a file of a list of symptoms and the occurrences in a specified path
		
		WriteSymptomFile writeSymptomFile = new WriteSymptomFile(outputFilepath);
		writeSymptomFile.writeSymptom(symptomsMap);
	}
}