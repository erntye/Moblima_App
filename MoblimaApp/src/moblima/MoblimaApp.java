package moblima;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ArrayList;

public class MoblimaApp {
	
	public static void main(String[] args){
		initialiseEverything();	//this is to read data from database
		
		GregorianCalendar showTime = new GregorianCalendar(2017,10,14, 14, 30, 00);
		System.out.println(showTime.get(Calendar.DAY_OF_MONTH) + "/" + (showTime.get(Calendar.MONTH)+1) + " " + 
				showTime.get(Calendar.HOUR_OF_DAY) + ":"+ showTime.get(Calendar.MINUTE));
		
		
		
		String[] loginDetails = new String[3];
		
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
			case 3: //quit
				ConsoleBoundary.printTerminate();
				loop = false; break;
			}
		}
		
	
//		do{
//			
////			else if(LoginMgr.getInstance().validate(loginDetails[0], loginDetails[1], loginDetails[2]) != 1) {
////				System.out.println("Login Failed. Try Again.");
////			}
//		} while (LoginMgr.getInstance().validate(loginDetails[0], loginDetails[1], loginDetails[2]) != 1);
		
		
		
	}
	
	public static void initialiseEverything() {
		
		
		//initialise login manager
		ArrayList<Account> staffArray = DataBoundary.getStaffList();
		ArrayList<Account> custArray = DataBoundary.getCustList();
		LoginMgr.getInstance().initialiseAccounts(staffArray, custArray);
		
		//initialise cineplexlist
		CineplexList.cineplexList = DataBoundary.getCineplexList();
		//initialise moviemanager
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
		
		
	}

}
