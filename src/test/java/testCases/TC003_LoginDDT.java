package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Myaccountpage;
import pageObjects.login;
import testBase.BaseClass;
import utilites.DataProviders;

public class TC003_LoginDDT extends BaseClass{
	
	
		@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
		public void testlogin(String email, String password, String exp)
		{

		logger.info("*****logintest****");
		try {
		Homepage home= new Homepage(driver);
		home.Clickmyaccount();
		home.login();
		
		logger.info("Enter login details");
		
		login lg=new login(driver);
		lg.inputemail(email);
		lg.inputpassword(password);
		lg.clicklogin();
		
		Myaccountpage Myacc=new Myaccountpage(driver);
		boolean targetPage=Myacc.ismyAccountpageexists();
		
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetPage==true)
			{
				Myacc.clicklogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetPage==true)
			{
				Myacc.clicklogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
	}
	catch(Exception e)
	{
		Assert.fail("An exception occurred: " + e.getMessage());
	}

		}
		
	}
	
	


