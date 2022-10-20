package day5.Assignment_MutipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricinfomenucount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set the executable browser path
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//create the instance of required path
		WebDriver driver=new ChromeDriver();
//proivide the instance
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//get the required url
	driver.get("https://www.espncricinfo.com/");
driver.manage().window().maximize();
//**************************************
//1. validate the homepage
 String actualhomeurl=driver.getCurrentUrl();
 String expectedhomeurl="https://www.espncricinfo.com/";
 if (actualhomeurl.equals(expectedhomeurl))
 {
	 System.out.println("URL validation done....");
 }
 else
 {
	 System.out.println("URL validation fail...");
 }
 //***************************************************88
 //validate the Title
 String ActualTitle=driver.getTitle();
 System.out.println("Actual Title print:"+ActualTitle);
 String expectedTitle="Live cricket scores, match schedules, latest cricket news, cricket videos";
 if (ActualTitle.equals(expectedTitle))
 {
	 System.out.println("Title Validation done");
 }
 else
 {
	 System.out.println("Title validation fail..");
 }
//find the menu count
 List<WebElement> menucount=driver.findElements(By.cssSelector("div.ds-flex-1>div>div>a"));
 System.out.println("menu count:"+menucount.size());
 for (int i=0;i<menucount.size();i++)
 {
	 System.out.println(i+" "+menucount.get(i).getText());
 }

	}

}
