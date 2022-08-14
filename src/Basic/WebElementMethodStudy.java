package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodStudy {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		 Thread.sleep(2000);
			
		
		driver.findElement(By.id("email")).sendKeys("Prajakta");
		
		
		driver.findElement(By.id("pass")).sendKeys("xyz");
		
		Thread.sleep(2000);
		
		WebElement icon = driver.findElement(By.xpath("//div[contains(@id,'u_0_4_')]"));
	 
		
		boolean result = icon.isEnabled();
	
	System.out.println("icon is selected "+result);
	

	if(result)
	 {
		 System.out.println("password is displayed "+result);
	 }		 
 
	else {
		 
		 System.out.println("password is not display click on icon");
		} 
		
		 
		 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		 
		 Thread.sleep(10000);
	
		// driver.findElement(By.xpath("//input[@value='1']")).click();
		 
		 
		 
		// Thread.sleep(2000);
			
	
	
	
	
	
	
	
	
	
	
	
 		
	
	
	
		 
	
	 
		 
	 
		
	}
}
