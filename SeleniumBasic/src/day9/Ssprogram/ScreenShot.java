package day9.Ssprogram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import day9.KeyboardAndMouseOperation.SeleniumUtility;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
SeleniumUtility m1=new SeleniumUtility();
WebDriver driver=m1.SetUp("chrome","http://www.google.com");
//type cast WebDriver instance into TakeScrrenshot interface
TakesScreenshot ts=(TakesScreenshot)driver;
//get the screenshot using getScreenshotAs interface
File file=ts.getScreenshotAs(OutputType.FILE);
//store above screenShot into rquired location
 FileUtils.copyFile(file,new File(".\\screenshot\\google.jpg"));
System.out.println("program done");
	}

}
