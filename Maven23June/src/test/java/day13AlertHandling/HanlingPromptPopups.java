package day13AlertHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.seleniumUtility;

public class HanlingPromptPopups {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
seleniumUtility s1=new seleniumUtility();
driver=s1.setUp("chrome","https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
//as the required element is present insidethe frame so our work is to isentify the frame
//driver.findElement(By.name("iframeResult"));
	driver.switchTo().frame("iframeResult");
driver.findElement(By.xpath("//button[text()='Try it']")).click();
driver.switchTo().alert().sendKeys("shubham");
driver.switchTo().alert().getText();
driver.switchTo().alert().accept();
//driver.switchTo().alert().dismiss();
	
	}

}
