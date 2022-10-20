package day5.MutipleElementHandling;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartbannerlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set the executable path of required browser
 System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
 // Create the instance
 WebDriver driver=new ChromeDriver();
//implicite wait
 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 //get the respective url
 driver.get("https://www.flipkart.com/");
// driver.findElement(By.cssSelector("input[name=\' q\']")).sendKeys("selenium");
driver.findElement(By.cssSelector("button[class=\'_2KpZ6l _2doB4z\']")).click();
 //get all the banner from the flipkart
List<WebElement>bannerList=driver.findElements(By.cssSelector("div._3ChZRr>div"));
//get the bannner count
 System.out.println("banner count is :"+bannerList.size());
 //to get the element from list
 WebElement firstbanner=bannerList.get(0); 
 System.out.println("first banner name:"+firstbanner.getText());
  for (int i=0;i<bannerList.size();i++)
  {
	  System.out.println(bannerList.get(i).getText());
  }
 
	
	}

}
