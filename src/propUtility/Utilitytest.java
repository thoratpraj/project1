package propUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;



import net.bytebuddy.utility.RandomString;

public class Utilitytest 
{
	
	public static String readDataFromProp(String key) throws IOException
	{
		
		Properties pp=new Properties();
		
		FileInputStream myFile=new FileInputStream("C:\\Users\\Suddu\\eclipse-workspace\\9th_apr_even_selenium\\myProperty.properties");
		
		pp.load(myFile);
		

		String value = pp.getProperty(key);
		
		return value;
		
	}
//	public static void snapsot(WebDriver driver,String TCID) throws IOException
//	{
//		
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		
//	
//		File dest=new File("C:\\Users\\Suddu\\Desktop\\Prajakta-Software Testing\\seleniumstudy\\Screenshot & iframe\\SCREENSHOT\\TC"+TCID+".png");
//		
//		FileHandler.copy(src, dest);
//		
//		Reporter.log("screenshot is taken",true);
//		
//	}

	
	}
	

