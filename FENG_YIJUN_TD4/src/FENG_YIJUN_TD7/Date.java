/**
 * 
 */
package FENG_YIJUN_TD7;

import java.util.Date;
import java.util.GregorianCalendar;

public class Date {
	public static void main(String[] args){
		
		GregorianCalendar calendar = new GregorianCalendar();
		Date date = new Date();
		
		calendar.setTime(Date);
		
		System.out.println("Time: "+calendar.getTime());
		System.out.println("Date: "+calendar.get(calendar.DATE));
		System.out.println("Month: "+calendar.get(calendar.MONTH));
		System.out.println("Year: "+calendar.get(calendar.YEAR));
		
		System.out.println("DAY_OF_YEAR: " + calendar.get(calendar.DAY_OF_YEAR));
		System.out.println("HOUR_OF_DAY: " + calendar.get(calendar.HOUR_OF_DAY));

	}
}
