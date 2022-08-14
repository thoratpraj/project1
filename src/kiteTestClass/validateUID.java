package kiteTestClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KitePOMusingTestNG.HomePage;
import KitePOMusingTestNG.LoginPage;
import KitePOMusingTestNG.PinPage;
import TestNG_Base.Base1;

public class validateUID extends Base1
{
	@BeforeClass
	
	public void launchBrowser()
	{
		launchApp();
		
	}
	
	
	
	@BeforeMethod
	//public void loginToKiteApp() throws EncryptedDocumentException, IOException
	
//	{
//	login.sendUserID(Utility.readDataFromExcel(0, 0));
//	login.sendPassword(Utility.readDataFromExcel(0, 1));
//	login.clickOnLoginButton();
//	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//	pin.sendPin(Utility.readDataFromExcel(0, 2));
//	pin.clickOnContineButton();
//	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//	}
	
  @Test
  public void validation()
  
  {
		String TCID="1234";
//		Assert.assertEquals(home.getActualUserID(), 
//		Utility.readDataFromExcel(0, 0),"TC failed actual and Expected User ID Not matching");
//		Utility.captureScreenShot(driver, TCID);
		
  }
		
		@AfterMethod
		public void LogOutFromKiteApp() throws InterruptedException
		{
	//	home.clickOnLogOutButton();
		}
		@AfterClass
		public void closeBrowser()
		{
		driver.close()	;  
  }
}
