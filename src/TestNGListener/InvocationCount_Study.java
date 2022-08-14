package TestNGListener;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount_Study

{
  @Test (invocationCount = 5)
  
  public void myMethod()
  {
	  Reporter.log("my method is runnung", true);
	  
  }
  
  @Test(invocationCount = 3)
  
  public void demo()
  {
	  Reporter.log("demo is running", true);
  }
}
