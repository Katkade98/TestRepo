package day7.Xpath;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Set the required browser path
		System.setProperty("webdriver.edge.driver",".\\executables\\msedgedriver.exe");
//Create the instance of edge browser 
	WebDriver driver=new EdgeDriver();
//implicit wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get the respective URL
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
WebDriverWait wait=new WebDriverWait(driver,30);
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@ type=\"submit\"]")));
WebElement userName=driver.findElement(By.xpath("//input[@ name=\"username\"]"));
userName.sendKeys("Admin");
//forgot password is display or not 
WebElement forgotPassword=driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]"));
System.out.println("forgotPassword Display or not:"+forgotPassword.isDisplayed());
//Enter password
driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
//Click on login button
WebElement loginButton=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
System.out.println(loginButton.getCssValue("Color"));
loginButton.click();
//click on add button
driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
//first Name
driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active orangehrm-firstname\"]")).sendKeys("shubham");
driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active orangehrm-middlename\"]")).sendKeys("sharad ");
//Enter last name
driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active orangehrm-lastname\"]")).sendKeys("sanap");
WebElement switchbutton=driver.findElement(By.xpath("//span[@class=\"oxd-switch-input oxd-switch-input--active --label-right\"]"));
System.out.println("switchbutton selected or not :"+switchbutton.isSelected());
Wait wait1=new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
switchbutton.click();
//WebElement switchbuttonOn=driver.findElement(By.xpath("//span[@class=\"oxd-switch-input oxd-switch-input--active --label-right\"]"));
//System.out.println("SwitchButton is select or not :"+switchbuttonOn.isSelected());
driver.findElement(By.xpath("//li[@class=\"--active oxd-userdropdown\"]")).click();
driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();
	}

}
