package day13AlertHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.seleniumUtility;

public class HandlingAlertPopus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
seleniumUtility s1=new seleniumUtility();
WebDriver driver=s1.setUp("chrome","https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//as the rquired element is present inside the frame, So need to switch our control inside the frame 
driver.switchTo().frame(0);
driver.findElement(By.xpath("//button[text()='Try it']")).click();
System.out.println(driver.switchTo().alert().getText());
//to perform another action on alert,we need to again switch our control to the alert 
driver.switchTo().alert().accept();
	}

}
/**
 In order handle any JavaScript Pop-up we need to use driver.switchTo().alert();
 because java script popup doesn'tcontain HTML code 
 we use predefined functionof alert to perform any operation it
 after every action control comes back to the main page
  
 */
