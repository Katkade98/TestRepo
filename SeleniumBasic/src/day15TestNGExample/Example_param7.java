package day15TestNGExample;

import org.testng.annotations.Test;

public class Example_param7 {
  @Test(description="checking login functinality of actitime application")
  public void login() {
	  System.out.println("login successfully done ");
  }
  @Test(description="checking logOut functinality of actitime application")
  public void signin()
  {
	  System.out.println("signin Successfully done ");
  }
}
/**
 if testing class contain more than one testing method dn all the test method will be executed in alphabetical order
 */

