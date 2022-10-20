package day9.Assignment;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//setting the browser executable path
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");

		//Create the instance of chrome browser
		WebDriver driver=new ChromeDriver();
// give implicit wait 
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 //Get the required URL frim the driver instance variable
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    Thread.sleep(3000);
       TakesScreenshot ts=(TakesScreenshot)driver;
     //get the screenshot using getScreenshotAs interface
     File file=ts.getScreenshotAs(OutputType.FILE);
     //store above screenShot into rquired location
     FileUtils.copyFile(file,new File(".\\screenshot\\google.jpg"));
     System.out.println("program done");
       //Maximize the window 
       driver.manage().window().maximize();
      
 //verify the title of the page 
  String actualTile=driver.getTitle();
  String expectedTile="OrangeHRM";
  System.out.println("compare the title equal or not:"+actualTile.equals(expectedTile));
 //url validation
 String actualUrl=driver.getCurrentUrl();
 String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
 System.out.println("compare url base on URL:"+actualUrl.equals(expectedUrl));
//Enter userName   as "Admin"
     driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin",Keys.TAB);
  
 //Enter password as ""
     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123",Keys.ENTER);
//navigate backward
     driver.navigate().back();
     Thread.sleep(3000);
     driver.navigate().forward();
WebElement customerServiceLogo=driver.findElement(By.xpath("//img[@alt='client brand banner']"));
System.out.println("customerServiceLogo is display or ot :"+customerServiceLogo.isDisplayed());
//takeScrrenShot
driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("shubham",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
driver.findElement(By.cssSelector("div[class='oxd-form-row']>div[class='oxd-grid-4 orangehrm-full-width-grid']>*:nth-child(2)>div>*:nth-child(2)>input")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
WebElement pagedown=driver.findElement(By.xpath("//body"));
pagedown.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
Thread.sleep(3000);
pagedown.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));

	}
}
