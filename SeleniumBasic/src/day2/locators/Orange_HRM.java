package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orange_HRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Open chrome browser
//		Enter App url as https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
//		Validate login page
//		Enter user name as Admin
//		Password as admin123
//		Click on login button
//		Validate home page
		
//******************************************
//Step:1 Open Chrome Browser
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//*******************************************
//Step:2 Validate login page
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
String  ActualURL=driver.getCurrentUrl();
String  ExpectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
 if (ActualURL.equals(ExpectedURL))
 {
	 System.out.println("Login page validation done");
 }
 else
 {
	 System.out.println("login page validation fail");
 }
// WebDriverWait wait=new WebDriverWait(driver,30);
 //wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
 //******************************************
 //Step3: Enter user name as Admin
 WebElement username=driver.findElement(By.name("username"));//.sendKeys("Admin");
 username.sendKeys("Admin");
 //Step4. Enter user name as admin123
 driver.findElement(By.name("password")).sendKeys("admin123");
 
 driver.findElement(By.tagName("button")).click();
 //Step 5. Validate the homepage
 //Not work why?
 String actualtitle=driver.getTitle();
 String Expectedtitle="OrangeHRM";
 System.out.println("actualtitle:"+actualtitle);
 System.out.println("Expectedtitle:"+Expectedtitle);
 if (actualtitle.equals(Expectedtitle))
 {
	 System.out.println("homepage validation done");
 }
 else
 {
	 System.out.println("homepage validation fail");
 }
 driver.findElement(By.className("oxd-userdropdown-img")).click();
 driver.findElement(By.linkText("Logout")).click();

	}

}
