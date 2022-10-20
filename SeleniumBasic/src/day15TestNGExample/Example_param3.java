package day15TestNGExample;

import org.testng.annotations.Test;

public class Example_param3 {
  @Test(enabled=false)
  public void openBrowser() {
	  System.out.println("Browser should open");
  }
  @Test(enabled=true)
  public void loginPage()
  {
	  System.out.println("login successfully ");
  }
  @Test(enabled=true, priority=2)
  public void logOut()
  {
	  System.out.println("logOut page");
  }

}
/**
 * By default for @Test, enabled  is set to enabled =true 
 * enabled =true -->consider for execution
 * enabled =false -->don't consider for execution
 * 
 */

