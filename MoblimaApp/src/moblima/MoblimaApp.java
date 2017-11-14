package moblima;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

public class MoblimaApp {
	
	public static void main(String[] args){
		initialiseEverything();
		
		String[] loginDetails = new String[3];
		
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
		ArrayList<Cineplex> cineplexList = DataBoundary.getCineplexList();
		//initialise cineplexlist
		//initialise moviemanager
	}

}
