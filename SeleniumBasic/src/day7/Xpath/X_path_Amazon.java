package day7.Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set the the required browser path
	System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Create the instance of required browser
WebDriver driver=new ChromeDriver();
//implicit wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get the URL
driver.get("https://www.amazon.in/b?node=14605651031");
//maximize the window
driver.manage().window().maximize();
// click on search button
//Enter "Samsung" Mobile
driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Samsung");

driver.findElement(By.cssSelector("#nav-flyout-iss-anchor>div>*:nth-child(2)>*:nth-child(5)")).click();
List<WebElement> optionList=driver.findElements(By.cssSelector("#nav-flyout-iss-anchor>div>*:nth-child(2)"));
for (int i=0;i<optionList.size();i++)
{
	System.out.println(optionList.get(i).getText());
}
optionList.get(5).click();


	}

}
