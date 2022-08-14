package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListAndDropDown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://vctcpune.com/selenium/practice.html");
	
	Thread.sleep(200);
		
	WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
	
	Select s=new Select(listbox);
	
	
	
	}

}

