package day9.KeyboardAndMouseOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReusableFunction {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     setup("chrome","https://www.google.com");
    System.out.println("get the Title:"+driver.getTitle());
	}
	static WebDriver setup (String browserName, String URL)
	{
		
		 String exePath;
	   if (browserName.equalsIgnoreCase("chrome")) {
		 exePath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver",exePath);
		//creating an instance of chromdriver and up-casted into webdriver interface
		 driver=new ChromeDriver();
	}
	   else if(browserName.equalsIgnoreCase("firefox"))
	   {
		   exePath=System.getProperty("user.dir")+".\\executables\\geckodriver.exe";
		//Setting the driver executable path
		   System.setProperty("webdriver.gecko.driver", exePath);
		   //create the firefox instance and upcast into webdriver interface
		   driver=new FirefoxDriver();
	   }
	   else if (browserName.equalsIgnoreCase("edge"))
	   {
		    exePath=System.getProperty("user.dir")+"\\executables\\msedgedriver.exe";
		   //Setting the driver executable path
		   System.setProperty("webdriver.edge.driver", exePath);
		   driver =new EdgeDriver(); 
	   }
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   //to get  the application URL
	   driver.get(URL);
	   return driver;
}
	static void cleanUp()
	{
		driver.close();
	}
}
