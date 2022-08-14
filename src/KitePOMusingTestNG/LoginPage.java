package KitePOMusingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	@FindBy(id="userid")private WebElement UserID;
	@FindBy(id="password")private WebElement Password;
	@FindBy(xpath= "//button[@type='submit']")private WebElement LoginButton;
	
	public LoginPage(WebDriver driver)
	{
		 PageFactory.initElements(driver,this);
	}
	
	
	public void sendUserId(String UID)
	{
		UserID.sendKeys(UID);
	}
	
	public void sendPassword(String PWD)
	{
		Password.sendKeys(PWD);
	}
	
	public void clickOnLoginButton()
	{
		LoginButton.click();
	}
	
	
	
	

}
