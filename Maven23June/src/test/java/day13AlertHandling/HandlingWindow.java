package day13AlertHandling;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.seleniumUtility;

public class HandlingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
seleniumUtility s1=new seleniumUtility();
WebDriver driver=s1.setUp("chrome","https://etrain.info/in");
//get the current window id
String homePageWinId=driver.getWindowHandle();
System.out.println("Home page window ID:"+homePageWinId);
//perform click operation to open Linkedin page in a new tab
driver.findElement(By.xpath("//i[@class='icon-linkedin']")).click();
//get all window unique IDs which are opened by selenium current instance 
Set<String>allWind=driver.getWindowHandles();
System.out.println("print all window :"+allWind);//	T1/T2
//remove home window id from all window id thenyouwill get the child window id 
allWind.remove(homePageWinId);//T2
System.out.println("after removing homewindow id, then all window ids:"+allWind);

//get the child window id using iterator
Iterator<String>itr=allWind.iterator();
String childWind=itr.next();
//now we you can switch our control main window to the child window 
driver.switchTo().window(childWind);
//or
driver.switchTo().window(allWind.iterator().next());


//now you are allow to identify  any element from child window
System.out.println("Linkedin page title:"+driver.getTitle());
System.out.println("Linkedin page url:"+driver.getCurrentUrl());
//close the current instance in the browser
driver.close();
//driver.quit();//comment below code


//switch back to the homepage window  inorder to perfrom any required operation on that 
driver.switchTo().window(homePageWinId);
//now you are allow to identify any element from the homwpages
System.out.println("homepage title:"+driver.getTitle());
System.out.println("homepage URL:"+driver.getCurrentUrl());
//close current instance or browser 
driver.close();
//close all the instance opended by browser
driver.quit();

	
	}

}
