package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WorkingOnPropertiesFile {
	
	public static void main(String[] args) throws IOException 
	{
		
		String filePath="./Test_Config/Config.properties";
		
		FileInputStream fil=new FileInputStream(filePath);
		
		Properties pro=new Properties();
		
		pro.load(fil);
		
		System.out.println(pro.getProperty("Username"));
		System.out.println(pro.getProperty("Pass"));
		System.out.println(pro.getProperty("url"));
		}
		
	}

