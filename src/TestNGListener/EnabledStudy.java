package TestNGListener;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledStudy
{
 
  @Test(enabled = false)
  public void a() 
  
  {
	  Reporter.log("i am A method",true);
	  
  }
  
  @Test (priority = -1)
  public void b() 
  
  {
	  Reporter.log("i am B method",true);
	  
  }
  
  @Test(priority = 1)
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
