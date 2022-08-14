package TestNGkeyword;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestNGListener.Listener.class)


public class DependsOnMethod_Study 


{
	 @Test(dependsOnMethods  = {"b"})
	  public void a()      //skip : depends on B....but b method is fail
	  
	  {
		  Reporter.log("i am A method",true);
		  
	  }
	  
	  @Test (timeOut = 100)
	  public void b() throws InterruptedException, IOException 
	  
	  {
		  Thread.sleep(1000);
		  Reporter.log("i am B method",true);
		  
		  
	
		  
	  }
	  
	  @Test
	  public void c() 
	  
	  {
		  
		  Reporter.log("i am C method",true); 
	  }
	  
	  @Test
	  public void d() 
	  
	  {
		  
		  Reporter.log("i am D method",true); 
	  } 
	  
	  @Test
	  public void e() 
	  
	  {
		  Reporter.log("i am E method",true); 
		  
	  }
	  
}
