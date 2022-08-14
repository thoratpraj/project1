package TestNGkeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutStudy 

{
	 @Test(timeOut = 100)
	  public void a() throws InterruptedException 
	  
	  {
		// Thread.sleep(1000);
		  Reporter.log("i am A method",true);
		  
	  }
	  
	  @Test (priority = -1)
	  public void b() 
	  
	  {
		  Reporter.log("i am B method",true);
		  
	  }
	  
	  @Test(timeOut = 100)
	  public void c() throws InterruptedException 
	  
	  {
		//  Thread.sleep(1000);
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
