package popups;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowsePopup {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//input[@value='New Window']")).click();
	
	//String idofmainwindow = driver.getWindowHandle();

	//System.out.println(idofmainwindow);
	
	Set<String> ids = driver.getWindowHandles();
	
	System.out.println(ids);
	
	ArrayList<String> al=new ArrayList<>(ids);
	
	String idofmainwindow = al.get(0);
	String idofchildwindow = al.get(1);
	
	
	driver.switchTo().window(idofchildwindow);
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("the7-search")).sendKeys("hi child browse popup");
	
	
	
	

		

	}

}
