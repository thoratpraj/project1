package TestNG_Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1
{
	protected WebDriver driver;
	public void launchApp() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32 (1)\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		
	}

}
