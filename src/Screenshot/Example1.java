package Screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

		
		public static void main(String[] args) throws IOException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File dest=new File("C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\seleniumstudy\\Screenshot & iframe\\SCREENSHOT\\snapshot.png");
			
			org.openqa.selenium.io.FileHandler.copy(src, dest);
	}

}
