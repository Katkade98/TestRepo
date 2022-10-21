package day12Switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.seleniumUtility;

public class HandlingFrame {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
seleniumUtility util=new seleniumUtility();
driver=util.setUp("chrome","https://jqueryui.com/");
driver.findElement(By.xpath("//a[text()='Checkboxradio']")).click();
//taking control inside the frame from main page
driver.switchTo().frame(0);
//Identify the element
//WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
//switch control to the frame
//driver.switchTo().frame(frame);
driver.findElement(By.xpath("//label[@for=\"radio-1\"]")).click();
//coming back to the main page from the frame

driver.switchTo().defaultContent();
driver.findElement(By.cssSelector(".logo")).click();
//util.cleanUp();
	}

}
