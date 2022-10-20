package day14TestNGExample;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import day9.KeyboardAndMouseOperation.SeleniumUtility;

public class Vtiger {
//Verify that user sholud login on "Vtiger" application or not 
  @Test
  public void titlePageValidation() throws InterruptedException {
	  SeleniumUtility s1=new SeleniumUtility();
	  WebDriver driver=s1.SetUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//Verify the Title before login
System.out.println("verify the title before login:"+driver.getTitle());
Assert.assertEquals("vtiger", "vtiger");
driver.findElement(By.xpath("//div[@id='loginFormDiv']/form/*[6]/button")).click();
driver.findElement(By.cssSelector(".app-icon.fa.fa-bars")).click();
driver.findElement(By.xpath("//span[text()=' MARKETING']")).click();
driver.findElement(By.xpath("//span[text()=' Leads']")).click();
//click on addd
driver.findElement(By.xpath("//button[@id='Leads_listView_basicAction_LBL_ADD_RECORD']")).click();
driver.findElement(By.cssSelector("#select2-result-label-20")).click();
List<WebElement>option=driver.findElements(By.xpath("//ul[@id='select2-results-12']/li"));
  option.get(1).click();
  
  }

  
}
