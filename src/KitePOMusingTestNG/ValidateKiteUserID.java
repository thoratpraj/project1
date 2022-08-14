package KitePOMusingTestNG;

import java.io.File;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteUserID
{
	File myfile;
	WebDriver driver;
	LoginPage login;
	PinPage pin;
	HomePage home;
	Sheet mySheet;

	
	@BeforeClass  
  public void launchBrowser() 
  
  {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32 (1)\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		
		
		driver.get("https://kite.zerodha.com/");
		
//	 myfile= new File("D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\9thAprEvenTest.xlsx");

	// mySheet = WoorkBookFactory.create(myfile).getSheet("Sheet1");
	  
	  login=new LoginPage(driver);
	  pin=new PinPage(driver);
	  home=new HomePage(driver);
	  
//	 @BeforeMethod
//	  public void LoginToKite()
	  
	  
	  {
//		login.sendUserId(mySheet.getRow(0).getCell(0).getStringCellValue());
//		login.sendPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
//		login.clickOnLoginButton();
//		pin.sendPin(mySheet.getRow(0).getCell(2).getStringCellValue());
//		pin.clickOnContinueButton();
//		
	  
		  
	  }
//	  @Test
//	  
//	  public void ValidateUserID()
//	  {
		
//		  String expectedUserID = mySheet.getRow(0).getCell(0).getStringCellValue();
		  String ActualUID = home.getUserID();
		  
//		  Assert.assertEquals(expectedUserID, ActualUID,"TC is Failed Actual and expected value are not matching");
		  
		  
	  }
	  @AfterMethod
	  public void ClickOnLogoutButton() throws InterruptedException
		{
//			ActualID.click();
//			
//			Thread.sleep(100);
//			
//			LogoutButton.click();
//		}
	  
//	  @AfterClass
//	  public void closeBrowser()
//	  
	  {
		  driver.close();
		  
	  }
	  
	  
	  
	  
	  
  }
  
  
  
}
