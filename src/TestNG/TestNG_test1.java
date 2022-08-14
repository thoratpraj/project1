package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_test1 {
  @Test
  public void demo1 () 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
	  
  }
}
