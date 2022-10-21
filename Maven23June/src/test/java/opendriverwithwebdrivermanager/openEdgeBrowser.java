package opendriverwithwebdrivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openEdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().version("106.0.1370.42").setup();
WebDriver driver=new EdgeDriver();
driver.get("https://www.google.com");

	}

}
