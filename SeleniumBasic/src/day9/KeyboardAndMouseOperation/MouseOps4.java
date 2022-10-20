package day9.KeyboardAndMouseOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOps4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//setting the browser executable path
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Create the instance of chromeBrowser
WebDriver driver=new ChromeDriver();
//implicit wait 
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

//maximize the window 
driver.manage().window().maximize();
//get the URL
driver.get("https://www.facebook.com/");
//instance of Actions class
Actions act=new Actions(driver);
driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
WebElement firstName=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
firstName.sendKeys("shubham");
firstName.sendKeys(Keys.chord(Keys.CONTROL,"a"));
act.doubleClick(firstName).perform();
firstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
driver.findElement(By.name("lastname"))	.sendKeys(Keys.chord(Keys.CONTROL,"v"));			
	}

}
