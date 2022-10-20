package day15TestNGExample;

import org.testng.annotations.Test;

public class Example_Annotations4 {
  @Test(invocationCount=5)
  public void param1() {
	  System.out.println("Hello, I am TC8  from Example_param1 class");
  }
}
/**
 *if testing class contains more dn one test method dn all the test method will be executed in 
 *Alphabetical order
 *1. if you want to run test certain interval of time so in that time we can use invocationCount 
 */
 
