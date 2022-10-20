package day1.OpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenFlipkart_MsEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.getProperty("user.dir");
        //1. we have to set the respective browser driver executable path
		System.setProperty("webdriver.edge.driver",".\\executables\\msedgedriver.exe");
		//System.setProperty("webdriver.edge.driver",(System.getProperty("user.dir")+"\\executables\\msedgedriver.exe";
		//or
		///2.Create the instance of respective browser
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		
		String actualUrl=driver.getCurrentUrl();
		String actualtitle=driver.getTitle();
		System.out.println("actual title:"+actualUrl);
		System.out.println("actual title:"+actualtitle);
	}

}
