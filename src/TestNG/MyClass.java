package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass {
  @Test
  public void test()
  {
	
	  System.out.println("hi am printing statement");
	  
	 Reporter.log("hi am written in reporter with boolean", true);
	 
	 Reporter.log("hi am reporter without boolean");
	  
	  
	  
	  
	  
	  
  }
}
