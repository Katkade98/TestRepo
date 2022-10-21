package opendriverwithwebdrivermanager;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.seleniumUtility;
import utilities.seleniumUtility;

public class openBrowserUtilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seleniumUtility util=new seleniumUtility();
		util.setUp("chrome", "https://www.google.com");
System.out.println(util.getCurrentTitleOfApplication());
	}

}
