package test;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadingProp {

	//Properties and FileInputStream are inbuilt classes in java
	public static void main(String[] args) {
		
		//Creating object for properties
		Properties prop = new Properties();
		//String Path = "D:\Application\Aishwarya_Selenium\POM\src\com\selenium\config\config.properties"
		String path = (System.getProperty("user.dir")+"src\\com\\selenium\\config\\config.properties");
		
		//Creating object for fileinputstream, to read the properties file
		try{
			FileInputStream fs = new FileInputStream(path);
			prop.load(fs);
		}
		catch(Exception e){
			//Error
			return;
		}
		
	}

}
