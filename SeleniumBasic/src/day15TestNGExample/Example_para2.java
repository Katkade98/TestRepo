package day15TestNGExample;

import org.testng.annotations.Test;

public class Example_para2 {
  @Test(priority=1)
  public void login() {
	  System.out.println("Hello, I am Login from Example_param1 class");
  }
  @Test(priority =2)
  public void sendEmail()
  {
	  System.out.println("Hello, I am sendEmail from Example_Param1 class");
  }
  @Test(priority=3)
  public void logOut()
  {
	  System.out.println("Hello, I am  logOut from Example_Param1");
  }
}
/**
 * By default each @Test has priority as 0
 * lowest priority will get executed first
 */
 
