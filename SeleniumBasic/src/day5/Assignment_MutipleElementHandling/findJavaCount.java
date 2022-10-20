package day5.Assignment_MutipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findJavaCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set the executable browser path
 System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
 //create the instance of required browser
 WebDriver driver=new ChromeDriver();
 //give the implicate 
 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 
driver.get("https://www.google.com/");
driver.manage().window().maximize();
driver.findElement(By.cssSelector(".gLFyf")).sendKeys("java");
List<WebElement> suggestionlist=driver.findElements(By.cssSelector("div.pcTkSc>div>span>b"));
System.out.println(suggestionlist.size());
System.out.println("firstsyggestionlist:"+suggestionlist.get(0));
for(int i=0;i<suggestionlist.size();i++)
{
	System.out.println(i+" "+suggestionlist.get(i).getText());
}
	}

}
