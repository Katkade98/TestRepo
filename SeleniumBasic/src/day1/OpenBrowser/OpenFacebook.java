package day1.OpenBrowser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         //1.set the browser driver executable path first
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		//2. Create the instance of the required browser through generic way
		Thread.sleep(6000); 
		WebDriver driver=new ChromeDriver();
		//get url
		driver.get("https://www.facebook.com/");
		//get current url
		String actualurl=driver.getCurrentUrl();
		String Actualtitle=driver.getTitle();
		System.out.println("actual url: "+actualurl);
		System.out.println("actualtitle:"+Actualtitle);
		String pagesourcecode=driver.getPageSource();
		System.out.println("page source code:"+pagesourcecode);
		
		
		String expectedURL="https://www.facebook.com/";
		String expectedtitle="Facebook – log in or sign up";
		
		System.out.println(actualurl.equals(expectedURL));
		System.out.println(Actualtitle.equals(expectedtitle));
		driver.close();
	}

}
