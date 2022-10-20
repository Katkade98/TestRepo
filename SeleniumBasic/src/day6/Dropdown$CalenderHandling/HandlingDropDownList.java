package day6.Dropdown$CalenderHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Step 1:Set the driver executable path
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//Step 2: Create the instance of chrome browser
		WebDriver driver=new ChromeDriver();
//Step 3: give implicit wait
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//Step 4: get the URL
driver.get("http://demo.automationtesting.in/Register.html");
//maximize the windows
driver.manage().window().maximize();
//Step 5: Identify the dropDown list
WebElement Skilldown=driver.findElement(By.cssSelector("#Skills"));
//Create an instance of select class and pass above element into its constructor
 Select selectSkill=new Select(Skilldown);
 //check wheather drowpdown is multiselect dropdown or not
 System.out.println("Is dropdown is allwong you to select nultiple option:"+selectSkill.isMultiple());
 //get default or already select option 
//WebElement SelectedOption =selectSkill.getFirstSelectedOption();
//String SelectedOptionName=SelectedOption.getText();
//System.out.println("already selected option:"+SelectedOptionName);
//or
System.out.println("already selected option name:"+selectSkill.getFirstSelectedOption().getText());
//get the option count
List<WebElement> option=selectSkill.getOptions();
System.out.println("skillcount:"+option.size());
//get the dropdown option name
for (int i=0;i<option.size();i++)
{
	System.out.println(option.get(i).getText());
}
//select option from dropdown 
selectSkill.selectByIndex(4);
System.out.println("Already selected option name:"+selectSkill.getFirstSelectedOption().getText());
//or
selectSkill.selectByValue("Backup Management");
System.out.println("already selected option:"+selectSkill.getFirstSelectedOption().getText());
//or
selectSkill.selectByVisibleText("APIs");
System.out.println("already selected option: "+selectSkill.getFirstSelectedOption().getText());
//TODO:Validation Dropdown skills are getting displayed in acending order
//checking the the order of skills
String skillName="";
	for (int i=1;i<option.size();i++)
	{
		if((option.size()-1)!=i)
		{
			skillName =skillName+option.get(i).getText()+",";
		}
		else
		{
			skillName=skillName+option.get(i).getText();
		}
	}
//Expected Skills
	String exp_skillName="Adobe InDesign, Adobe Photoshop, Analytics, Android, APIs, Art Design, AutoCAD, Backup Management, C, C++, Certifications, Client Server, Client Support, Configuration, Content Managment, Content Management Systems (CMS), Corel Draw, Corel Word Perfect, CSS, Data Analytics, Desktop Publishing, Design, Diagnostics, Documentation, End User Support, Email, Engineering, Excel, FileMaker Pro, Fortran, HTML, Implementation, Installation, Internet, iOS, iPhone, Linux, Java, Javascript, Mac, Matlab, Maya, Microsoft Excel, Microsoft Office, Microsoft Outlook, Microsoft Publisher, Microsoft Word, Microsoft Visual, Mobile, MySQL, Networks, Open Source Software, Oracle, Perl, PHP, Presentations, Processing, Programming, PT Modeler, Python, QuickBooks, Ruby, Shade, Software, Spreadsheet, SQL, Support, Systems Administration, Tech Support, Troubleshooting, Unix, UI / UX, Web Page Design, Windows, Word Processing, XML, XHTML";
	System.out.println("skillName:"+skillName);
	System.out.println("exp_skillName:"+exp_skillName);
	System.out.println("Skills are insorted order or not :"+skillName.equals(exp_skillName));
	}

}
