package day1.OpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// strp1/ set the browser executable path
		System.setProperty("webdriver.edge.driver",".\\executables\\msedgedriver.exe");// relative path
		// step 2//create the instance of the respective browser
		// int Generic way
		WebDriver driver = new EdgeDriver();
		// get the URL
		driver.get(
				"https://career4.successfactors.com/career?company=bentleyprod&site=&lang=en_US&requestParams=ECXe6ZytzktZ65BOIlq4DGsRf6V42m1Q3UqCQRCdNPMvKgm66xVEzOSDLioISygIxG66%2bBr3m3Rl%0a2113x1SCnqgeInqCuuwFooveodWCNFrYhZ1z5sw58%2fAJGe%2bg1MdbLA9ZqvIJ%2bt4Z2kz27el56%2bol%0aDakGFJTBpIGCjWtCnnuOfM%2boZGz3D2B6Vke58G6EW2BY9pJp6GDz8nSmqlB3yy12Unf3Hl8v3j%2b2%0a745TAGMb6EsMwJATSpLmZjIcwD2kv%2bu5vun46og6DCWBjsjFoRI7GsRygZipRVF9l6HojZCoDq1V%0akwX8GpWngIf2c2lJSU3z%2bMqRdCSYYU0Y50ghS6PjRTPFWlSr7ETVar1SCUTpm5rJaVRtT%2b6%2fYVlh%0abizqXyOpINIJIRVNrDPJ31%2f%2bJ6L282rr08QYAkkxcxWWO93mwkDScbs1%2fgLRyoJt&login_ns=register&career_ns=job%5fapplication&career_job_req_id=48865&jobPipeline=Direct&clientId=jobs2web&_s.crb=7Is4NWi1xh%2bZ2kM%2bJllo7byZQeu2QdmKjb5fYjBOMBA%3d");

		// get the current url
		String actualurl = driver.getCurrentUrl();
		System.out.println("print the actual URL:" + actualurl);
		// get the title
		String actualtitle = driver.getTitle();
		System.out.println("print the actual title:" + actualtitle);
		// get the console
		String atualconsole = driver.getPageSource();
		System.out.println("actual console:" + atualconsole);

		String expectedurl = "https://www.amazon.in/";

		String expectedtitle = "Amazon";

		System.out.println("check the url validation:" + actualurl.equals(expectedurl));
		System.out.println("check the title validation:" + actualtitle.equals(expectedtitle));

		//driver.close();
	}

}
