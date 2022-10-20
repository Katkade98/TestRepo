package day8.Xpath;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Setting the browser executable path
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Create the instance of ChromeDriver
WebDriver driver=new ChromeDriver();
//implicit wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get the respective Url
driver.get("https://www.makemytrip.com/");
//Maximize the window
driver.manage().window().maximize();
//list the number of offers
driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
List<WebElement>offer=driver.findElements(By.xpath("//div[@class=\"makeFlex perfectCenter\"]/ul/li"));
System.out.println("offer count :"+offer.size());
for (int i=0;i<offer.size();i++)
{
	System.out.println(offer.get(i).getText());
}

//out of which select Holiday
//WebDriverWait wait=new WebDriverWait(driver,30);
Wait wait =new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#superOffersTab_HOLIDAYS")));
driver.findElement(By.xpath("//span[text()='Holidays']")).click();
driver.findElement(By.xpath("//div[@class='itemDesc']")).click();

	}

}
