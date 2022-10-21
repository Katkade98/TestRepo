package day13AlertHandling;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.seleniumUtility;

public class ActiveElement {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seleniumUtility util=new seleniumUtility();
		WebDriver driver =util.setUp("chrome","https://demo.actitime.com/login.do");
		WebElement element=driver.switchTo().activeElement();
		String exp=element.getAttribute("placeholder");
		if (exp.equals("Username"))
		{
			System.out.println("mouse is in the username field");
			element.sendKeys("admin",Keys.TAB);
		}
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
	}

}
