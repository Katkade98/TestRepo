package day10.DateUtilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(getRequiredDateBaseOnNumberOfDays("dd MM yyyy HH:mm:ss",-3));
System.out.println(getRequiredDateBaseOnNumberOfMonths("dd/MM/yyyy",1));
System.out.println(getRquiredDateBaseOnNumberOfYears("dd MM yyyy",5));
System.out.println(getRequiredDateBaseOnNumberOfDays("yyyy dd MM",1));
	}
public static String getRequiredDateBaseOnNumberOfDays(String format, int numberOfDays)
{
	Calendar cal =Calendar.getInstance();
	cal.add(Calendar.DATE, numberOfDays);
	SimpleDateFormat s=new SimpleDateFormat(format);
	return s.format(new Date(cal.getTimeInMillis()));
	
}
public static String getRequiredDateBaseOnNumberOfMonths(String format,int numberOfMonths)
{
Calendar cal=Calendar.getInstance();
cal.add(Calendar.MONTH, numberOfMonths);
SimpleDateFormat s=new SimpleDateFormat(format);
return s.format(new Date(cal.getTimeInMillis()));
}
public static String getRquiredDateBaseOnNumberOfYears(String format,int numberOfYears)
{
	Calendar cal=Calendar.getInstance();
	cal.add(Calendar.YEAR, numberOfYears);
	SimpleDateFormat s=new SimpleDateFormat(format);
	return s.format(new Date(cal.getTimeInMillis()));
	
}
}
