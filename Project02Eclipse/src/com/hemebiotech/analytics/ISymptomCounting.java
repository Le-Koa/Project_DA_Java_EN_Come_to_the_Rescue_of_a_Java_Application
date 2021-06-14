package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Anything that will read symptom data from a source The important part is, the
 * return value from the operation, which is a list of strings and the
 * occurrences of the string.
 * 
 * 
 * The implementation is in order list
 * 
 */

public interface ISymptomCounting {

	public Map<String, Integer> getSymptomsCount(List<String> getSymptoms) throws IOException;
}
