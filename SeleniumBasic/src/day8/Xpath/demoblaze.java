package day8.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set the browser executable path
	System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Create the instance of executable path
WebDriver driver=new ChromeDriver();
//implicit wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get the respective URL
driver.get("https://www.demoblaze.com/ ");
//product name 
WebElement productName=driver.findElement(By.xpath("//a[text()='Sony xperia z5']"));
System.out.println("product name:"+productName.getText());
//product price
WebElement productPrice=driver.findElement(By.xpath("//div[h4[a[text()='Sony xperia z5']]]/h5"));
System.out.println("product price :"+productPrice.getText());
	}

}
