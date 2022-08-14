package propTest;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import propBase.Base2;
import propPOMclass.HomePage;
import propPOMclass.LoginPage;
import propPOMclass.PinPage;
import propUtility.Utilitytest;

public class validateUID extends Base2
{
	LoginPage login;
	HomePage home;
	PinPage pin;
	
	
	@BeforeClass
	public void launchkite() throws IOException
	{
		launchBrowser();
		
		 login=new LoginPage(driver);
		 home=new HomePage(driver);
		 pin =new PinPage(driver);
		
		
	}
	
	
	@BeforeMethod
	
	public void loginToKite() throws IOException
	{
		login.sendUserId(Utilitytest.readDataFromProp("UN"));
		login.sendPassword(Utilitytest.readDataFromProp("PWD"));
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(Utilitytest.readDataFromProp("PIN"));
		pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
	}
	
	
	
  @Test
  public void validation() throws IOException
  {
	 Assert.assertEquals(Utilitytest.readDataFromProp("UN"), home.getUserID(),"testcase is failed");
	 
	//Utilitytest.snapsot(driver);;
	
  }
  
  @AfterMethod
  public void logoutKite() throws InterruptedException
  {
	  home.ClickOnLogoutButton();
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
}
