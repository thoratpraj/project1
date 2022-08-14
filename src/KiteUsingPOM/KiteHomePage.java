package KiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	
	@FindBy(className = "user-id")private WebElement ActualID;
	@FindBy(xpath = "//a[@target='_self']")private WebElement LogoutButton;
	
	
	public  KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void ValiateUserId()
	{
		String ExpectedUserId="ELR321";
		String ActualUSerId=ActualID.getText();
		
		if (ExpectedUserId.equals(ActualUSerId))
		
		{
			System.out.println("test case is passed");
			
		}
		else
		{
			System.out.println("test case is failed");
		}
		
		
	}
	
	
	
	public void ClickOnLogoutButton() throws InterruptedException
	{
		ActualID.click();
		
		Thread.sleep(100);
		
		LogoutButton.click();
	}
	
	
	
	
	
	
	

}
