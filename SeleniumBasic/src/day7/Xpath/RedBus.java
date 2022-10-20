package day7.Xpath;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
///
//Set the executable path
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Create the instance of chrome browser
WebDriver driver=new ChromeDriver();
//implicit wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get the URL
driver.get("https://www.redbus.in/");
//maximize the window 
driver.manage().window().maximize();
// click on From
WebElement from=driver.findElement(By.xpath("html/body[1]/section/div[2]/main/section/div/div[2]/section/div/div/div[1]/input[@ type='text']"));
from.sendKeys("Pune");
// from DropDown list select 2 option
driver.findElement(By.xpath("/html/body[1]/section/div[2]/main/section/div/div[2]/section/div/div/div[1]/ul/li[2]")).click();
//Click on To
WebElement To=driver.findElement(By.xpath("/html/body[1]/section/div[2]/main/section/div/div[2]/section/div/div[2]/div/input[@ type='text']"));
To.click();
To.sendKeys("Goa");
//Click on second option
driver.findElement(By.xpath("/html/body[1]/section/div[2]/main/section//div[2]/section/div/div[2]/div/ul/li[2]")).click();
//Select date 
WebElement date=driver.findElement(By.xpath("/html/body[1]/section/div[2]/main/section/div/div[2]/section/div/div[3]"));
date.click();
//Select date as 15 oct
driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[5]/td[6]")).click();
driver.findElement(By.id("search_btn")).click();
//WebDriverWait wait=new WebDriverWait(driver,30);
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/div[2]/div[2]/div/div[3]/div/div/i")));
//driver.findElement(By.id("search_btn")).click();
Wait wait=new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(ElementClickInterceptedException.class);
driver.findElement(By.cssSelector("i[class=\"icon-close coach-close\"]")).click();

	}

}
