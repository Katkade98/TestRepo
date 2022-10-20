package day9.Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CrickInfo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//setting browser Executable path
String chromepath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", chromepath);
//create the instance of webdriver
WebDriver driver=new ChromeDriver();
//implicit wait 
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get the respective URL
driver.get("https://www.espncricinfo.com/");
//maximize the window 
driver.manage().window().maximize();
// identify the mainmenu list element
List<WebElement>mainMenu=driver.findElements(By.xpath("//div[@class='ds-flex ds-flex-row']/div"));
System.out.println("mainMenu count:"+mainMenu.size());
Actions act=new Actions(driver);
act.moveToElement(mainMenu.get(2)).perform();
for (int i=0;i<mainMenu.size();i++)
{
	WebElement option=mainMenu.get(i);
	act.moveToElement(option).perform();
	Thread.sleep(1500);
}
mouseHoverWithTheElement(act,mainMenu.get(1));
	}
static void mouseHoverWithTheElement(Actions act,WebElement element)
{
	act.moveToElement(element).perform();
}
static void rightClick (Actions act,WebElement option)
{
	System.out.println("option name is :"+option.getText());
	act.moveToElement(option).contextClick().build().perform();
}
}
