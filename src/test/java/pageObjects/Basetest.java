package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Basetest {
WebDriver driver;
	
	public Basetest(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


}
