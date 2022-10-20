package day9.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cutpaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set the browser executable path
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Create the instance of chromeBrowser and up-casted into webdriver interface
	WebDriver driver=new ChromeDriver();
//implicit wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get the respective URL
driver.get("http://demo.automationtesting.in/Register.html");
//maximmize the window 
driver.manage().window().maximize();
WebElement firstName=driver.findElement(By.xpath("//input[@placeholder=\'First Name\']"));
firstName.sendKeys("shubham",Keys.chord(Keys.CONTROL,"a"));
firstName.sendKeys(Keys.chord(Keys.CONTROL,"x"));
driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}
