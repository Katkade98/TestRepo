package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		open a chrome browser
//		enter vtiger application url- https://demo.vtiger.com/vtigercrm/index.php
//		validation login page open or not
//		remove existing text from username field
//		type username as 'admin'
//		remove existing text from password field
//		type password as 'Test@123'
//		click on login button
//**************************************
	//Step 1. Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//***********************************
	//Step 2. Get URL and validate logine page open or not
        driver.get("https://demo.vtiger.com/vtigercrm/index.php");
        String Actualurl=driver.getCurrentUrl();
        String Expectedurl="https://demo.vtiger.com/vtigercrm/index.php";
        if(Actualurl.equals(Expectedurl))
        {
        	System.out.println("login page done");
        }
        else
        {
        	System.out.println("login page fail");
        }
//***********************************
    // Step 3. remove the Username and password 
        driver.findElement(By.id("username")).clear(); 
        driver.findElement(By.name("password")).clear();
//****************************************
     //Step 3.Write the user name and password as admin
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("Test@123");
 //*************************************
        //Step 5 click on login button
        driver.findElement(By.className("button")).click();
        String actualTitle=driver.getTitle();
        System.out.println("actualTitle:"+actualTitle);
        String ExpectedTitle="Dashboard";
        System.out.println("ExpectedTitle:"+ExpectedTitle);
      
       // step 5homepage validation
        if (actualTitle.equals(ExpectedTitle))
        {
        	System.out.println("validation done ");
        }
        else
        {
        	System.out.println("validation fail");
        }
        //Step.6 click on logout button
        //Not work why ?
        //  driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
        
	}

}
