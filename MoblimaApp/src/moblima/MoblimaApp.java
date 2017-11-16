package moblima;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ArrayList;

public class MoblimaApp {
	
	public static void main(String[] args){
		initialiseEverything();
		
		GregorianCalendar showTime = new GregorianCalendar(2017,10,14, 14, 30, 00);
		System.out.println(showTime.get(Calendar.DAY_OF_MONTH) + "/" + (showTime.get(Calendar.MONTH)) + " " + 
				showTime.get(Calendar.HOUR_OF_DAY) + ":"+ showTime.get(Calendar.MINUTE));
		
		
		
		String[] loginDetails = new String[3];
		
<<<<<<< HEAD
		//Log In
		loginDetails = ConsoleBoundary.printLoginPage();
		if(loginDetails[0]=="1" && LoginMgr.getInstance().validate(loginDetails[0], loginDetails[1], loginDetails[2]) == 1) {
			StaffCtr.getInstance().staffOperations();
		} else if (loginDetails[0]=="2" && LoginMgr.getInstance().validate(loginDetails[0], loginDetails[1], loginDetails[2]) == 1) {
			CustCtr.getInstance().custOperations();
=======
		//Main Menu: ask log in or create account
		int mainMenuChoice;
		boolean loop = true;
		while(loop) {
			mainMenuChoice = ConsoleBoundary.printMainMenu();
			switch(mainMenuChoice) {
			case 1: //Log In
				LoginMgr.getInstance().login(); break;
			case 2: //Add Account
				ConsoleBoundary.printAddAccount(); break;
			case 0: //quit
				ConsoleBoundary.printTerminate();
				loop = false; break;
			}
>>>>>>> branch 'master' of https://github.com/erntye/Moblima_App.git
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
<<<<<<< HEAD
=======
		MovieList.movieList = DataBoundary.getMovieList();
		PublicHolidayCalendar.pubHolList = DataBoundary.getPubHolList();
		float[] basePrices = CSVBoundary.retrieveBasePrices();
		Show.setBasePrice(basePrices[0]);
		ShowDigital.setBasePrice(basePrices[1]);
		Show3D.setBasePrice(basePrices[2]);
		ShowIMAX.setBasePrice(basePrices[3]);
		
		float[] cinemaPremiums = CSVBoundary.retrieveCinemaPremium();
		Cinema.setPremium(cinemaPremiums[0]);
		CinemaGold.setPremium(cinemaPremiums[1]);
		CinemaPlatinum.setPremium(cinemaPremiums[2]);
		
		
>>>>>>> branch 'master' of https://github.com/erntye/Moblima_App.git
	}

}
