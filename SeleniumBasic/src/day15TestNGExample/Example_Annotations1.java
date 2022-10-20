package day15TestNGExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example_Annotations1 {
  @BeforeTest
  public void openBrowser() {
	  System.out.println("Chrome browsr opened and app URL is entered");
  }
  @Test(priority=1)
  public void verifyLogin()
  {
	  System.out.println("Successfully  login....");
  }
  @AfterTest
  public void closeBrowser()
  {
	  System.out.println("Browser instance is close");
  }
  @Test(priority=2)
  public void createTask()
  {
	  System.out.println("Task created Successfully ");
  }
}
/**
 * BeforeTest /@AfterTest -->>behalf of all the @Test method executed only once
 *  either in the starting or the end 
 *   
 */
  
