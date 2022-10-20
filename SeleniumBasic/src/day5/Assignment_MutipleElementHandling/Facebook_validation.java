package day5.Assignment_MutipleElementHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Set the executable path
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Create the instance of chrome browser
WebDriver driver=new ChromeDriver();
// provide the implicit wait
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//get the url
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
// validate the url
String ActualURL=driver.getCurrentUrl();
String ExpectedURL="https://www.facebook.com/";
if (ActualURL.equals(ExpectedURL))
{
	System.out.println("URL validation done...");
}
else
{
	System.out.println("URL validation fail..");
}
//Title validation
String ActualTitle=driver.getTitle();
String ExpectedTitle="";
if (ActualTitle.equals(ExpectedTitle))
{
	System.out.println("Title validation done");
}
else
{
	System.out.println("Title validation fail..");
}
driver.findElement(By.id("")).click();
	
	}

}
