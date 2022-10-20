package day15TestNGExample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example_Annotations3 {
	@BeforeMethod
	public void openBrowser()
	{
		System.out.println("Open Browser URL...");
	}
	
  @Test(priority=1)
  public void verifyLogin() {
	  System.out.println("Login Successfully ");
  }
  @BeforeTest
  public void openBrowser1()
  {
	  System.out.println("Before browser open");
  }
  @Test(priority=0)
  public void homePageValidation()
  {
	  System.out.println("homepage validation");
  }
  @AfterMethod
  public void logout()
  {
	  System.out.println("Logout done ");
	  
  }
  @AfterTest
  public void logout1()
  {
	  System.out.println("after logout");
  }
}
