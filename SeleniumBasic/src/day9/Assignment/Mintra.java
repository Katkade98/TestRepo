package day9.Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mintra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//setting the browser executable path
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Create the instance of browser 
WebDriver driver=new ChromeDriver();
//implicit browser
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get the URL
driver.get("https://www.myntra.com/");
///maximize the webpage
driver.manage().window().maximize();
List<WebElement> mainMenu=driver.findElements(By.xpath("//nav[@class='desktop-navbar']/div/div"));
System.out.println("menucount: "+mainMenu.size());
//Create the instance of Actions 
Actions act=new Actions(driver);
//to do hover over the home option
act.moveToElement(mainMenu.get(1)).perform();//for perform single operation
for (int i=0;i<mainMenu.size();i++)
{
	WebElement option=mainMenu.get(i);
	act.moveToElement(option).perform();
	Thread.sleep(3000);
}
//mouseHoverWithTheElement(act,mainMenu.get(2));
//act.moveToElement(mainMenu.get(1), 100, 0).perform();
mouseHover(act,mainMenu);

	}
	static void mouseHoverWithTheElement(Actions act,WebElement element)
	{
		act.moveToElement(element).perform();
	}
	static void mouseHover(Actions act,List<WebElement>mainMenu) throws InterruptedException
	{
		for (int i=0;i<mainMenu.size();i++)
		{
			WebElement option=mainMenu.get(1);
			act.moveToElement(option).perform();
			Thread.sleep(1500);}
	}
	
}
