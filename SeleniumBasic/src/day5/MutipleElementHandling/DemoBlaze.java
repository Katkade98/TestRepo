package day5.MutipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set executable path
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
	//create the instance of repsective browser
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//get the repsective url
	driver.get("https://www.demoblaze.com/");
//maximize the webpage
	driver.manage().window().maximize();
	List<WebElement> mobileList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
	System.out.println("count:"+mobileList.size());
	WebElement firstcountName=mobileList.get(0);
	System.out.println("first element name:"+firstcountName.getText());
	List<WebElement> mobileprice=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
	System.out.println("mobile price:"+mobileprice.size());
	for (int i=0;i<mobileList.size();i++)
	{
		System.out.println(mobileList.get(i).getText()+"---> "+mobileprice.get(i).getText());
	}
	System.out.println("*********************************");

	
	
	
	
	}

}
