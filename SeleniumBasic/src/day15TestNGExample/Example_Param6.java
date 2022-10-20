package day15TestNGExample;

import org.testng.annotations.Test;

public class Example_Param6 {
  @Test(dependsOnMethods="signIn",enabled=true)
  public void login() {
	  System.out.println("Hello, I am login  from Example_param1 class");
	  
  }
  @Test(dependsOnMethods="login",enabled=true,timeOut=2000)
  public void homePage()
  
  {
	System.out.println("Welcome to homepage "); 
	try
	{
		Thread.sleep(3500);
	}
	catch(InterruptedException e){
		e.printStackTrace();	
	}
  }
  @Test(enabled=true,expectedExceptions=ArithmeticException.class)
  public void signIn()
  {
	  System.out.println("Hello, I am signin from Example_param1 class");
	  int i=10/0;
	  
  }
}
