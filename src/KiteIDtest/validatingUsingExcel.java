package KiteIDtest;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validatingUsingExcel {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\Automation\\SeleniumTool\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
//		File myfile= new File("D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\9thAprEvenTest.xlsx");

	//	Sheet mySheet = WoorkBookFactory.create(myfile).getSheet("Sheet1");
		
//		String UID = mySheet.getRow(0).getCell(0).getStringCellValue();
//		String PWD = mySheet.getRow(0).getCell(1).getStringCellValue();
//		String PIN = mySheet.getRow(0).getCell(2).getStringCellValue();
//		
		
		
		WebElement userId = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
//		userId.sendKeys(UID);
//		password.sendKeys(PWD);
//		loginButton.click();
		
		Thread.sleep(1000);
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
//		pin.sendKeys(PIN);
		ContinueButton.click();
		
		Thread.sleep(200);
		
		WebElement uid = driver.findElement(By.className("user-id"));
		
		String ExpectedID="ELR321";
		String ActualID= uid.getText();
		
		if (ExpectedID.equals(ActualID)) 
		{
			System.out.println("test case is passed");
		}

		else {
			System.out.println("test case is failed");
		}
		
		Thread.sleep(200);
		uid.click();
		
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		
		driver.close();
		
		
		
		
		
		
		
	}

}
