package day6.Dropdown$CalenderHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleDropdownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.set the browser executable path
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//2. Create the instance of required browser
		WebDriver driver=new ChromeDriver();
//3. add implicit wait
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//get the URL
driver.get("http://omayo.blogspot.com/");
//maximize
driver.manage().window().maximize();
//Identify the dropdwList
WebElement carDropdown=driver.findElement(By.id("multiselect1"));
//Create the instance of select class
Select multipSelect=new Select(carDropdown);
//check wheather this dropdown is multi-select or not 
System.out.println("check dropdown is mutlselect or not :"+multipSelect.isMultiple());
//get the default already select option
List<WebElement> option=multipSelect.getOptions();
System.out.println("car size count:"+option.size());
//get the dropdown option name
for (int i=0;i<option.size();i++)
{
	System.out.println(option.get(i).getText());
}
//Select option from the dropdown
multipSelect.selectByIndex(1);
System.out.println("already seelcted:"+multipSelect.getFirstSelectedOption().getText());
multipSelect.selectByIndex(2);
multipSelect.selectByIndex(3);
//multipSelect.selectByVisibleText("Audi");
//multipSelect.selectByValue("Hyundai");
////get the all selected option 
List<WebElement> selectedCar=multipSelect.getAllSelectedOptions();
System.out.println("seelcted car count:"+selectedCar.size());
////unselect already selected option
//multipSelect.deselectByIndex(0);
//multipSelect.deselectByValue("Audi");
//multipSelect.deselectByVisibleText("Hyundai");
////or
multipSelect.deselectAll();
//
	
	}

}
