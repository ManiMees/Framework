package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login extends Basetest{

	public login(WebDriver driver) {
		super(driver);
	
	}

	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	@FindBy(xpath="//input[@id='input-password']")
    WebElement txtpassword;

   @FindBy(xpath="//input[@value='Login']")
   WebElement btnlink;
	
   public void inputemail(String email)
   {
	   txtemail.sendKeys(email);
   }
   public void inputpassword(String Password)
   {
	   txtpassword.sendKeys(Password);
   }
   public void clicklogin()
   {
	   btnlink.click();
   }

}
