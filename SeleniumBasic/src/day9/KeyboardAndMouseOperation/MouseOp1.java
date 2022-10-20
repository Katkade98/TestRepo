package day9.KeyboardAndMouseOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//setting the browser executable path
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
//Create the instance of chromeBowser
		WebDriver driver = new ChromeDriver();
//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//get the rquired URL
		driver.get("http://demo.automationtesting.in/Register.html");
//maximize the window 
	driver.manage().window().maximize();
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		firstName.sendKeys("shubham");
//create the instance of Actions class by passing required browser to its constructor
		Actions act = new Actions(driver);
//with the help of action class ref perform appropriate action

		act.moveToElement(firstName).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build()
				.perform();
//paste it on the lastaname field
WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
act.moveToElement(lastName).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
}

}
