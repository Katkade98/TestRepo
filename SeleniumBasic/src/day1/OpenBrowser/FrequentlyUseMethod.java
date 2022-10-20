package day1.OpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrequentlyUseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Step 1 set a path for executable//case sensitive
		System.setProperty("webdriver.chrome.driver","D:\\Acceleration workspace\\SeleniumBasic\\executables\\chromedriver.exe");
// Step 2 Create a instance of required class
		WebDriver driver=new ChromeDriver();
		//Enter application URL
		driver.get("https://demo.actitime.com/login.do");
		
		//Verify URL and Title
		String actualurl=driver.getCurrentUrl();
	//	String actualtitle=driver.getTitle();
	String actualtitle1=driver.getTitle();
	
		System.out.println("actual url:"+actualurl);
		System.out.println("actual title:"+actualtitle1);
		System.out.println(actualtitle1.length());
		String expectedurl="https://demo.actitime.com/login.do";
		String expectedtitle="actiTIME - Login";
		System.out.println("URL validation:"+actualurl.equals(expectedurl));
	    System.out.println("Title validation:"+actualtitle1.equals(expectedtitle));	
	    String pagesource =driver.getPageSource();
	    System.out.println("page source length:"+pagesource.length());
	    System.out.println("page source content:"+pagesource);
	}
/*
 * open the chrome browser
 * enter the application URL as http://demo.actitime.com
 * verify following component in the login page
 * -title
 * url
 * close the browser
 */
}

 
