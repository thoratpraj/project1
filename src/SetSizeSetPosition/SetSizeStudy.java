package SetSizeSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeStudy {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		System.out.println(driver.manage().window().getSize());
		
		Dimension d=new Dimension(700, 500);
		
		driver.manage().window().setSize(d);
		
		
		
		
	}

}
