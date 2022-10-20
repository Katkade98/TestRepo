package day9.KeyboardAndMouseOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOps4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//setting the browser executable path
	System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Create the instance of Chrome browser and up-casting to web driver interface
    WebDriver driver=new ChromeDriver();
//give implicit wait
  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get the URL
  driver.get("https://www.flipkart.com/");
//using the escap key to avoid popup
  WebElement element=driver.findElement(By.xpath("//body"));
 element.sendKeys(Keys.ESCAPE);
 //Scolling the page using page down button
// for (int i=0;i<=10;i++)
// {
//	 element.sendKeys(Keys.PAGE_DOWN);
//	 Thread.sleep(3000);
// }
 Thread.sleep(1500);
 //Scolling down direcly goto the bottom of page 
 
 element.sendKeys(Keys.CONTROL.END);
 //Scolling up directly goto the top of the page
 element.sendKeys(Keys.CONTROL.HOME);
 
	}

}
