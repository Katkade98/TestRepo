package day9.KeyboardAndMouseOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOps5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//setting the browser executable path
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Create the instance of the chromeBrowse and up-casting to the webdriver interface
WebDriver driver =new ChromeDriver();
//implicit wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get the URL
driver.get("https://www.flipkart.com/");
//maximize the window 
driver.manage().window().maximize();
// avoid the popus with the help of escap key
driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
Thread.sleep(1500);
//Refreshing the webpage with f5
driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);
//Possible way to Refresh webpage
//1.driver.navigate().refresh();
//2.sendKeys(Keys.F5);
//3.by hitting same URL again
//4.Ctrl+R (Not possible everywhere
	}



}
