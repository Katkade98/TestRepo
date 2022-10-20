package day6.Dropdown$CalenderHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. set the required browser
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//2. Create the browser instance
	WebDriver driver=new ChromeDriver();
//3.impclit wait
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//4.get URL
driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");

//maximize Window
driver.manage().window().maximize();
driver.findElement(By.cssSelector("#bsd1-button")).click();
//identify all the option and them into List<WebElement>
List<WebElement> options=driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
//use size() to ge the size
System.out.println(" size of options:"+options.size());
for (int i=0;i<options.size();i++)
{
	System.out.println(options.get(i).getText());
}
options.get(2).click();

}

}
