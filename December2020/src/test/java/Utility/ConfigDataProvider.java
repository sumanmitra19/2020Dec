package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	
	public ConfigDataProvider()
	{
		File file = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception message is: " + e.getMessage());
		} 
	}
	
	public String getBrowser()
	{
		return pro.getProperty("browserName");
	}
	
	public String getUrl()
	{
		return pro.getProperty("url");
	}
	
	public String getUsername()
	{
		return pro.getProperty("usnm");
	}
	
	public String getPassword()
	{
		return pro.getProperty("pswrd");
	}
	
}
