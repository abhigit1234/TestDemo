package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

import javax.management.RuntimeErrorException;

import Base.base;

public class readConfig extends base{

	public readConfig() {
		try {

			fis= new FileInputStream(System.getProperty("user.dir")+"//src/test/resources/config.properties");
			p=new Properties();
			p.load(fis);	
		} catch (Exception e) {
		}
	}
	
	public String getBrowser() {
		String browser = p.getProperty("browser");
		if(browser!=null) {
			return browser;
		}else {
			throw new RuntimeException("invalid browser.....");
		}
	}

	public String geturl() {
		String url = p.getProperty("url");
		if(url!=null) {
			return url;
		}else {
			throw new RuntimeException("invalid url.....");
		}
	}
	
}
