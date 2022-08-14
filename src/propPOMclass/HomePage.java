package propPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{


	@FindBy(className = "user-id")private WebElement ActualID;
	@FindBy(xpath = "//a[@target='_self']")private WebElement LogoutButton;
	
	
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public String getUserID()
	{
		String UserID = ActualID.getText();
		return UserID;
	}
	
	
	
	
	
	
	
	
	
	
	
	

//	public void ValiateUserId()
//	{
//		String ExpectedUserId="ELR321";
//		String ActualUSerId=ActualID.getText();
//		
//		if (ExpectedUserId.equals(ActualUSerId))
//		
//		{
//			System.out.println("test case is passed");
//			
//		}
//		
//		else
//			
//		{
//			System.out.println("test case is failed");
//		}
//		
//	}
		public void ClickOnLogoutButton() throws InterruptedException
		{
			ActualID.click();
			
			Thread.sleep(100);
			
			LogoutButton.click();
		}
	

}
