package day7.CssAttributeValidation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositionValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * open the browser and enter the actitime application URL
 * click on login button with entering username and password
 * validation in error msg "Username and Password is invalid please try again "is display in red color 
 * above the username field
 * 
 */
	//set the browser executable path
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Create the instance of required browser
		WebDriver driver=new ChromeDriver();
//implicit wait 
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//Get the URL
driver.get("https://demo.actitime.com/");
//maximize the window 
driver.manage().window().maximize();
//click on login button without entering username and password
driver.findElement(By.cssSelector("#loginButton")).click();
WebElement errorMsg=driver.findElement(By.cssSelector(".errormsg"));
System.out.println("error Msg Text:"+errorMsg.getText());
System.out.println("error msg color:"+errorMsg.getCssValue("color"));
Point point=errorMsg.getLocation();
int errorMsgX=point.getX();
int errorMsgY=point.getY();
System.out.println("print the x axix:"+errorMsgX);
System.out.println("print the y axix:"+errorMsgY);

WebElement userNameInputField=driver.findElement(By.cssSelector("input[name=\"username\"]"));
Point locationUserName=userNameInputField.getLocation();
int userNameX=locationUserName.getX();
int userNameY=locationUserName.getY();
System.out.println("print the username x :"+userNameX);
System.out.println("print the username y "+userNameY);
System.out.println("is error msg is ggeting dislayed above the username field:"+(errorMsgY<userNameY));

//password field
WebElement passwordInputField=driver.findElement(By.cssSelector("input[name=\"pwd\"]"));
Point locationPasswordField=passwordInputField.getLocation();
int passwordX=locationPasswordField.getX();
int passwordY=locationPasswordField.getY();
System.out.println("print the password x :"+passwordX);
System.out.println("print the password y :"+passwordY);
System.out.println("is user name field is above the password field:"+(userNameY<passwordY));

	}

}
