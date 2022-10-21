package day12AssignmentSwitching;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//import utilities.SeleniumUtility;

public class sortableAss {
 //static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		//open application url
		driver.get("https://jqueryui.com/");
driver.findElement(By.xpath("//a[text()='Sortable']")).click();
//move into frame
WebElement e1=driver.findElement(By.cssSelector("iframe.demo-frame"));
driver.switchTo().frame(e1);
Actions action=new Actions(driver);
List<WebElement> list=driver.findElements(By.cssSelector(".ui-sortable>li"));
WebElement target=driver.findElement(By.cssSelector("html[lang=\"en\"]> body>ul>li"));
for(int i=list.size()-1;i>=0;i--)
{
	System.out.println(list.get(i).getText());
}
for(int i=list.size()-1;i>=0;i--)
{
	//System.out.println(list.get(i).getText());
	//act.dragAndDrop(list.get(i),target).build().perform();
	performDragnDrop(action,list.get(i),target);
	Thread.sleep(2000);
}


	}
	private static void performDragnDrop(Actions action,WebElement src,WebElement target)
	{
		action.dragAndDrop(src, target).build().perform();
	}
	
}
