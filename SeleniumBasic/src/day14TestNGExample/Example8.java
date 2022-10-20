package day14TestNGExample;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import day9.KeyboardAndMouseOperation.SeleniumUtility;

public class Example8 {
  @Test
  public void LoginLogoutInActiTimeApplication() {
SeleniumUtility s1=new SeleniumUtility();
WebDriver driver=s1.SetUp("chrome","https://demo.actitime.com/login.do");
System.out.println("Before logine page title validation:"+driver.getTitle());
//find the username button

  }
}
