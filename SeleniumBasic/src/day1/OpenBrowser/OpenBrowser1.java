package day1.OpenBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//step 1: using System.setProperty(key,value) set to path for ChromeDriver.exe
		System.setProperty("webdriver.chrome.driver","D:\\Acceleration workspace\\SeleniumBasic\\executables\\chromedriver.exe" );
//Step 2: create  an instance of ChromeDriver class
		ChromeDriver cdriver=new ChromeDriver();
	}

}
