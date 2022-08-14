package TestNGkeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityStudy
{
  @Test(groups = {"sanity"})
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
  
  @Test(priority = -2)
  public void d() 
  
  {
	  
	  Reporter.log("i am D method",true); 
  } 
  
  @Test(groups = {"regression"})
  public void e() 
  
  {
	  Reporter.log("i am E method",true); 
	  
  }
  
}
