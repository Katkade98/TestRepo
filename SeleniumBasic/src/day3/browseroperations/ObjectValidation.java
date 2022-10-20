package day3.browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set the browser executable path
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//Get the url
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//Identify the user input field
		WebElement userNameField=driver.findElement(By.name("username"));
		
		/**
		 * basic validation on input filed 
		 * 1.visible or not 
		 * 2.editable or not 
		 * 3.default or not
		 */
	System.out.println("User name input filed is visible or not ?"+userNameField.isDisplayed());
	System.out.println("Usr name input filed is  editable or not ?"+userNameField.isEnabled());
	String defaultValue=userNameField.getAttribute("placeholder");
	System.out.println("User input field default Value:"+defaultValue);
	
	//identify the login button
	/**
	 * basic validation on input filed 
	 * 1.visible or not 
	 * 2.editable or not 
	 * 3.default or not
	 */
	WebElement loginButton=driver.findElement(By.className("orangehrm-login-button"));
	System.out.println("login button is vislible or not ?:"+loginButton.isDisplayed());
	System.out.println("logine button is "+loginButton.isEnabled());
	String button=loginButton.getText();
	System.out.println("Button name is: "+button);
	}

}
