package com.hybridframework.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	public Properties prop;

	public ConfigDataProvider(String configdatapath) {

		try {

			File fs = new File(configdatapath);
			FileInputStream fins = new FileInputStream(fs);
			new Properties();
			prop.load(fins);

		}

		catch (Exception e)

		{
			System.out.println("File not found :" + e);

		}

	}

	public String sreachKey(String key) {

		return prop.getProperty(key);

	}

	public String getUsername()

	{
		return prop.getProperty("username");
	}

	public String getPassword()

	{
		return prop.getProperty("password");
	}

	public String getUrl()

	{
		return prop.getProperty("url");
	}

}
