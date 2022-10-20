package day6.AssignDropdown$CalenderHandling;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class year_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//step1:set the browser URL
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Create the instance of respective browser
WebDriver driver=new ChromeDriver();
//implicit wait
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//get the URL
driver.get("https://demo.automationtesting.in/Register.html");
//maximize 
driver.manage().window().maximize();
WebElement yeardown=driver.findElement(By.cssSelector("#yearbox"));
Select selectyearbox=new Select(yeardown);
//check the dropdown is multiselect or not 
System.out.println("dropdown is multiselect or not :"+selectyearbox.isMultiple());
//already selected option name
System.out.println("already selected option"+selectyearbox.getFirstSelectedOption().getText());
//get the all option
List<WebElement> option=selectyearbox.getOptions();
System.out.println("year count:"+option.size());
for(int i=0;i<option.size();i++)
{
	System.out.print(option.get(i).getText()+",");
}
System.out.println();
selectyearbox.selectByValue("1917");
System.out.println("already selected option"+selectyearbox.getFirstSelectedOption().getText());
selectyearbox.selectByIndex(1);
System.out.println("already selected option :"+selectyearbox.getFirstSelectedOption().getText());
selectyearbox.selectByVisibleText("1918");
System.out.println("already selected option:"+selectyearbox.getFirstSelectedOption().getText());
String yearnumber = "";
for (int i=1;i<option.size();i++)
{
	if ((option.size()-1)!=i)
	{
		yearnumber=yearnumber+option.get(i).getText()+",";
	}
	else
	{
		yearnumber=yearnumber+option.get(i).getText();
	}
}
String exp_year="1916,1917,1918,1919,1920,1921,1922,1923,1924,1925,1926,1927,1928,1929,1930,1931,1932,1933,1934,1935,1936,1937,1938,1939,1940,1941,1942,1943,1944,1945,1946,1947,1948,1949,1950,1951,1952,1953,1954,1955,1956,1957,1958,1959,1960,1961,1962,1963,1964,1965,1966,1967,1968,1969,1970,1971,1972,1973,1974,1975,1976,1977,1978,1979,1980,1981,1982,1983,1984,1985,1986,1987,1988,1989,1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015";
System.out.println("yearnumber:"+yearnumber);
System.out.println("exp_year:"+exp_year);
System.out.println(yearnumber.equals(exp_year));	

Select yeardrop =new Select (driver.findElement(By.cssSelector("#yearbox")));
List<Integer> year=new ArrayList<Integer>();

{
	
}
	}

}
