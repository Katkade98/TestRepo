package day5.Assignment_MutipleElementHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTime {

	public static void main(String[] args) {
//		1. open browser and enter the url https://demo.actitime.com/login.do
//			2. enter the username and password as admin and manager
//			3. click on login button
//			4. click on task tab 
//			5. validate task page
//			6. click on "add new" and select "new task"
//			7. select customer
//			8. select Project "Android Testing"
//			9. Task name as "Testing"
//			10.Type of work is "Testing" 
//			11. click on "Create Task" button
//			12. Validate "Testing" task is created or not
//			13. Select checkbox of Created task "Testing"
//			14. click on "Delete" but
//			15. confirm deletion 
//			16. check "Testing" task is deleted or not
//			17. logout and close the browser
//Set the required by browser executable path
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
// create the instance of  respective browser
		WebDriver driver = new ChromeDriver();
// give the implicit
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//1. open browser and enter the url https://demo.actitime.com/login.do
		driver.get(" https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
//2. enter the username and password as admin and manager
		driver.findElement(By.cssSelector("input[name=\'username\']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name=\'pwd\']")).sendKeys("manager");
//	3. click on login button
		driver.findElement(By.id("loginButton")).click();
// 4. click on task tab 
		driver.findElement(By.cssSelector("#container_tasks")).click();
//validate task page
String ActualTitle=driver.getTitle();
String ExpectedTitle="actiTIME - Task List";
System.out.println("actual title:"+ActualTitle);
if (ActualTitle.equals(ExpectedTitle))
{
	System.out.println("Title validation done...");
}
else
{
	System.out.println("Title validation fail...");
}
//6. click on "add new" and select "new task"
driver.findElement(By.cssSelector("div.addNewContainer")).click();
//select new task
WebDriverWait wait=new WebDriverWait(driver,20);
wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.createNewTasks")));
driver.findElement(By.cssSelector("div.createNewTasks")).click();

//7. select customer



//driver.findElement(By.className("emptySelection")).click();
//driver.findElement(By.cssSelector("div.customerOrProjectSelector :nth-child(2)>div div>:nth-child(4)")).click();
////8. select Project "Android Testing"
////driver.findElement(By.className("emptySelection")).click();

	
	}

}
