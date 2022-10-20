package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step-1. Open the Chrome Browser
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicite wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Step-2.Get the Application URL
		driver.get("https://demo.actitime.com/");
		// Step-3.Enter Username as admin
		// locate the username field from the UI
		WebElement userNameInputField = driver.findElement(By.id("username"));
		// WebElement userclassNameField=driver.findElement(By.className("textField"));
		/*
		 * after the finding webElement we perform all following operation Type
		 * input>>sendkeys(" ") Click >>click() Delete Existing text>> clear()
		 */
		// or
		// locate the class name field from the UI
		// userclassNameField.sendKeys("admin");
		userNameInputField.sendKeys("admin");
		// Step-4
		// locate the password field from the the UI
		WebElement userPasswordField = driver.findElement(By.name("pwd"));
		userPasswordField.sendKeys("manager");
		// Step-5 Identify the login button
         //Identify the login button and click on it
		driver.findElement(By.id("loginButton")).click();
		// Validation will be failed ,to avoid this will use explicite wait (Conditional
		// wait)
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		// Step-6 Validate the home page
		String ExpectedTitle = "actiTIME - Enter Time-Track";
		String ActualTitle = driver.getTitle();
		System.out.println("Expected title is:" + ExpectedTitle);
		System.out.println("ActualTitle:" + ActualTitle);

		if (ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Login validation is passed..");
		} else {
			System.out.println("Login validate is failed....");
		}
		driver.findElement(By.id("logoutLink")).click();
		driver.close();

	}

}
/**
 * Open the chrome Browser ,Enter application URL, Enter username as admin
 * ,Enter password as manager click on login button Validation home page click
 * on log out button Validate the login page
 * 
 * 
 * 
 * 
 */