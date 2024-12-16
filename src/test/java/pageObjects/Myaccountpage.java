package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myaccountpage extends Basetest {

	public Myaccountpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement txtmyacc;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement btnlogout;
	
	public boolean ismyAccountpageexists()
	{
		try {
			return txtmyacc.isDisplayed();
		}
		catch(Exception e)
		{
			return(false);
		}
	}
    public void clicklogout()
    {
    	btnlogout.click();
    }
}
