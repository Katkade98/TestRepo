package day13AlertHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.seleniumUtility;

public class HandlingConfirmationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
seleniumUtility s1=new seleniumUtility();
 WebDriver driver=s1.setUp("chrome","https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
 //as our operation is inside the frame so indentify the frame with the help of index and webElement or name
//WebElement frame=driver.findElement(By.id("iframeResult"));
	driver.switchTo().frame("iframeResult");
driver.findElement(By.xpath("//button[text()='Try it']")).click();
//we want to perform "ok" operation int this javaScirpt pop-ups
System.out.println("Java script text():"+driver.switchTo().alert().getText());
//also nwe want to perform another action agaain we need to go into pop-ups
driver.switchTo().alert().accept();
//System.out.println("after pressing ok dispaly message:"+driver.switchTo().alert().getText());

	
	}

}
/**
 In order handle any Javascript Pop-Pus (application sepcific )we need to use driver.switch().alert();
 because java script popus doesn't contain HTML code 
 we use predefined functionof alert to perfrom any operation on it 
 after every action come back to the main page
 
 * 
 * 
 */
