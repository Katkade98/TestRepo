package day9.KeyboardAndMouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseOp5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SeleniumUtility m1=new SeleniumUtility();
			WebDriver driver=m1.SetUp("chrome","https://www.facebook.com/");
			WebElement element=driver.findElement(By.xpath("//a[text()='Create New Account']"));
			m1.perfromClick(element);
			//or
			Thread.sleep(3000);
		//	m1.perfromClick(driver.findElement(By.xpath("//a[text()='Create New Account']")));
			WebElement userNameInputField=driver.findElement(By.name("firstname"));
			m1.typeInput(userNameInputField,"admin");
			//m1.copyTextFromField(userNameInputField);
			WebElement lastName =driver.findElement(By.name("lastname"));
		//	m1.pasteTextFromField(lastName);
			m1.copyPasteText(userNameInputField, lastName);
			m1.cleanUp();
	}

}
