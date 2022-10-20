package day7.Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Set the executable path 
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Create the instance of chrome browser
WebDriver driver=new ChromeDriver();
//implicit wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get the required URL
driver.get("https://www.saucedemo.com/");
//Maximize the window 
driver.manage().window().maximize();
//Enter Username as "standard_user" 
driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("standard_user");
//Enter password as a "secret_sauce";
driver.findElement(By.xpath("//div//div[2]/div/div/div//div[2]/input[@ type=\"password\"]")).sendKeys("secret_sauce");
//Click on login
driver.findElement(By.id("login-button")).click();
//List the product 
List<WebElement> productList=driver.findElements(By.xpath("//body/div/div/div/div[2]/div/div/div/div/div[2]/div/a"));
List<WebElement> priceList=driver.findElements(By.xpath("//body/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div"));
String firstProductName=productList.get(0).getText();
System.out.println("first product name:"+firstProductName);
System.out.println("size of the list:"+productList.size());
for(WebElement list:productList)
{
	System.out.println(list.getText()+"---> ");
}
for (WebElement list1:priceList)
{
	System.out.println(list1.getText());
}
String currentTitle=driver.getTitle();
System.out.println("actual result:"+currentTitle);
String expectedTitle="Swag Labs";
System.out.println("both actual and expected Title equal or not:"+currentTitle.equals(expectedTitle));
	}

}
