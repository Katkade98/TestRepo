package day15TestNGExample;

import org.testng.annotations.Test;

public class Example_param5 {
  @Test(dependsOnMethods="signin",enabled=true)
  public void login() {
	 System.out.println("login successfilly ");
  }
  @Test(dependsOnMethods="login",enabled=true)
  public void welcomeToHomepage()
  {
	  System.out.println("Welcome to homepage");
  }
  @Test(enabled=true,expectedExceptions=ArithmeticException.class)
  public void signin()
  {
	  System.out.println("signin page done");
	  int a=10/0;
	  System.out.println("SignIn is completed");//won't get executed due to exception at line number 19
  }
}

 
