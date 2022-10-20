package day6.Dropdown$CalenderHandling;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. set the driver executable path
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//2. create the instance 
		WebDriver driver=new ChromeDriver();
//3.implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//get the required url
driver.get("https://www.makemytrip.com/");
//maximize the window

driver.manage().window().maximize();

driver.findElement(By.cssSelector("label[for=\'departure\']")).click();
//select any date from the next month//Select 8
driver.findElement(By.cssSelector("div[class='DayPicker-wrapper']>*:nth-child(2)>*:nth-child(2)>*:nth-child(3)>*:nth-child(2)>*:nth-child(3)>div>p")).click();
//driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[2]/div[3]/div[2]/div/div/p")).click();
	}

}
