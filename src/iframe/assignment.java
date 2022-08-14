package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Suddu\\\\Desktop\\\\Prajakta-Software Testing\\\\Automation\\\\SeleniumTool\\\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver\r\n");
		
		driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
		
	
		
		Thread.sleep(100);
		
		driver.switchTo().frame("frame1");
		
		WebElement topicname = driver.findElement(By.tagName("input"));
		topicname.sendKeys("HI");
				
		driver.switchTo().frame("frame3")	;
		
	WebElement checkbox = driver.findElement(By.id("a"));
		
		checkbox.click();
		
		boolean check = checkbox.isSelected();
		
		System.out.println("check box is selected "+check);
		
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("frame2");
		
		
		WebElement select = driver.findElement(By.id("animals"));
		
		Select s=new Select(select);
		
		s.selectByIndex(1);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame1");
		
		topicname.clear();
		
		topicname.sendKeys("Welcome");
		
		driver.switchTo().frame("frame3")	;
		
		WebElement c = driver.findElement(By.id("a"));
		
		c.click();
		boolean clicked = c.isSelected();
		
		System.out.println("check box is selected "+clicked);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
