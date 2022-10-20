package day1.OpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.Set a path for driver executable
		System.setProperty("webdriver.chrome.driver","D:\\Acceleration workspace\\SeleniumBasic\\executables\\chromedriver.exe");
//2.Create a instance of ChromeBrowser class
		WebDriver driver=new ChromeDriver();
	
	}

}
