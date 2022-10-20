package day9.KeyboardAndMouseOperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOp2 {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//Setting the path of driver executable
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Create the browser Instance
WebDriver driver=new ChromeDriver();
//implicit wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


// get the URL 
driver.get("https://www.globalsqa.com/demo-site/");
driver.manage().window().maximize();
//identify all element of list menu
List<WebElement> menuList=driver.findElements(By.xpath("//div[@id=\"menu\"]/ul/li"));
System.out.println("option menu count:"+menuList.size());
//Create the instance of Actions class by passing required browser instance to its constructor
Actions act=new Actions(driver);
//to do the hover over the home option
act.moveToElement(menuList.get(4)).perform();
//for (int i=0;i<menuList.size();i++)
//{
//	WebElement option=menuList.get(i);
//	act.moveToElement(option).perform();
//	Thread.sleep(1500);
//
//}
//mouseHoverOverTheElement(act,menuList.get(2));
//act.moveToElement(menuList.get(1),100,0).perform();
//mouseHoverWithCords(act,menuList.get(2),100,0);
//rightClick(act,menuList.get(2));

	}


static void mouseHoverOverTheElement(Actions act,WebElement element)
{
	act.moveToElement(element).perform();
}
static void mouseHoverWithCords(Actions act,WebElement option,int X,int Y)
{
	System.out.println("option name is :"+option.getText());
	act.moveToElement(option,X,Y).perform();
}
static void rightClick(Actions act,WebElement option)
{
	System.out.println("option name is :"+option.getText());
	act.moveToElement(option).contextClick().build().perform();	
}

}
