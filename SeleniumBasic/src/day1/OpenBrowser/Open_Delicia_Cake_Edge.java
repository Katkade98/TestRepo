package day1.OpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Open_Delicia_Cake_Edge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.first we need to set required browser executable path
		System.setProperty("webdriver.edge.driver",".\\executables\\msedgedriver.exe");
	//2. Create the instance of the respective browser
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/people/Delicia-cakes/100064055711473/?referrer=whatsapp");
		
		String actualURL=driver.getCurrentUrl();
		String actualtitle=driver.getTitle();
		System.out.println("actualURL:"+actualURL);
		System.out.println("actualTitle:"+actualtitle);
	}

}
