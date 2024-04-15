package POM;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.base;

public class pomodel extends base{

	
	public pomodel(WebDriver driver) {
		
		this.driver=driver;
		this.jse=(JavascriptExecutor)this.driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name = "username")WebElement uname;
	@FindBy(name = "password")WebElement pswd;
	@FindBy(xpath = "//button[@type='submit']")WebElement clk;
	
	public void setUname(String un) {
		uname.sendKeys(un);
	}
	public void setpswd(String p) {
		pswd.sendKeys(p);
	}
	public void clk() {
		clk.click();
	}
	public void verify(String exp) {
	String act = driver.getTitle();
	System.out.println(act);
	assertEquals(act, exp,"confirmed");
	}

}
