package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//driver.findElement(By.id("alertBox")).click();
		
		driver.findElement(By.id("confirmBox")).click();
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		//alt.accept();
		
		alt.dismiss();
		//System.out.println(alt.getText());
		
	
		
		
	}

}
