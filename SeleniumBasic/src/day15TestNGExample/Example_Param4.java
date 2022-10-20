package day15TestNGExample;

import org.testng.annotations.Test;

public class Example_Param4 {
  @Test(dependsOnMethods="signin",enabled=true )
  public void login() {
	  System.out.println("Hello, login  from example_param1 class");
  }
  @Test(enabled=true,dependsOnMethods="login")
  public void checkOutNotification()
  {
	  System.out.println("Hello, I am checkOutNotification method from Example_param1 class");
  }
  @Test(enabled=true)
  public void signin()
  {
	  System.out.println("Hello, I am signin method of Example_Param1 class");
      int i=10/5;
  }
}
