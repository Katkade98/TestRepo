package day6.AssignDropdown$CalenderHandling;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//set the browser required path
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
//Create the instance of browser
		WebDriver driver = new ChromeDriver();
//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//Step 1: open url
//get the URL
		driver.get("https://www.redbus.in/");
//maximize
		driver.manage().window().maximize();
//step 2 : from pune 
		driver.findElement(By.cssSelector("#src")).sendKeys("Pune");
		driver.findElement(By.cssSelector(".autoFill.homeSearch>*:nth-child(1) ")).click();
//Step 3 : to goa
		driver.findElement(By.cssSelector("#dest")).sendKeys("Goa");
//step 4: Date in future 
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".text-trans-uc")).click();
//select future date
		driver.findElement(By.cssSelector(".first.last *:nth-child(6)>:last-child")).click();
//Thread.sleep(3000);
//WebDriverWait wait=new WebDriverWait(driver,30);
//fluent wait 
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("search_btn")));
		driver.findElement(By.id("search_btn")).click();
//select before 6 am
		driver.findElement(By.cssSelector(".details>*:nth-child(3)>*:nth-child(1)")).click();
//select AC buses
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(ElementClickInterceptedException.class);
	wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class=\"close-primo\"]")));
		driver.findElement(By.cssSelector("div[class=\"close-primo\"]")).click();
		driver.findElement(By.cssSelector("div.details>*:nth-child(5)>*:nth-child(3)>*:nth-child(2)")).click();


		List<WebElement> buslist = driver.findElements(By.cssSelector(".travels.lh-24.f-bold.d-color "));
		List<WebElement> busSeatPrice = driver
				.findElements(By.cssSelector(".clearfix.row-one>*:nth-child(6)>div>div.fare>span"));
		System.out.println("buslist count:" + buslist.size());
		WebElement firstBusName = buslist.get(0);
		System.out.println(firstBusName.getText());
		for (int i = 0; i < buslist.size(); i++) {
			System.out.println(buslist.get(i).getText() + "---->" + busSeatPrice.get(i).getText());
		}

	}

}
