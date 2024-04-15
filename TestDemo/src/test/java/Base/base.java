package Base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import POM.pomodel;
import Utilities.readConfig;

public class base {

	public WebDriver driver;
	public JavascriptExecutor jse;
	public readConfig rc;
	public FileInputStream fis;
	public Properties p;
	public pomodel pom; 
	
}
