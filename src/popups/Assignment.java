package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		
		Set<String> idofallwindows = driver.getWindowHandles();
		
		System.out.println(idofallwindows);
		
		ArrayList<String> al=new ArrayList<>(idofallwindows);
		
		String idofmainwindow = al.get(0);
		String idofpracticepage = al.get(1);
		
		driver.switchTo().window(idofpracticepage);
	
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		

	}

}
