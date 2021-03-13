package core.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	String path = System.getProperty("user.dir")+ "\\src\\test\\resouces\\config\\globalParameters.properties";
	String value;

	public String getProperty(String propName) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		value = prop.getProperty(propName);
		return value;
	}
}
