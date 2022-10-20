package day9.KeyboardAndMouseOperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOps3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//set the browser executable path
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Create the instance of  chrome-browser and upcasting to the webdriver interface
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get the URL
driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
//frame handling
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
//maximize the window 
driver.manage().window().maximize();
//create the instance of Actions class to use mouse opeation
Actions act=new Actions(driver);
List<WebElement>sourceElement=driver.findElements(By.xpath("//ul[@id='gallery']/li"));
WebElement target = driver.findElement(By.id("trash"));
//act.dragAndDrop(sourceElement.get(0), target).build().perform();
//act.dragAndDrop(sourceElement.get(1), target).build().perform();
//act.dragAndDrop(sourceElement.get(2), target).build().perform();
for (int i=0;i<sourceElement.size();i++)
{
	performDragAndDrop(act,sourceElement.get(i),target);
	Thread.sleep(2000);
}
	}

	private static void performDragAndDrop(Actions act, WebElement src, WebElement target) {
		// TODO Auto-generated method stub
		act.dragAndDrop(src, target).build().perform();
	}

}
