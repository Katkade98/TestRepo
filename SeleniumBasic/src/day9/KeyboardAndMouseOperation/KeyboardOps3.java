package day9.KeyboardAndMouseOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class KeyboardOps3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create the chromepath with the help of Absolute path
	String edgePath="D:\\Acceleration workspace\\SeleniumBasic\\executables\\msedgedriver.exe";
//Set the executable path
	System.setProperty("webdriver.edge.driver", edgePath);
//Create the instance of chromeDriver
WebDriver driver=new EdgeDriver();
//implicit wait 
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get the URL 
driver.get("http://demo.automationtesting.in/Register.html");
WebElement firstName=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
firstName.sendKeys("shubham",Keys.chord(Keys.CONTROL,"a"));//type shubham  and select all ctrl+a
firstName.sendKeys(Keys.CONTROL,"c");
//in the last name filed use the Ctl+v
driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));



	}

}
