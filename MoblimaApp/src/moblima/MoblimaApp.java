package moblima;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

public class MoblimaApp {
	
	public static void main(String[] args){
		String[] loginDetails = new String[3];
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
		
		loginDetails = ConsoleBoundary.printLoginPage();
		if(loginDetails[0]=="1" && LoginMgr.getInstance().validate(loginDetails[0], loginDetails[1], loginDetails[2]) == 1) {
			StaffCtr.getInstance().staffOperations();
		} else if (loginDetails[0]=="2" && LoginMgr.getInstance().validate(loginDetails[0], loginDetails[1], loginDetails[2]) == 1) {
			CustCtr.getInstance().custOperations();
		}
		
		ConsoleBoundary.printLogout();
	}
	
	public void intialiseEverything() {
		
		
		//initialise login manager
		ArrayList<Account> staffArray = DataBoundary.getStaffList();
		ArrayList<Account> custArray = DataBoundary.getCustList();
		LoginMgr.getInstance().initialiseAccounts(staffArray, custArray);
	}

}
