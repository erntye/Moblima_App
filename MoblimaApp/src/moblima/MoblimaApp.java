package moblima;
import java.util.Calendar;
import java.util.Date;

public class MoblimaApp {

	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		cal.set(2001,4,14);
		Date date = cal.getTime();
		Calendar cal2 = (Calendar) cal.clone();
		cal2.add(Calendar.DATE,1);
		Date date2 = cal.getTime();
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(date);
		System.out.println(date2);
		System.out.println(date.equals(date2));
		System.out.println(cal.equals(cal2));
		
		ConsoleBoundary.loginDisplay();
		LoginMgr.validate(loginDetails[0], loginDetails[1], loginDetails[2]);
		
	}
	//try sealtong
	//test master quek
	//test g
}
