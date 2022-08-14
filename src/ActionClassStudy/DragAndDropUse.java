package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropUse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Actions act=new Actions(driver);
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(1000);
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		
		
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		act.dragAndDrop(src, dest).perform();
		
		
		//or
		
	//	act.clickAndHold(src).moveToElement(dest).release().build().perform();
		
		

		
		
		
		

	}

}
