package moblima;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
		return movieToAdd;
	}
	
	public static int printMovieOps() {
		System.out.println("========================================");
		System.out.println("MANAGE MOVIES");
		System.out.println("========================================");
		System.out.println("1. Add Movie");
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
		System.out.println("What would you like to do:\n(1)List Movies\n(2)List Shows by Cineplex\n(9) Logout");
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
		int choice = 0;
		for(int i = 0; i < MovieList.movieList.size(); i++) {
			System.out.println(i+1 + ") " + MovieList.movieList.get(i).getTitle() + "\n");
		}
		System.out.println("Choose a movie: ");
		choice = sc.nextInt();
		return MovieList.movieList.get(choice-1);
	}
	
	public static void printLogout() {
		System.out.println("========================================");
		System.out.println("GOOD BYE! SEE YOU SOON!");
		System.out.println("========================================");
	}
}