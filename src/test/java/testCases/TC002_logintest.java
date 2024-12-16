package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Myaccountpage;
import pageObjects.login;
import testBase.BaseClass;

public class TC002_logintest extends BaseClass {
	@Test(groups = {"regression","e2e"})
	public void testlogin()
	{
		
		try{
			logger.info("*****logintest****");
		
		Homepage home= new Homepage(driver);
		home.Clickmyaccount();
		home.login();
		
		logger.info("Enter login details");
		
		login lg=new login(driver);
		lg.inputemail("abc123@gmail.com");
		lg.inputpassword("test@123");
		lg.clicklogin();
		
		Myaccountpage Myacc=new Myaccountpage(driver);
		boolean display=Myacc.ismyAccountpageexists();
		System.out.println(display);
		Myacc.clicklogout();
		}
		catch (Exception e) {
			Assert.fail("An exception occurred: " + e.getMessage());

		}
		
	}
	
	

}
