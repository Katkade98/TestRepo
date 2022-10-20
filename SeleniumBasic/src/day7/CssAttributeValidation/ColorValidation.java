package day7.CssAttributeValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * open the browser and enter vtiger application URL
 * Validate in login page sign in 
 * button is display in green color
 * sign in text size is 16px
 * sign text in white color (code)
 * Forgot Password ? is Display in Blue color(code)
 */
		String chromepath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
//Set the executable path
		System.setProperty("webdriver.chrome.driver", chromepath);
// Create the instance of chrome browser
WebDriver driver=new ChromeDriver();
//implicit wait 
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get the required URL
driver.get("https://demo.vtiger.com/vtigercrm/index.php");
WebElement signInButton= driver.findElement(By.cssSelector("button[type=\'submit\']"));
//button is display in green color
System.out.println("Font color:"+signInButton.getCssValue("color"));//Font Color
System.out.println("Font Size"+signInButton.getCssValue("font-size"));//font Size
System.out.println("Background image:"+signInButton.getCssValue("background-image"));//background color
//forgot password link validation 
WebElement forGotPassword=driver.findElement(By.cssSelector("a[class=\"forgotPasswordLink\"]"));
System.out.println("forget password text color:"+forGotPassword.getCssValue("color"));
System.out.println("Compare the result:");
String actualResult=forGotPassword.getCssValue("font-size");
String  ex_Result="12px";
System.out.println(actualResult.equals(ex_Result));
	}

}
