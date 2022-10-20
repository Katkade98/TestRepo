package day5.MutipleElementHandling;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set the path 
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		//create the instance of chrome 
		WebDriver driver=new ChromeDriver();
//get the url
driver.get("https://www.google.com/");
//implicit wait
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
// write the selenium in search box
driver.findElement(By.name("q")).sendKeys("selenium");
//get the suggestion from the google searcg box
List<WebElement> sugglist=driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child>span"));

//get suggestion count
System.out.println("suggestion count is :"+sugglist.size());
// to get the list element from the list
WebElement firstsugg=sugglist.get(0);
System.out.println("first element text:"+firstsugg.getText());
 for (int i=0;i<sugglist.size();i++)
 {
	 System.out.println(sugglist.get(i).getText());
 } 
 
	}

}
