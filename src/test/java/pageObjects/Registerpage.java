package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage extends Basetest{
	
	public Registerpage(WebDriver driver)
	{
		super(driver);
	}


	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtfirstname;
    @FindBy(xpath="//input[@id='input-lastname']")
    WebElement txtlastname;
    @FindBy(xpath="//input[@id='input-email']")
    WebElement txtemail;
    @FindBy(xpath="//input[@id='input-telephone']")
    WebElement txttelephone;
    @FindBy(xpath="//input[@id='input-password']")
   WebElement txtpassword;
   @FindBy(xpath="//input[@id='input-confirm']")
   WebElement txtconfirm;
   @FindBy(xpath="//input[@name='agree']")
   WebElement chkdagree;
   @FindBy(xpath="//input[@value='Continue']")
   WebElement btncontinue;

   @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
   WebElement msgConfirmation;

      
   public void Firstname(String fname)
   {
	   txtfirstname.sendKeys(fname);
   }
   public void setLastName(String lname) {
		txtlastname.sendKeys(lname);

	}

	public void setEmail(String email) {
		txtemail.sendKeys(email);

	}

	public void setTelephone(String tel) {
		txttelephone.sendKeys(tel);

	}

	public void setPassword(String pwd) {
		txtpassword.sendKeys(pwd);

	}

	public void setConfirmPassword(String pwd) {
		txtconfirm.sendKeys(pwd);

	}

	public void setPrivacyPolicy() {
		chkdagree.click();

	}

	public void clickContinue() {
		//sol1 
		btncontinue.click();
	}
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}

  
	
}
