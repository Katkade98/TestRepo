package day1.OpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Open_Sinhgad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.set the required browser executable path
		System.setProperty("webdriver.chrome.driver","D:\\Acceleration workspace\\SeleniumBasic\\executables\\chromedriver.exe");
		//2.Create the instance of the required path
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.sinhgad.edu/SinhgadManagementInstitutes/");
		
		String actualurl=driver.getCurrentUrl();
		String actualtitle=driver.getTitle();
		String pagesource=driver.getPageSource();
		System.out.println("actualurl:"+actualurl);
		System.out.println("actualtitle:"+actualtitle );
		
		String expectedUrl="http://www.sinhgad.edu/SinhgadManagementInstitutes/";
	    String expectedtitle="Sinhgad Management Institutes | Empowering Academic Excellence";
	    System.out.println(actualurl.equals(expectedUrl));
	    System.out.println(actualtitle.equals(expectedtitle));
	  //  System.out.println("pagesource:"+pagesource);
		
	}

}
