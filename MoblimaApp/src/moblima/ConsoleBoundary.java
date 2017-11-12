package moblima;
import java.util.Scanner;

import javax.security.auth.callback.ConfirmationCallback;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.print.Printable;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;

public class ConsoleBoundary {
	static Scanner sc;
	
	public static String[] printLoginPage() {	
		sc = new Scanner(System.in);
		String[] temploginDetails = new String[3];
		System.out.println("========================================");
		System.out.println("WELCOME TO  MOBLIMA");
		System.out.println("========================================");
		System.out.println("Account Type:\n(1) Staff\n(2) Customer");
		temploginDetails[0] = sc.nextLine();
		System.out.println("Username: ");
		temploginDetails[1] = sc.nextLine();
		System.out.println("Password: ");
		temploginDetails[2] = sc.nextLine();
		System.out.println("Verifying...");
		sc.close();
		return temploginDetails;
	}
	
	
	// called by LoginMgr
	public static String[] printAddStaffAccount() {
		String[] accountDetails = new String[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========================================");
		System.out.println("ADD STAFF ACCOUNT");
		System.out.println("========================================");
		System.out.print("Enter username: ");
		accountDetails[0] = sc.nextLine();
		System.out.print("Enter password: ");
		accountDetails[1] = sc.nextLine();
		System.out.print("Enter your name: ");
		accountDetails[2] = sc.nextLine();
		
		sc.close();
		return accountDetails;
	}
	
	public static String[] printAddCustAccount() {
		String[] accountDetails = new String[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("ADD CUSTOMER ACCOUNT");
		System.out.println("========================================");
		System.out.print("Enter username: ");
		accountDetails[0] = sc.nextLine();
		System.out.print("Enter password: ");
		accountDetails[1] = sc.nextLine();
		System.out.print("Enter your name: ");
		accountDetails[2] = sc.nextLine();
		System.out.print("Enter mobile number: ");
		accountDetails[3] = sc.nextLine();
		System.out.print("Enter email address: ");
		accountDetails[4] = sc.nextLine();
		System.out.print("Enter your age: ");
		accountDetails[5] = sc.nextLine();
		sc.close();
		return accountDetails;
	}
	
	
	//called by MovieMgr 
	public static Movie printAddMovie() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========================================");
		System.out.println("ADD MOVIE");
		System.out.println("========================================");
		System.out.println("Enter Title: ");
		String title = sc.nextLine();
		System.out.println("Enter Showing Status: ");
		System.out.println("1. Coming Soon \t 2. Now Showing \t 3. Ended");
		int temp = sc.nextInt();
		Movie.Showing_Status status;
		switch(temp) {
		case 1: status = Movie.Showing_Status.ComingSoon; break;
		case 2: status = Movie.Showing_Status.NowShowing; break;
		case 3: status = Movie.Showing_Status.Ended; break;
		default: status = Movie.Showing_Status.ComingSoon;
		}
		sc.nextLine();
		System.out.println("Enter Synopsis: ");
		String synopsis = sc.nextLine();
		System.out.println("Enter Director: ");
		String director = sc.nextLine();
		System.out.println("Enter Number of cast: ");
		int castNumber = sc.nextInt();
		sc.nextLine();
		String[] cast = new String[castNumber];
		for(int i = 0; i < castNumber; i ++) {
			System.out.println("Enter Cast Number " + (i+1));
			cast[i] = sc.nextLine();
		}
		System.out.println("Enter Censorship Rating: ");//G,PG, PG13,NC16,M18,R21
		System.out.println("1. G \t 2. PG \t 3. PG13 \t 4. NC16 \t 5. M18 \t 6. R21");
		temp = sc.nextInt();
		Movie.Censorship_Rating censorR;
		switch(temp) {
		case 1: censorR = Movie.Censorship_Rating.G; break;
		case 2: censorR = Movie.Censorship_Rating.PG; break;
		case 3: censorR = Movie.Censorship_Rating.PG13; break;
		case 4: censorR = Movie.Censorship_Rating.NC16; break;
		case 5: censorR = Movie.Censorship_Rating.M18; break;
		case 6: censorR = Movie.Censorship_Rating.R21; break;
		default: censorR = Movie.Censorship_Rating.PG;
		}
		Movie movieToAdd = new Movie(title, status, synopsis, director, cast, censorR);
		
		sc.close();
		return movieToAdd;
	}
	
	public static int printMovieOps() {
		Scanner sc = new Scanner(System.in);

		System.out.println("========================================");
		System.out.println("MANAGE MOVIES");
		System.out.println("========================================");
		System.out.println("1. Add Movie");
		System.out.println("2. Remove Movie");
		System.out.println("3. Edit Movie");
		int choice = sc.nextInt();
		
		sc.close();
		return choice;
	}
	
	public static Movie printRemoveMovie() {
		System.out.println("========================================");
		System.out.println("REMOVE MOVIE");
		System.out.println("========================================");
		return printMovieList();
	}
	
	
	//unsorted
	public static int printStaffPage() {
		sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("========================================");
		System.out.println("STAFF PAGE");
		System.out.println("========================================");
		System.out.println("What would you like to do:\n(1)Modify Movies\n(2)Modify Shows\n(3)Modify System Settings\n(9) Logout");
		choice = sc.nextInt();
		sc.close();
		return choice;
	}
	
	public static int printCustPage() {
		sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("========================================");
		System.out.println("CUSTOMER PAGE");
		System.out.println("========================================");
		System.out.println("What would you like to do:\n(1) List Movies\n(2) List Shows by Cineplex\n(3) Add a Review\n(9) Logout");
		choice = sc.nextInt();
		sc.close();
		return choice;
	}
	
	public static int printSystemSettingMenu() {
		sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("========================================");
		System.out.println("SYSTEM SETTINGS");
		System.out.println("========================================");
		System.out.println("What would you like to do:\n(1)Change Ticket Base Price\n(2)Add Public Holiday\n(9) Logout");
		choice = sc.nextInt();
		sc.close();
		return choice;
	}
	
	public static float askBasePrice() {
		sc = new Scanner(System.in);
		float basePrice = 0;
		System.out.println("========================================");
		System.out.println("CHANGE TICKET BASE PRICE");
		System.out.println("========================================");
		System.out.println("Enter New Ticket Base Price: ");
		basePrice = sc.nextFloat();
		sc.close();
		return basePrice;
	}
	
	public static Calendar askPubHol() {
		sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("ADD PUBLIC HOLIDAY");
		System.out.println("========================================");
		System.out.println("Enter New Public Holiday Date");
		System.out.print("Enter Day:");
		int day = sc.nextInt();
		System.out.print("Enter Month:");
		int month = sc.nextInt();
		System.out.print("Enter Year:");
		int year = sc.nextInt();
		Calendar date = new GregorianCalendar(year,month,day);
		sc.close();
		return date;
	}
	
	public static Movie printMovieList() {
		sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("MOVIE LIST");
		System.out.println("========================================");
		int choice = 0;
		for(int i = 0; i < MovieList.movieList.size(); i++) {
			System.out.println(i+1 + ") " + MovieList.movieList.get(i).getTitle() + "\n");
		}
		System.out.println("Choose a movie: ");
		choice = sc.nextInt();
		sc.close();
		return MovieList.movieList.get(choice-1);
	}
	
	public static boolean printMovieInfo(Movie movie) {
		sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println(movie.getTitle().toUpperCase() );
		System.out.println("========================================");
		System.out.println("Movie Title: " + movie.getTitle());
//		System.out.println("Showing Status: " + movie.getShowingStatus());
		System.out.println("Synopsis: " + movie.getSynopsis());
		System.out.println("Director: " + movie.getDirector());
		System.out.println("Cast: " + movie.getCast()[0] + movie.getCast()[1]);;
		System.out.println("Average Rating: " + movie.getAverageRating());
		System.out.println("Past Reviews: ");
		for(int i = 0; i<movie.getReviews().size();i++) {
			System.out.println("Reviewer: " + movie.getReviews().get(i).getReviewer());
			System.out.println("Rating: " + movie.getReviews().get(i).getRating());
			System.out.println("Review: " + movie.getReviews().get(i).getContent());
		}
		System.out.println("(1) Proceed to book tickets\n(0) Cancel");
		int choice = sc.nextInt();
		if(choice==1) {
			sc.close();
			return true;
		} else if (choice == 0) {
			MovieBookingMgr.reset = true;
		} 
		sc.close();
		return false;
		
	}
	
	public static Cineplex printChooseCineplex() {
		sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("CHOOSE CINEPLEX");
		System.out.println("========================================");
		for(int i = 0 ; i < CineplexList.cineplexList.size();i++) {
			System.out.println("("+ i+1 + ") " + CineplexList.cineplexList.get(i).getName());
		}
		System.out.println("(0) Cancel");
		int choice = sc.nextInt();
		if(choice == 0) {
			MovieBookingMgr.reset = true;
			sc.close();
			return null;
		} else {
			sc.close();
			return CineplexList.cineplexList.get(choice-1);
		}
		
	}
	
	public static Cinema printChooseCinema(Cineplex cineplex) {
		sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("CHOOSE CINEMA");
		System.out.println("========================================");
		for(int i = 0 ; i < CineplexList.cineplexList.size();i++) {
			System.out.println("("+ i+1 + ") " +  cineplex.getCinemas().get(i).getName());
		}
		System.out.println("(0) Cancel");
		int choice = sc.nextInt();
		if(choice == 0) {
			MovieBookingMgr.reset = true;
			sc.close();
			return null;
		} else {
			sc.close();
			return cineplex.getCinemas().get(choice-1);
		}
	}
	
	public static String printChooseShowType() {
		sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("CHOOSE SHOW TYPE");
		System.out.println("========================================");
		System.out.println("(1) Digital\n(2) 3D\n(3) IMAX");
		int choice = sc.nextInt();
		String choiceS = null;
		switch(choice){
			case 1: choiceS = "Digital"; break;
			case 2: choiceS = "3D"; break;
			case 3: choiceS = "IMAX"; break;
		}
		sc.close();
		return choiceS;
	}
	
	public static Show printShowsByMovie(Movie movie, Cineplex cineplex, Cinema cinema, String showType) {
		ArrayList<Show> tempShows = new ArrayList<>();
		sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("CHOOSE SHOW TIME");
		System.out.println("========================================");
		System.out.println("Show Times:\n");
		for(int i = 0; i<cinema.getShows().size();i++) {
			int count = 1;
			if(cinema.getShows().get(i).getMovieTitle() == movie.getTitle()) {
				tempShows.add(cinema.getShows().get(i));
				System.out.println("(" + count + ") " + cinema.getShows().get(i).getShowTime().get(Calendar.HOUR_OF_DAY) + ":" + cinema.getShows().get(i).getShowTime().get(Calendar.MINUTE));
				count++;
			} else if(tempShows.size()==0){
				System.out.println("No Shows Available");
				MovieBookingMgr.reset = true;
				sc.close();
				return null;
			}
		}
		int choice = sc.nextInt();
		sc.close();
		return tempShows.get(choice-1);
	}
	
	public static char[] printLayout(Show show) {
		sc = new Scanner(System.in);
		char[] seatNumber = new char[2];
		System.out.println("========================================");
		System.out.println("CHOOSE SEAT");
		System.out.println("========================================");
		// How to print seats?
		sc.close();
		return seatNumber;
	}
	
	public static boolean printBookingConfirmation(Float price, Cinema cinema) {
		sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("CONFIRM BOOKING?");
		System.out.println("========================================");
		System.out.println("Price: " + price);
		System.out.println("(1) Confirm\n(2) Cancel");
		int choice = sc.nextInt();
		if(choice==1) {
			sc.close();
			return true;
		} else {
			MovieBookingMgr.reset = true;
			sc.close();
			return false;
		}
	}
	
	public static void printTransaction(CustAcc c,Transaction latest, Show show,String showType,char[] seatNumber, float price) {
		System.out.println("========================================");
		System.out.println("BOOKING CONFIRMED!");
		System.out.println("========================================");
		System.out.println("Transaction ID: " + latest.getTid());
		System.out.println("Name: " + c.getName());
		System.out.println("Email: " + c.getName());
		System.out.println("Movie Title: " + show.getMovieTitle());
		System.out.println("Show Time: " + show.getShowTime());
		System.out.println("Seat Number : " + seatNumber[0] + seatNumber[1]);
		System.out.println("Price: " + price);
	}
	
	public static void printLogout() {
		System.out.println("========================================");
		System.out.println("GOOD BYE! SEE YOU SOON!");
		System.out.println("========================================");
	}
}