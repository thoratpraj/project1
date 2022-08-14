package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
  @Test
  public void myMethod() 
  {
	  String a= "Prajakta";
	  String b="Shiv";
	  String c="Shiv";
	  String g=null;
	  boolean d=true;
	  boolean e=false;
	  
	  SoftAssert soft =new SoftAssert();
	  
	  soft.assertEquals(b, c,"String is not equal");
	  
	  soft.assertNotEquals(a, c,"string is equal");
	  
	  soft.assertTrue(d, "it is not true TC failed");
	  
	  soft.assertFalse(e, "test case failed value is true");
	  
	  soft.assertNull(g, "given value is not null");
	  
	  soft.assertNotNull(a, "given value is null");
	  
	  soft.assertAll();
	  
	  
	  
	  
	  
	  
  }
}
