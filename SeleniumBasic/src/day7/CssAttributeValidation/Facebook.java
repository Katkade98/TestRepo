package day7.CssAttributeValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set the required browser executable path
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Create the instance of required browser
	WebDriver driver=new ChromeDriver();
//implicit wait
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
// get the url
	driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
WebElement loginButton=driver.findElement(By.xpath("//button[@value=\"1\"]"));
loginButton.getCssValue("")
	}

}
