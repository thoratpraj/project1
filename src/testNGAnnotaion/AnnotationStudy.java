package testNGAnnotaion;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void validateUserID() 
  {
	  Reporter.log("validation done", true);
  }
  
  @BeforeMethod
  
  public void login()
  {
	  Reporter.log("login done", true);
  }
  
  @Test
  
  public void abc()
  {
	  Reporter.log("abc method", true);  
  }
  
  @AfterMethod
  
  public void logout()
  {
	  Reporter.log("logout done", true); 
  }
  
  @BeforeClass
  
  public void a()
  {
	  Reporter.log("Beforeclass ", true);
  }
  
  @AfterClass
  
  public void b()
  {
	  Reporter.log("Afterclass", true);
  }
  
  @BeforeTest
  
  public void c()
  {
	  Reporter.log("Beforetest", true);
  }
  
  @AfterTest
  
  public void d()
  {
	  Reporter.log("Aftertest", true); 
  }
}
