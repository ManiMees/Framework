package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basetest {
	
	
	
	public Homepage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement linkmyaccount;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
	WebElement linkregister;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
	WebElement linklogin;
	
	public void Clickmyaccount()
	{
		linkmyaccount.click();
	}
	
	public void Clickregister()
	{
		linkregister.click();
	}
	public void login()
	{
		linklogin.click();
	}
	
	

}
