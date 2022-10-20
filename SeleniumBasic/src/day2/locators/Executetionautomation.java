package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Executetionautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Launch a new firefox browser.
//		Open https://demosite.executeautomation.com/Login.html
//		Get Page Title name and Title length
//		Print Page Title and Title length on the Eclipse Console.
//		Get Page URL and verify if it is a correct page opened
//		Enter username as “execution”
//		Enter password as “admin”
//		Click on login button
//		Get the page title and current URL, print on console
//		Click on logout
//		Close the Browser.
//**********************************************		
		//Step 1.Launch the chrome browser
     System.setProperty("webdriver.edge.driver",".\\executables\\msedgedriver.exe");
     WebDriver driver=new EdgeDriver();
     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//***********************************************
   // Step 2.Open URL
     driver.get("https://demosite.executeautomation.com/Login.html");     
//*************************************************
  // step 3.page title and title length
     String actualtitle= driver.getTitle();
     System.out.println("print the title:"+actualtitle);
    System.out.println("Title length:"+actualtitle.length());
//***************************************************
// Step 4.Get Page URL and verify if it is a correct page opened
   String ActualURL= driver.getCurrentUrl();
   String ExpectedURL="https://demosite.executeautomation.com/Login.html";
   System.out.println("actual url:"+ActualURL);
   if(ActualURL.equals(ExpectedURL))
   {
	   System.out.println("login page validation done");
   }
   else
   {
	   System.out.println("login page validation fail....");
   }
 //Step 5.Enter username as “execution”
   WebElement userNameField=driver.findElement(By.name("UserName"));
   userNameField.sendKeys("execution");
   //Step 6.Enter username as "admin"
   WebElement userPasswordField=driver.findElement(By.name("Password"));
   userPasswordField.sendKeys("admin");
//******************************************
   // click on login button
  driver.findElement(By.cssSelector("input[name='Login']")).click();
  
  driver.findElement(By.cssSelector("input#Initial")).sendKeys("shubham");
  driver.findElement(By.cssSelector("select#TitleId")).sendKeys("Mr");
  driver.findElement(By.cssSelector("input[name=\'FirstName\']")).sendKeys("shubham");
  driver.findElement(By.cssSelector("input[name=\'MiddleName\']")).sendKeys("Katkade");
  driver.findElement(By.cssSelector("input[type=\'button\']")).click();
  
  
   
	}

}
