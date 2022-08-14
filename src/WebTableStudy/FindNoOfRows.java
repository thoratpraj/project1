package WebTableStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNoOfRows {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));	
		
		System.out.println("no.of.rows in the table "+rows.size());
		
		
		List<WebElement> header = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
		
		System.out.println("no.of columns or header in the table "+header.size());
		
		
		for(WebElement h:header)
		{
			System.out.print(h.getText()+" ");
			
			
		}
		System.out.println();
		
		for(WebElement r:rows)
		{
			System.out.println(r.getText());
		}

	}

}
