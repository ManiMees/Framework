package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Registerpage;
import testBase.BaseClass;

public class TC001_Accountregistration extends BaseClass {
	
	
	
	@Test(groups = {"sanity","e2e"})
	public void testregistration() throws InterruptedException
	{
		logger.info("page open");
		Homepage Hp=new Homepage(driver);
		
		Hp.Clickmyaccount();
		logger.info("Account is open  ");
		Hp.Clickregister();
		logger.info("Register form open  ");
	
	
		Registerpage Rp=new Registerpage(driver);
		
		Rp.Firstname(randomeString().toLowerCase());
		logger.info("Entered first name ");
		Rp.setLastName(randomeString().toLowerCase());
		logger.info("Entered Last Name   ");
		Rp.setEmail(randomeString()+"@gmail.com");
		logger.info("Entered Gmail  ");
		String password =randomAlphaNumeric();
		Rp.setPassword(password);
		logger.info("Password entered ");
		Rp.setConfirmPassword(password);
		logger.info("Confim password entered  ");
		Rp.setTelephone(randomeNumber());
		logger.info("Telephone number entered ");
		Rp.setPrivacyPolicy();
		Thread.sleep(5000);
		Rp.clickContinue();
		String msg=Rp.getConfirmationMsg();
				Assert.assertEquals(msg,"Your Account Has Been Created!");
		
				
	}
	
	
	

}
