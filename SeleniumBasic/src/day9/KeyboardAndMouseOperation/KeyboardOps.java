package day9.KeyboardAndMouseOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//setting the browser executable path
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Create the instance of chromeDriver
WebDriver driver=new ChromeDriver();
//give implicite wait 
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get the respective URL
driver.get("https://www.flipkart.com/");
//Maximize the window 
driver.manage().window().maximize();
//Using Escap button avoid login popus
driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
	}

}
