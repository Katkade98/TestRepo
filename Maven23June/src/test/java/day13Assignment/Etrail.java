package day13Assignment;


import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;
import org.openqa.selenium.interactions.KeyUpAction;
import org.openqa.selenium.support.ui.Select;

import utilities.seleniumUtility;

public class Etrail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
seleniumUtility s1=new seleniumUtility();
WebDriver driver=s1.setUp("chrome","https://erail.in/");
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

//find current window id 
String HomePageWindId=driver.getWindowHandle();
System.out.println("print the homepage id:"+HomePageWindId);

//Click on e-Catering 
driver.findElement(By.xpath("//a[text()='eCatering']")).click();

//get all windowId 
Set<String>allWind=driver.getWindowHandles();
System.out.println("print all window:"+allWind);

//remove main menu window from the allwindow 
allWind.remove(HomePageWindId);
System.out.println("print the window :"+allWind);

//get the child window id using iterator
Iterator<String>itr=allWind.iterator();
String childWind=itr.next();
System.out.println("print the childWind"+childWind);
driver.switchTo().window(childWind);
//click and find train
driver.findElement(By.xpath("//input[contains(@placeholder,\"Search Train or \")]")).click();
//find column enter train number as "12627"
driver.findElement(By.cssSelector(".form-input.pl-10.text-sm")).sendKeys("12627");
//sect train from custom dropdown
driver.findElement(By.xpath("//button[contains(@class,'body-3 text-gray-60 ')]")).click();

///////////////////////////////////////////////////

//click on "Boarding Station"
driver.findElement(By.xpath("//input[@placeholder=\"Boarding Date\"]")).click();
WebElement calender=driver.findElement(By.xpath("//input[@name=\"date\"]"));
//Thread.sleep(3000);
calender.sendKeys(Keys.ARROW_RIGHT);
calender.sendKeys(Keys.ARROW_RIGHT);
calender.sendKeys(Keys.ARROW_DOWN);
calender.sendKeys(Keys.ENTER);

///////////////////////////////////////////////////////////
WebElement list=driver.findElement(By.xpath("//select[@placeholder=\'Boarding Station\']"));

Select select=new Select(list);
System.out.println("dropdown is multiselect or not:"+select.isMultiple());



//List<WebElement> option=select.getAllSelectedOptions();
select.selectByValue("DMM");
//select.selectByIndex(8);
System.out.println("selected option:"+select.getFirstSelectedOption());

driver.findElement(By.xpath("//button[text()='FIND FOOD']")).click();
System.out.println("validate Title:"+driver.getTitle());
System.out.println("validate URL:"+driver.getCurrentUrl());
//find hotel 
//List<WebElement> restaurantsName=driver.findElements(By.xpath("//div[@class=\"flex flex-col\"]/div/div"));
List<WebElement> restaurants=driver.findElements(By.xpath("//div[@class=\"flex flex-col\"]/div/div/div/div[3]/span[2]"));
for (int i=0;i<restaurants.size();i++)
{
	System.out.println(restaurants.get(i).getText());
}
//close the child wind
//driver.close();


//switch to the main window
driver.switchTo().window(HomePageWindId);
//Validate the main window 
System.out.println("validate Title:"+driver.getTitle());
System.out.println("validate URL:"+driver.getCurrentUrl());

	}

	
}
