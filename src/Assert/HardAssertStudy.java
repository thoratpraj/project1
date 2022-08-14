package Assert;


import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertStudy {
  @Test
  public void myMethod()
  {
	  
	  String a= "Prajakta";
	  String b="Shiv";
	  String c="Shiv";
	  String g=null;
	  boolean d=true;
	  boolean e=false;
	  
	  
	  
	  Assert.assertEquals(c, b,"taste case is failed");
	  
	  Assert.assertNotEquals(a, b," a and b are not equals TC is failed");
	  
	  Assert.assertTrue(d, "it is not true TC failed");
	  
	  Assert.assertFalse(e, "test case failed value is true");
	  
	  Assert.assertNull(g, "given value is not null");
	  
	  Assert.assertNotNull(a, "given value is null");
	  
	//  Assert.fail();
	  
  }
}
