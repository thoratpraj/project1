package KiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestClass {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		KiteLoginPage login=new KiteLoginPage(driver);
		
		login.sendUserId();
		login.sendPassword();
		login.clickOnLoginButton();
		
		Thread.sleep(1000);
		
		KitePinPage pin=new KitePinPage(driver);
		pin.sedPin();
		pin.ContinueButton();
		
		Thread.sleep(1000);
		
		KiteHomePage home=new KiteHomePage(driver);
		
		home.ClickOnLogoutButton();
		
		Thread.sleep(100);
		
		driver.close();
	}

}
