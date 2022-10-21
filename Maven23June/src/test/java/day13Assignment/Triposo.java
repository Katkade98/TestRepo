package day13Assignment;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.seleniumUtility;

public class Triposo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
seleniumUtility s1=new seleniumUtility();
WebDriver driver=s1.setUp("chrome","https://etrain.info/in");
//get the current window id 
String HomepageWind=driver.getWindowHandle();
System.out.println("print the current window :"+HomepageWind);

// performing click operation to open Linkedin page in new tab 
driver.findElement(By.cssSelector(".icon-youtube")).click();

//get all window unique Ids which are opened by selenium current instance 
Set<String>allWind=driver.getWindowHandles();
System.out.println("All window ID:"+allWind);//T1//T2


//remove home window id from all window id dn you will get child window id
allWind.remove(HomepageWind);//T2
System.out.println("After remvoing homeWindID,all window ID:"+allWind);


//get child window id using iterator
Iterator<String> itr=allWind.iterator();
String childWindId=itr.next();
//now you can switch you control from Main window to child window 
driver.switchTo().window(childWindId);

//validate the current title and URL 
//Title validation
System.out.println("Title validation:"+driver.getTitle());
System.out.println("URL validation:"+driver.getCurrentUrl());
driver.close();
driver.switchTo().window(HomepageWind);
//validation main page
System.out.println("current page validation:"+driver.getTitle());
System.out.println("current Paag URL:"+driver.getCurrentUrl());



	}

}
