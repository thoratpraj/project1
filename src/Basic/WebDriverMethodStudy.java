package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodStudy 
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(100);
		
	
	//	driver.close();
		
	//	Thread.sleep(100);
		
	//	driver.quit();
		
	//	Thread.sleep(100);
		
	//	driver.manage().window().maximize();
		
	//	Thread.sleep(1000);
		
	//	driver.manage().window().minimize();
		
	//	Thread.sleep(100);
		
		driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(200);
			
		driver.navigate().back();
		
		Thread.sleep(200);
		
		driver.navigate().forward();
		
		Thread.sleep(200);
		
		driver.navigate().refresh();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
	}

}
