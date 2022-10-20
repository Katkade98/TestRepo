package day3.browseroperations;


import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOp1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//create the  file path by using System class
 String Chromepath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
 // set the required browser executable file path
   System.setProperty("webdriver.chrome.driver", Chromepath);
   //Create the instance of required browser
   WebDriver driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   //maximize the window
   Thread.sleep(3000);
   driver.manage().window().maximize();
   //set browser windows size
   driver.manage().window().setSize(new org.openqa.selenium.Dimension(500, 500));
   //again maximize the size of window
   
   driver.manage().window().maximize();
   
   //get the repective URL
   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   // enter user name and password
//   driver.findElement(By.name("username")).sendKeys("Admin");
 //  driver.findElement(By.name("password")).sendKeys("admin123");
   //login page
 //  driver.findElement(By.className("oxd-button")).click();
   //click on forgot password button
   driver.findElement(By.className("orangehrm-login-forgot-header")).click();
   Thread.sleep(3000);
   //come back to the previous page
   driver.navigate().back();
   Thread.sleep(2000);
   //come aganin in forward page
   driver.navigate().forward();
   //refresh current page
   Thread.sleep(3000);
   driver.navigate().refresh();
   Thread.sleep(3000);
   driver.navigate().to("http://www.google.com");
   
	}

}
