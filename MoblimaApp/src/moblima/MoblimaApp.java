package moblima;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

public class MoblimaApp {
	
	public static void main(String[] args){
		initialiseEverything();	//this is to read data from database
		
		//what does this chunk of this do?
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
		
		//Main Menu: ask log in or create account
		int mainMenuChoice;
		boolean loop = true;
		while(loop) {
			mainMenuChoice = ConsoleBoundary.printMainMenu();
			switch(mainMenuChoice) {
			case 1: //Log In
				loginDetails = ConsoleBoundary.printLoginPage();
				if(loginDetails[0]=="1" && LoginMgr.getInstance().validate(loginDetails[0], loginDetails[1], loginDetails[2]) == 1) {
					StaffCtr.getInstance().staffOperations();
				} else if (loginDetails[0]=="2" && LoginMgr.getInstance().validate(loginDetails[0], loginDetails[1], loginDetails[2]) == 1) {
					CustCtr.getInstance().custOperations();
				}
			case 2: //Add Account
				ConsoleBoundary.printAddAccount(); break;
			case 3: //quit
				loop = false; break;
			}
		}
		
		
		//Log In
		loginDetails = ConsoleBoundary.printLoginPage();
		if(loginDetails[0]=="1" && LoginMgr.getInstance().validate(loginDetails[0], loginDetails[1], loginDetails[2]) == 1) {
			StaffCtr.getInstance().staffOperations();
		} else if (loginDetails[0]=="2" && LoginMgr.getInstance().validate(loginDetails[0], loginDetails[1], loginDetails[2]) == 1) {
			CustCtr.getInstance().custOperations();
		}
//		do{
//			
////			else if(LoginMgr.getInstance().validate(loginDetails[0], loginDetails[1], loginDetails[2]) != 1) {
////				System.out.println("Login Failed. Try Again.");
////			}
//		} while (LoginMgr.getInstance().validate(loginDetails[0], loginDetails[1], loginDetails[2]) != 1);
		
		
		ConsoleBoundary.printLogout();
	}
	
	public static void initialiseEverything() {
		
		
		//initialise login manager
		ArrayList<Account> staffArray = DataBoundary.getStaffList();
		ArrayList<Account> custArray = DataBoundary.getCustList();
		LoginMgr.getInstance().initialiseAccounts(staffArray, custArray);
		
		//initialise cineplexlist
		//initialise moviemanager
	}

}
