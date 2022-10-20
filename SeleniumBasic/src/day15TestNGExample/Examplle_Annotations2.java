package day15TestNGExample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Examplle_Annotations2 {
	@BeforeMethod
	public void openBrowser()
	{
		System.out.println("chrome browser opened and app URL is entered...");
	}
	
  @Test(priority =1)
  public void VerifyLogin() {
	  System.out.println("Successfully Login...");
  }
  @AfterMethod
  public void closeBrowser()
  {
	  System.out.println("Browser instance is close...");
  }
  @Test(priority=2)
  public void createTask()
  {
	  System.out.println("Task created Successfully");
  }
}
/**
 * @BeforeMethod /@AfterMethod-->it gets executed for each and every 
 * @Test method  
 */
  
