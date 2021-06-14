package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * @author Bennour Ilyass
 * @version 0.0.1
 *
 *          WriteSymptomFile create a file in a specified path and write the
 *          occurrences of each symptoms
 *
 */
public class WriteSymptomFile implements ISymptomWriteFile {

	private String outputfilepath;

	public WriteSymptomFile(String outputfilepath) {
		this.outputfilepath = outputfilepath;
	}

	/**
	 * This method create and list of a Map(Key,Value) and print the key and value
	 * in a file
	 */
	@Override
	public void writeSymptom(TreeMap<String, Integer> result2) {

		File writer = new File(outputfilepath);
		BufferedWriter result = null;
		
		try {

			result = new BufferedWriter(new FileWriter(writer));

			for (Entry<String, Integer> entry : result2.entrySet()) {
				System.out.println(entry.getKey() + "=" + entry.getValue());
				result.write(entry.getKey() + " = " + entry.getValue());
				result.newLine();
			}

		} catch (IOException e) {
			System.err.println("Something went wrong");
		} finally {
			try {
				result.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
