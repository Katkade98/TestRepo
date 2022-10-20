package day5.Assignment_MutipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSMArenaPagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set the executable task 
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
// create the instance of
WebDriver driver=new ChromeDriver();
//implicit wait
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//get the 
driver.get("https://www.gsmarena.com/");
//maximize
driver.manage().window().maximize();
String Actualtitle=driver.getTitle();
String ExpectedTitle="";
if(Actualtitle.equals(ExpectedTitle))
{
	System.out.println("title validation done");
}
else
{
	System.out.println("title validation done");
}
driver.findElement(By.cssSelector("a[href=\"samsung-phones-9.php\"]")).click();
//
 List<WebElement> pagepagination=driver.findElements(By.cssSelector("div.nav-pages>span"));
 WebElement zeroindexpage=pagepagination.get(0);
 System.out.println(zeroindexpage.getText());
	}

}
