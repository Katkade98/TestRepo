package day4.CssLocator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLab {

	public static void main(String[] args) throws InterruptedException {
	
// TODO Auto-generated method stub
// set the path of Executable browser path
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		// Create the instance of chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
// get the url link
		driver.get("https://www.saucedemo.com/");
		
//   get the actual time 
		String actualtitle = driver.getTitle();
		// BY using CSS locator
		// by using any attribute
		driver.findElement(By.cssSelector("input[placeholder=\'Username\']")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[type=\'password\']")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input.submit-button")).click();
		System.out.println("actual title:" + driver.getTitle());
		driver.manage().window().setSize(new Dimension(500, 500));
		driver.manage().window().maximize();
		// by using .id css method
		driver.findElement(By.cssSelector("#react-burger-menu-btn")).click();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
		//
		Thread.sleep(3000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		
	}

}
