package day9.KeyboardAndMouseOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOps2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set the path
		String chromepath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
//setting the browser executable path
System.setProperty("webdriver.chrome.driver",chromepath);
//Create the instance of chrome browser and up-casting to webDriver interface
WebDriver driver=new ChromeDriver();
//give implicit wait 
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://demo.actitime.com/login.do");
//Maximize the window
driver.manage().window().maximize();
//login actiTime Application by using enter key 
driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin",Keys.TAB);
driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager",Keys.ENTER);

		}

}
