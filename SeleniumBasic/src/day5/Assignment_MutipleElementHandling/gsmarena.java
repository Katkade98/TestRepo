package day5.Assignment_MutipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set the executable path
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
	//create the instance of chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
// get the required url
	driver.get("https://www.gsmarena.com/");
	driver.manage().window().maximize();
// find the mobile number list 
	List<WebElement> mobilelist=driver.findElements(By.cssSelector("div.brandmenu-v2>*:nth-child(2)>li"));
	System.out.println("mobile count:"+mobilelist.size());
	WebElement firstmobilenameElement=mobilelist.get(0);
	System.out.println(firstmobilenameElement.getText());
	for (int i=0;i<mobilelist.size();i++)
	{
		System.out.println(i+" "+mobilelist.get(i).getText());
	}
	}
//
}
