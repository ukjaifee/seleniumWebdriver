package com.sakValut.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	String path=getRootDirectoryPath();
	ConstantVariables constantvariables;
	
	public  String  readApplicationFile(String key){
		Properties pro=new Properties();
		String value="";
		File file=new File(this.path+constantvariables.appProp);
		try {
			pro.load(new FileInputStream(file));
			value=pro.getProperty(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The value of file is:" + value);
		return value;
		
	
	}
	
	
	
	public String getRootDirectoryPath(){
		
		String filepath=null;
		String abosultepath=System.getProperty("user.dir");
		filepath=abosultepath.replaceAll("\\\\+","/");
		System.out.println(filepath);
		return filepath;
		
		
	}
	
	public static void main(String[] args) {
		PropertyReader obj=new PropertyReader();
		obj.getRootDirectoryPath();
		obj.readApplicationFile("Browser");
	}

}
