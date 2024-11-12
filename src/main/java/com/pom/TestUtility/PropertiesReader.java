package com.pom.TestUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	File file;
	FileInputStream inputStream;
	Properties pro;

	public PropertiesReader(String propertiesFilePath) {
		try {
			file = new File(propertiesFilePath);
			inputStream = new FileInputStream(file);
			pro = new Properties();
			pro.load(inputStream);
		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public String getProperty(String key) {
		return pro.getProperty(key);

	}

}
