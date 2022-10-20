package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//Open chrome browser
//		Enter App url as https:https://www.saucedemo.com/
//			Validate login page
//			Enter user name as standard_user
//			Password as secret_sauce
//			Click on login button
//			Validate home page
	  //Step 1.Set the chrome browser
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	  //Step 2.Validate the login page
	   driver.get("https://www.saucedemo.com/");
	   String actualurl=driver.getCurrentUrl();
	   String expectedurl="https://www.saucedemo.com/";
	   if (actualurl.equals(expectedurl))
	   {
		   System.out.println("login page validation done");
	   }
	   else
	   {
		   System.out.println("login page validation fail... ");
	   }
//*****************************	      
	  // Step 3.Enter the username
	   WebElement userNameField=driver.findElement(By.id("user-name"));
	   userNameField.sendKeys("standard_user");
//*******************************
	   // Step 4. Enter the password
	  WebElement userPassWord=driver.findElement(By.id("password"));
	  userPassWord.sendKeys("secret_sauce");
//******************************
	  // Step 5. click on login button
	 WebElement userLogin= driver.findElement(By.id("login-button"));
	userLogin.click();
//     WebDriverWait wait=new WebDriverWait(driver,30);
//     wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));
	// wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
//******************************
	//Step 6. validation of homepage
	String actualtitle=driver.getTitle();
	String expectedtitle="Swag Labs";
	if (actualtitle.equals(expectedtitle))
	{
	System.out.println("home page validation done");
	}
	else
	{
		System.out.println("home page validation fail...");
	}
	//log out
   Thread.sleep(3000);
	driver.findElement(By.id("react-burger-menu-btn")).click();
Thread.sleep(3000);
	driver.findElement(By.id("logout_sidebar_link")).click();
	//driver.close();
	
	}

}
