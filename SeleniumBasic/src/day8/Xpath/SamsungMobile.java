package day8.Xpath;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamsungMobile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//Setting the browser executable path
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Create the instance of required browser chrome driver object up-cast to the web driver type
WebDriver driver=new ChromeDriver();
//give implicit
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//get the respective URL
driver.get("https://www.flipkart.com/");
TakesScreenshot ts=(TakesScreenshot)driver;
//get the screenshot using getScreenshotAs interface
File file=ts.getScreenshotAs(OutputType.FILE);
//store above screenShot into rquired location
FileUtils.copyFile(file,new File(".\\screenshot\\google.jpg"));
System.out.println("program done");
//maximize the window 
driver.manage().window().maximize();
//cancel po-pops 
driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
	}

}
