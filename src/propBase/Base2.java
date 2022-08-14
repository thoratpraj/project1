package propBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import propUtility.Utilitytest;

public class Base2 

{
	protected static WebDriver driver;
	public void launchBrowser() throws IOException
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32 (1)\\chromedriver.exe");
	
	 driver=new ChromeDriver();
	
	driver.get(Utilitytest.readDataFromProp("URL"));
	
	Reporter.log("kite launched",true);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	
	}
	
	public static void snapsot(String TCID) throws IOException
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
	
		File dest=new File("C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\seleniumstudy\\Screenshot & iframe\\SCREENSHOT\\TC"+TCID+".png");
		
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
		Reporter.log("screenshot is taken",true);
		
	}
}
