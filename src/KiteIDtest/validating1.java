package KiteIDtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validating1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		WebElement userId = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		userId.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		loginButton.click();
		
		Thread.sleep(1000);
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("982278");
		ContinueButton.click();
		
		Thread.sleep(200);
		
		WebElement UID = driver.findElement(By.className("user-id"));
		
		String ExpectedID="ELR321";
		String ActualID= UID.getText();
		
		if (ExpectedID.equals(ActualID)) 
		{
			System.out.println("test case is passed");
		}

		else {
			System.out.println("test case is failed");
		}
		
		Thread.sleep(200);
		UID.click();
		
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		
		driver.close();
		
		
	}

}
