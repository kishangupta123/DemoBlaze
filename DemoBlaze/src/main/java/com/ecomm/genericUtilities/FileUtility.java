package com.ecomm.genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Kishan Kumar Gupta
 */

public class FileUtility {
	/**
	 * 
	 * @param Key
	 * @return
	 * @throws IOException
	 */
	public String getStringDataFromProperty(String Key) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("./src/test/resources/TestData/commonData.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		return properties.getProperty(Key);
	}
}
