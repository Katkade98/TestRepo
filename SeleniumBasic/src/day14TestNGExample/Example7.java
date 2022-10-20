package day14TestNGExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import day9.KeyboardAndMouseOperation.SeleniumUtility;
///here we use inheritance concept
public class Example7 extends SeleniumUtility {
  @Test
  public void LoginLogoutInActitimeApplication() {
	 SeleniumUtility s1=new SeleniumUtility ();
	 WebDriver driver=SetUp("chrome","https://demo.actitime.com/login.do");
	 System.out.println("Before login page title:"+driver.getTitle());
	 //identify the required element from the UI and perform required action
	 //1.by using with the help of locator 
	WebElement element= driver.findElement(By.name("username"));
	//validate username filed display or not 
	Assert.assertTrue(element.isDisplayed());
	 //2.by Utility
	 typeInput(element,"admin");
	 //or
	 //typeInput(driver.findElement(By.name("username")),"admin");
	 
	//Identify the required element from the UI and perform reuired action
	 //1.by using locator 
	// driver.findElement(By.name("pwd")).sendKeys("manager");
	 //2. By using utility method 
	 typeInput(driver.findElement(By.name("pwd")),"manager");
	 
	 //Identify the required element from the UI and perform required action
	 //1.by using locator 
	// driver.findElement(By.id("loginButton")).click();
	 //2. with utility
perfromClick(driver.findElement(By.id("loginButton")));
//Click on LogOut Button

WebElement logOut=driver.findElement(By.id("logoutLink"));
//Explicit wait
WebDriverWait wait=new WebDriverWait(driver,30);
wait.until(ExpectedConditions.elementToBeClickable(logOut));
System.out.println("after login page title:"+getPageTitle());
//if (getPageTitle().equals(""))
//{
//	System.out.println("passed");
//}
//else
//{
//	System.out.println("fail...");
//}
//validate using TestNg
Assert.assertEquals(getPageTitle(),"actiTIME - Enter Time-Track"); 
perfromClick(logOut);
Assert.assertEquals(getPageTitle(), "actiTIME - Login","login page validation faill");
//login page validation 
driver.close();
  }
}
