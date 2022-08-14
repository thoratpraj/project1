package popups;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Hidden1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		driver.findElement(By.name("q")).sendKeys("redmi note pro 10");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random=RandomString.make(3);
		
		File des= new File("C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\seleniumstudy\\Screenshot & iframe\\SCREENSHOT\\snapshot"+random+".png");
		FileHandler.copy(src, des);
		
	}

}
