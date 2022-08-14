package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveElementStudy {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//to take mouse actions,need to create object of action class and pass webdriver obj. as parameter
		
		Actions act=new Actions(driver);
		
			//====[1]=====move to element before find element to be act
		
		WebElement au = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		
		//au.click();      //using web element  method

		act.click().perform();
		
		//now take a action and perform
		
		act.moveToElement(au).perform();
		

	}

}
