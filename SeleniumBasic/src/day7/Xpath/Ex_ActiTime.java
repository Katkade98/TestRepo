package day7.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex_ActiTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Set the browser Executable path
System.setProperty("webdriver.edge.driver",".\\executables\\msedgedriver.exe");
//Create the instance of required path
WebDriver driver=new EdgeDriver();
//give implicit
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get the Website URL
driver.get("https://demo.actitime.com/login.do");
//Maximize the window
driver.manage().window().maximize();
//	Enter "admin" in user name field 
driver.findElement(By.xpath("//input[@ name=\"username\"]")).sendKeys("admin");
//enter "manager" password in password field

WebElement passwordField=driver.findElement(By.xpath("//input[@ name=\"pwd\"]"));
System.out.println("password is dispay or not :"+passwordField.isDisplayed());
passwordField.sendKeys("manager");
//Click on Login button
driver.findElement(By.xpath("//a[@ id=\"loginButton\"]")).click();
//Clck on Task button
driver.findElement(By.xpath("//div[@id=\"container_tasks\"]")).click();
//Click on add new button
driver.findElement(By.xpath("//div[text()=\"Add New\"]")).click();
//Click on Add new task
driver.findElement(By.xpath("//div[@ class=\"item createNewTasks\"]")).click();

	}

}
