package day5.Assignment_MutipleElementHandling;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmArena2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set the executable path  for required browser
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
// creaate the instance of the chrome browser
		WebDriver driver=new ChromeDriver();
//set the implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
// get the url
driver.get("https://www.gsmarena.com/");
driver.manage().window().setSize(new Dimension(1000,1000));

driver.manage().window().maximize();
driver.findElement(By.cssSelector("a[href=\'samsung-phones-9.php\']")).click();
List<WebElement> samsungmobilelist=driver.findElements(By.cssSelector("div.makers>ul>li"));
System.out.println("samsung mobile list"+samsungmobilelist.size());
WebElement firstmobilename=samsungmobilelist.get(0);
System.out.println(firstmobilename.getText());
for(int i=0;i<samsungmobilelist.size();i++)
{
	System.out.println(i+" "+samsungmobilelist.get(i).getText());
}

	}

}
