package day5.MutipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMainManu {
//  1.open the FlipKart platform
//  2.validate the home page 
//  3.get the menu option count 
//  prin the manu option name
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set the required browser path
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
	//create the instance of required browser
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//  1.open the FlipKart platform	
//get the required browser
		driver.get("https://www.flipkart.com/");
		//maximize the window 
		driver.findElement(By.cssSelector("button[class=\'_2KpZ6l _2doB4z\']")).click();
		driver.manage().window().maximize();

		
////  2.validate the home page 
String actualtitle=driver.getTitle();
System.out.println(actualtitle);
String expectedtitle="Flipkart";
if(actualtitle.equals(expectedtitle))
{
	System.out.println("homepage validation done....");
}

else
{
	System.out.println("homepage validation fail...");
}

 //a. validate the search option display
WebElement SearchOptionDispaly=driver.findElement(By.className("_3704LK"));
 System.out.println("search option dipslay or not :"+SearchOptionDispaly.isDisplayed());
  List<WebElement> manucount=driver.findElements(By.cssSelector("div.InyRMC>div>div.eFQ30H"));
  System.out.println("manu count :"+manucount.size());
WebElement firstmanuname=manucount.get(0);
System.out.println("first manu text:"+firstmanuname.getText());
for(int i=0;i<manucount.size();i++)
{
	System.out.println(i+" "+manucount.get(i).getText());
}
	}

}
