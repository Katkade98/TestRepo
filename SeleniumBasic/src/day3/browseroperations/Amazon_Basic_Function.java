package day3.browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Basic_Function {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//set the required browser executable path
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
//create the instance of the required browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// get the url or maximize and set size of browser windows
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(500, 500));
		driver.get("https://www.amazon.in/india/s?k=india");
		driver.manage().window().maximize();
		// get the title page
		String actualtitle = driver.getTitle();
		System.out.println("actual url:" + actualtitle);
//	now click on first main link say "Amazon pay"
		// Thread.sleep(3000);
		// driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.className("icp-nav-flag")).click();
		//navigate back to the home page
		Thread.sleep(3000);
		//driver.navigate().back();
		//get the title of current page
		String languagepage=driver.getTitle();
		System.out.println("language page title:"+languagepage);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		//driver.navigate().to("http://www.google.com");
		
		driver.findElement(By.linkText("Fashion")).click();
		//by using id css
		driver.findElement(By.cssSelector("#nav-cart")).click();
		int sidenumber=driver.findElements(By.className("a-carousel")).size();
		System.out.println("print the number of slider present in :"+sidenumber);
		// click on amazon pay option
		// not work why?
		// driver.findElement(By.className("nav-a ")).click();
		// driver.findElement(By.tagName("span") ).click();
		// driver.findElement(By.xpath("//a[text()='Amazon Pay']")).click();

	}

}
