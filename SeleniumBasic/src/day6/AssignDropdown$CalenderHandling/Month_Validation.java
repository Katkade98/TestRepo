package day6.AssignDropdown$CalenderHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Month_Validation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
// Step 1: set the browser executable path
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Step 2: Create the instance of chrome browser
WebDriver driver=new ChromeDriver();
//Step 3: implict wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get the URL
driver.get("https://demo.automationtesting.in/Register.html");
//maximize the window 
driver.manage().window().maximize();
WebElement monthList=driver.findElement(By.cssSelector("select[ng-model=\"monthbox\"]"));
Select selectMonthBox=new Select(monthList);

selectMonthBox.getFirstSelectedOption();
System.out.println("mothlist droplist is multiSelect or not "+selectMonthBox.isMultiple());
//already selected option 
System.out.println("already selected option:"+selectMonthBox.getFirstSelectedOption().getText());
//select option
selectMonthBox.selectByIndex(3);
System.out.println("already selected option :"+selectMonthBox.getFirstSelectedOption().getText());
selectMonthBox.selectByValue("May");
System.out.println("already selected option :"+selectMonthBox.getFirstSelectedOption().getText());
selectMonthBox.selectByVisibleText("May");
System.out.println("select Already selected option:"+selectMonthBox.getFirstSelectedOption().getText());
List<WebElement> option=selectMonthBox.getOptions();
System.out.println("Month count:"+option.size());
for (int i=1;i<option.size();i++)
{
	System.out.println(option.get(i).getText());
}
String monthNumber="";
for (int i=1;i<option.size();i++)
{
	if ((option.size()-1)!=i)
	{
		monthNumber=monthNumber+option.get(i).getText()+", ";
	}
	else
	{
		monthNumber=monthNumber+option.get(i).getText();
	}
}
String filepath="D:\\Acceleration workspace\\javabasic\\Text2\\shubham98";
FileInputStream fis=new FileInputStream(filepath);
Properties pro=new Properties();
pro.load(fis);
System.out.println(pro.getProperty("exp_MonthNumber"));

//String exp_MonthNumber="January, February, March, April, May, June, July, August, September, October, November, December";
System.out.println("monthNumber:"+monthNumber);
//System.out.println("exp_MonthNumber:"+exp_MonthNumber);
System.out.println("monthNumber and exp_MonthNumber equal or not:"+monthNumber.equals(pro.getProperty("exp_MonthNumber")));
 	}

}
