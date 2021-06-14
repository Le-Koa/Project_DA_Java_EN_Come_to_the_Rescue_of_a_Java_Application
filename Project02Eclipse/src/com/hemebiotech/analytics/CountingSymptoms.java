package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Bennour Ilyass
 * @version 0.0.1
 * 
 *          CountingSymptoms count the occurrences of a string in a list and
 *          give the total of each string.
 */

public class CountingSymptoms implements ISymptomCounting {

	/**
	 * This method count the occurrence of the List and put it in TreeMap (Key and
	 * Value) without duplication
	 */
	@Override
	public Map<String, Integer> getSymptomsCount(List<String> getSymptoms) throws IOException {
		TreeMap<String, Integer> result = new TreeMap<>();
		try {
			for (String symptoms : getSymptoms) {

				if (!result.containsKey(symptoms)) {
					result.put(symptoms, 1);

				} else {
					result.put(symptoms, result.get(symptoms) + 1);
				}
			}
		} catch (Exception e) {
			System.err.println("Something went wrong");
			e.printStackTrace();
		}
		return result;
	}
}
