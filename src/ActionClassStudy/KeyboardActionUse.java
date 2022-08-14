package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionUse {

	public static void main(String[] args) throws InterruptedException {
	
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Actions act=new Actions(driver);
		
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.className("_97w5")).click();
		
		driver.findElement(By.id("day")).click();
		
	
		
		for(int i=0;i<=9;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			
			Thread.sleep(1000);
		}
		
		WebElement month = driver.findElement(By.id("month"));
		
		act.click(month).perform();
		
		for(int i=0;i<=3;i++)
		{
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(1000);
		
		}
		
		WebElement year = driver.findElement(By.id("year"));
		
		act.click(year).perform();
		
		for(int i=0;i<=27;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
