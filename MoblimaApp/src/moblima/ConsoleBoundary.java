package moblima;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.security.auth.callback.ConfirmationCallback;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.print.Printable;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;

public class ConsoleBoundary {
	static Scanner sc = new Scanner(System.in);
		
	//called by MoblimaApp
	public static int printMainMenu() {
		//sc = new Scanner(System.in);
		
		System.out.println("========================================");
		System.out.println("WELCOME TO  MOBLIMA");
		System.out.println("========================================");
		System.out.println("(1) Log In\n(2)Create Account\n(3) Quit");
		int choice = sc.nextInt();
		
		//sc.close();
		return choice;
	}
	
	//called by MoblimaApp
	public static void printAddAccount() {
		//sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("Add Account");
		System.out.println("========================================");
		boolean loop = true;
		while(loop) {
			System.out.println("(1) Add Staff Account\n(2) Add Customer Account\n(3) Done");
			switch(sc.nextInt()) {
			case 1: LoginMgr.getInstance().addStaffAccount(); break;
			case 2: LoginMgr.getInstance().addCustAccount(); break;
			case 3: loop = false; break;
			}
		}
		System.out.println("Done adding accounts..");
		//sc.close();
	}
	
	//called by LoginMgr
	public static String[] printLoginPage() {	
		//sc = new Scanner(System.in);
		String[] temploginDetails = new String[3];
		System.out.println("========================================");
		System.out.println("Log In");
		System.out.println("========================================");
		System.out.println("Account Type:\n(1) Staff\n(2) Customer");
		temploginDetails[0] = sc.nextLine();
		System.out.println("Username: ");
		temploginDetails[1] = sc.nextLine();
		System.out.println("Password: ");
		temploginDetails[2] = sc.nextLine();
		System.out.println("Verifying...");
		//sc.close();
		return temploginDetails;
	}
	
	// called by LoginMgr
	public static String[] printAddStaffAccount() {
		String[] accountDetails = new String[3];
		//sc = new Scanner(System.in);
		
		System.out.println("========================================");
		System.out.println("ADD STAFF ACCOUNT");
		System.out.println("========================================");
		System.out.print("Enter username: ");
		accountDetails[0] = sc.nextLine();
		System.out.print("Enter password: ");
		accountDetails[1] = sc.nextLine();
		System.out.print("Enter your name: ");
		accountDetails[2] = sc.nextLine();
		
		//sc.close();
		return accountDetails;
	}
	
	//called by LoginMgr
	public static String[] printAddCustAccount() {
		String[] accountDetails = new String[6];
		//sc = new Scanner(System.in);
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
		//sc.close();
		return accountDetails;
	}
	
	//called by MovieMgr 
	public static Movie printAddMovie() {
		//sc = new Scanner(System.in);
		
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
		
		//sc.close();
		return movieToAdd;
	}
	
	//called by MovieMgr 
	public static Movie printEditMovie() {
		System.out.println("========================================");
		System.out.println("EDIT MOVIE");
		System.out.println("========================================");
		return printMovieList();
	}
	
	//called by MovieMgr
	public static Movie printEditMovie2(Movie movieToEdit) {
		//sc = new Scanner(System.in);
		Movie movieToReplace;
		System.out.println("Edit Showing Status");
		System.out.println("Current Showing Status: " + movieToEdit.getShowingStatus());
		System.out.println("Choose:\n1. Coming Soon \t 2. Now Showing \t 3. Ended\t 4. Skip");
		int temp = sc.nextInt();
		Movie.Showing_Status status;
		switch(temp) {
		case 1: status = Movie.Showing_Status.ComingSoon; break;
		case 2: status = Movie.Showing_Status.NowShowing; break;
		case 3: status = Movie.Showing_Status.Ended; break;
		case 4: status = movieToEdit.getShowingStatus(); break;
		default: status = Movie.Showing_Status.ComingSoon;
		}
		sc.nextLine();
		System.out.println("Edit Censorship Rating");//G,PG, PG13,NC16,M18,R21
		System.out.println("Current Censorship Rating: " + movieToEdit.getCensorshipRating());
		System.out.println("1. G \t 2. PG \t 3. PG13 \t 4. NC16 \t 5. M18 \t 6. R21 \t 7. Skip");
		temp = sc.nextInt();
		Movie.Censorship_Rating censorR;
		switch(temp) {
		case 1: censorR = Movie.Censorship_Rating.G; break;
		case 2: censorR = Movie.Censorship_Rating.PG; break;
		case 3: censorR = Movie.Censorship_Rating.PG13; break;
		case 4: censorR = Movie.Censorship_Rating.NC16; break;
		case 5: censorR = Movie.Censorship_Rating.M18; break;
		case 6: censorR = Movie.Censorship_Rating.R21; break;
		case 7: censorR = movieToEdit.getCensorshipRating(); break;
		default: censorR = Movie.Censorship_Rating.PG;
		}
		movieToReplace = new Movie(movieToEdit.getTitle(), status, movieToEdit.getSynopsis(), movieToEdit.getDirector(), movieToEdit.getCast(), censorR);
		//sc.close();
		return movieToReplace;
//		System.out.println("Edit Synopsis: ");
//		String synopsis = sc.nextLine();
//		System.out.println("Edit Director: ");
//		String director = sc.nextLine();
//		System.out.println("Edit Number of cast: ");
//		int castNumber = sc.nextInt();
//		sc.nextLine();
//		String[] cast = new String[castNumber];
//		for(int i = 0; i < castNumber; i ++) {
//			System.out.println("Enter Cast Number " + (i+1));
//			cast[i] = sc.nextLine();
//		}
	}
	
	//called by MovieMgr
	public static void printTopRatings() {
		for(int i = 0; i<5; i++) {
			System.out.println("Title: " + MovieList.movieList.get(i).getTitle() + "\t Average Rating: " + MovieList.movieList.get(i).getAverageRating());
		}
	}
	
	//called by MovieMgr
	public static void printTopSales() {
			for(int i = 0; i<5; i++) {
				System.out.println("Title: " + MovieList.movieList.get(i).getTitle() + "\t Sales: " + MovieList.movieList.get(i).getSales());
			}
		}
	
	//called by MovieMgr
	public static int printMovieOps() {
		//sc = new Scanner(System.in);

		System.out.println("========================================");
		System.out.println("MANAGE MOVIES");
		System.out.println("========================================");
		System.out.println("(1) Add Movie");
		System.out.println("(2) Remove Movie");
		System.out.println("(3) Edit Movie");
		System.out.println("(4) Top 5 Movies By Sales");
		System.out.println("(5) Top 5 Movies By Ratings");
		System.out.println("(9) Done Managing Movies");
		int choice = sc.nextInt();
		
		//sc.close();
		return choice;
	}
	
	//called by MovieMgr
	public static Movie printRemoveMovie() {
		System.out.println("========================================");
		System.out.println("REMOVE MOVIE");
		System.out.println("========================================");
		return printMovieList();
	}
	
	//called by ShowMgr
	public static int printShowOps() {
		System.out.println("========================================");
		System.out.println("Manage Shows");
		System.out.println("========================================");
		//sc = new Scanner(System.in);
		
		System.out.println("(1) Add Show");
		System.out.println("(2) Remove Show");
		System.out.println("(3) Edit Show");
		System.out.println("(9) Done Managing Shows");
		int choice = sc.nextInt();
		
		//sc.close();
		return choice;
	}
	
	//called by ShowMgr
	public static Cinema printAddShow() {
		System.out.println("========================================");
		System.out.println("Add Shows");
		System.out.println("========================================");
		System.out.println("Choose the Cineplex and Cinema you want to add the show to, then choose the movie and enter the show time.");
		Cinema cinema = printChooseCinema(printChooseCineplex());
		return cinema;
	}
	
	//called by ShowMgr
	public static Calendar getShowTime() {
		System.out.println("========================================");
		System.out.println("Get Show Time");
		System.out.println("========================================");
		//sc = new Scanner(System.in);
		System.out.println("Enter Year: ");
		int year = sc.nextInt();
		System.out.println("Enter Month: ");
		int month = sc.nextInt();
		System.out.println("Enter Day: ");
		int day = sc.nextInt();
		System.out.println("Enter Hour: ");
		int hour = sc.nextInt();
		System.out.println("Enter Minutes: ");
		int minute = sc.nextInt();
		Calendar showTime = new GregorianCalendar(year, month, day, hour, minute, 0);
		//sc.close();
		return showTime;
	}
	
	//called by ShowMgr
	public static Cinema printRemoveShow() {
		System.out.println("========================================");
		System.out.println("Remove Shows");
		System.out.println("========================================");
		System.out.println("Choose the Cineplex and Cinema you want to remove the show from, then select the show.");
		Cinema cinema = printChooseCinema(printChooseCineplex());
		return cinema;
	}
	
	//called by ShowMgr
	public static Cinema printEditShow() {
		System.out.println("========================================");
		System.out.println("Edit Shows");
		System.out.println("========================================");
		System.out.println("Choose the Cineplex and Cinema, followed by the show you want to edit.");
		Cinema cinema = printChooseCinema(printChooseCineplex());
		return cinema;
	}
	
	//called by ShowMgr
	public static void printEditShowDetails(Show show) {
		System.out.println("========================================");
		System.out.println("Edit Show");
		System.out.println("========================================");
		//sc = new Scanner(System.in);
		
		System.out.println("Change Movie");
		System.out.println("Current Movie: " + show.getMovieTitle());
		System.out.println("1. Change Movie\n2. Skip\n");
		int choice = sc.nextInt();
		if(choice == 1) {
			Movie movieToChange = printMovieList();
			show.setMovieTitle(movieToChange.getTitle());
		}
		
		System.out.println("Change Show Time");
		System.out.println("Current Show Time: " + show.getShowTime());
		System.out.println("1. Change Show Time\n2. Skip\n");
		choice = sc.nextInt();
		if(choice == 1) {
			show.setTime(getShowTime());
		}
		
		//sc.close();
	}
	
	//called by ShowMgr
	public static Show printShowList(Cinema cinema) {
		System.out.println("========================================");
		System.out.println("Choose Show");
		System.out.println("========================================");
		//sc = new Scanner(System.in);
		ArrayList<Show> tempShows = new ArrayList<Show>();
		for(int i = 0; i<cinema.getShows().size();i++) {
			System.out.print((i+1) + ". ");
			System.out.print(cinema.getShows().get(i).getMovieTitle() + " ");
			System.out.print(cinema.getShows().get(i).getShowType() + " ");
			System.out.println(cinema.getShows().get(i).getShowTime());
			tempShows.add(cinema.getShows().get(i));
		}
		System.out.print("Enter Choice: ");
		int choice = sc.nextInt();
		
		//sc.close();
		return tempShows.get(choice-1);
	}
	
	//called by CineplexMgr
	public static int printCineplexOps() {
		//sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("========================================");
		System.out.println("Cineplex Ops");
		System.out.println("========================================");
		System.out.println("What would you like to do:");
		System.out.println("(1) Add Cineplex\n(2) Remove Cineplex\n(9) Done");
		choice = sc.nextInt();
		//sc.close();
		return choice;
	}
	
	//called by CineplexMgr
	public static String[] printAddCineplex() {
		//sc = new Scanner(System.in);
		String[] cineplexDetails = new String[2];
		System.out.println("========================================");
		System.out.println("Add Cineplex");
		System.out.println("========================================");
		System.out.print("Enter name of cineplex: ");
		cineplexDetails[0] = sc.nextLine();
		System.out.print("Enter 3 letter code of cineplex: ");
		cineplexDetails[1] = sc.nextLine();
		//sc.close();
		return cineplexDetails;
	}
	
	//called by CineplexMgr
	public static Cineplex printRemoveCineplex() {
		System.out.println("========================================");
		System.out.println("Remove Cineplex");
		System.out.println("========================================");
		System.out.println("Choose the Cineplex you wish to remove.");
		return printChooseCineplex();
	}
	
	//called by CinemaMgr
	public static int printCinemaOps(String cineplexName) {
		//sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("========================================");
		System.out.println("Manage Cinemas");
		System.out.println("========================================");
		System.out.println("You are managing cinemas in cineplex " + cineplexName);
		System.out.println("What would you like to do:");
		System.out.println("(1) Add Cinema\n(2) Remove Cinema\n(9) Done");
		choice = sc.nextInt();
		//sc.close();
		return choice;
	}
	
	//called by CinemaMgr
	public static String[] printAddCinema(String cineplexName) {
		//sc = new Scanner(System.in);
		String[] cinemaDetails = new String[3];
		
		System.out.println("========================================");
		System.out.println("Add Cinema");
		System.out.println("========================================");
		System.out.println("You are adding a cinema into the cineplex " + cineplexName);
		System.out.print("Enter Cinema Name: ");
		cinemaDetails[0] = sc.nextLine();
		System.out.println("Now choose the cinema layout");
		CSVBoundary.printAllLayout();
		System.out.print("Enter your layout choice: ");
		cinemaDetails[1] = sc.nextLine();
		System.out.println("Choose the Cinema Class");
		System.out.print("(1) Normal\n(2) Gold Class\n(3) Platinum Class");
		cinemaDetails[2] = sc.nextLine();
		
		//sc.close();
		return cinemaDetails; //index 0: name; index 1: layout number; index 2: cinema class
	}
	
	//called by CinemaMgr
	public static Cinema printRemoveCinema(Cineplex cineplex) {
		System.out.println("========================================");
		System.out.println("Add Cinema");
		System.out.println("========================================");
		System.out.println("You are removing a cinema from the cineplex " + cineplex.getName());
		return printChooseCinema(cineplex);
	}
	
	//called by StaffCtr
	public static int printStaffPage() {
		//sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("========================================");
		System.out.println("STAFF PAGE");
		System.out.println("========================================");
		System.out.println("What would you like to do:");
		System.out.println("(1) Modify Movies\n(2) Modify Shows\n(3) Modify System Settings\n(4) Modify Cineplexes\n(5) Modify Cinemas\n(9) Logout");
		choice = sc.nextInt();
		//sc.close();
		return choice;
	}
	
	
	//unsorted
	public static int printCustPage() {
		//sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("========================================");
		System.out.println("CUSTOMER PAGE");
		System.out.println("========================================");
		System.out.println("What would you like to do:\n(1) Book A Show\n(2) Add a Review\n(3) View Booking History\n(4) List Top 5 Movie By Sales\\n(5) List Top 5 Movie By Ratings\n(9) Logout");
		choice = sc.nextInt();
		//sc.close();
		return choice;
	}
	
	public static Reviews printAddReview() {
		//sc = new Scanner(System.in);
		int rating = 0;
		String review, reviewer;
		System.out.println("========================================");
		System.out.println("ADD A REVIEW");
		System.out.println("========================================");
//		System.out.println("CHOOSE MOVIE TO REVIEW");
//		for(int i = 0; i < MovieList.movieList.size(); i++) {
//			System.out.println(i+1 + ") " + MovieList.movieList.get(i).getTitle() + "\n");
//		}
//		choice = sc.nextInt();
//		Movie movie = MovieList.movieList.get(choice-1);
		System.out.println("Enter Rating:\n ");
		rating = sc.nextInt();
		System.out.println("Enter Review:\n ");
		review = sc.nextLine();
		System.out.println("Enter Name:\n ");
		reviewer = sc.nextLine();
		Reviews reviews = new Reviews(review, rating, reviewer);
		//sc.close();
		return reviews;
	}
	
	public static void printBookingHistory(CustAcc c) {
		for(int i = c.getTransactionList().size()-1; i>=0;i--) {
			System.out.println("Transaction ID: " + c.getTransactionList().get(i).getTid() + "\n Date: " + c.getTransactionList().get(i).getDate() + "\n Movie Title:" + c.getTransactionList().get(i).getMovieTitle());
		}
	}
	
	public static int printSystemSettingMenu() {
		//sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("========================================");
		System.out.println("SYSTEM SETTINGS");
		System.out.println("========================================");
		System.out.println("What would you like to do:\n(1)Change Ticket Base Price\n(2)Add Public Holiday\n(9) Done with System Settings");
		choice = sc.nextInt();
		//sc.close();
		return choice;
	}
	
	public static float askBasePrice() {
		//sc = new Scanner(System.in);
		float basePrice = 0;
		System.out.println("========================================");
		System.out.println("CHANGE TICKET BASE PRICE");
		System.out.println("========================================");
		System.out.println("Enter New Ticket Base Price: ");
		basePrice = sc.nextFloat();
		//sc.close();
		return basePrice;
	}
	
	public static Calendar askPubHol() {
		//sc = new Scanner(System.in);
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
		//sc.close();
		return date;
	}
	
	public static Movie printMovieList() {
		//sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("MOVIE LIST");
		System.out.println("========================================");
		int choice = 0;
		for(int i = 0; i < MovieList.movieList.size(); i++) {
			System.out.println(i+1 + ") " + MovieList.movieList.get(i).getTitle() + "\n");
		}
		System.out.println("Choose a movie: ");
		choice = sc.nextInt();
		//sc.close();
		return MovieList.movieList.get(choice-1);
	}
	
	public static boolean printMovieInfo(Movie movie) {
		//sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println(movie.getTitle().toUpperCase() );
		System.out.println("========================================");
		System.out.println("Movie Title: " + movie.getTitle());
		System.out.println("Showing Status: " + movie.getShowingStatus());
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
			//sc.close();
			return true;
		} else if (choice == 0) {
			MovieBookingMgr.reset = true;
		} 
		//sc.close();
		return false;
		
	}
	
	public static Cineplex printChooseCineplex() {
		//sc = new Scanner(System.in);
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
			//sc.close();
			return null;
		} else {
			//sc.close();
			return CineplexList.cineplexList.get(choice-1);
		}
		
	}
	
	public static Cinema printChooseCinema(Cineplex cineplex) {
		//sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("CHOOSE CINEMA");
		System.out.println("========================================");
		for(int i = 0 ; i < cineplex.getCinemaList().size();i++) {
			System.out.println("("+ i+1 + ") " +  cineplex.getCinemaList().get(i).getName());
		}
		System.out.println("(0) Cancel");
		int choice = sc.nextInt();
		if(choice == 0) {
			MovieBookingMgr.reset = true;
			//sc.close();
			return null;
		} else {
			//sc.close();
			return cineplex.getCinemaList().get(choice-1);
		}
	}
	
	public static String printChooseShowType() {
		//sc = new Scanner(System.in);
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
		//sc.close();
		return choiceS;
	}
	
	public static Show printShowsByMovie(Movie movie, Cinema cinema) {
		ArrayList<Show> tempShows = new ArrayList<Show>();
		//sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("CHOOSE SHOW TIME");
		System.out.println("========================================");
		System.out.println("Show Times:\n");
		for(int i = 0; i<cinema.getShows().size();i++) {
			int count = 1;
			if(cinema.getShows().get(i).getMovieTitle() == movie.getTitle()) {
				tempShows.add(cinema.getShows().get(i));
				System.out.println("(" + count + ") " + cinema.getShows().get(i).getShowTime().get(Calendar.HOUR_OF_DAY) + ":" + cinema.getShows().get(i).getShowTime().get(Calendar.MINUTE) + " (" + cinema.getShows().get(i).getShowType() + ")");
				count++;
			} else if(tempShows.size()==0){
				System.out.println("No Shows Available");
				MovieBookingMgr.reset = true;
				//sc.close();
				return null;
			}
		}
		int choice = sc.nextInt();
		//sc.close();
		return tempShows.get(choice-1);
	}
	
	public static char[] printLayout(Show show) {
		//sc = new Scanner(System.in);
		char[] seatNumber = new char[2];
		System.out.println("========================================");
		System.out.println("CHOOSE SEAT");
		System.out.println("========================================");
		// How to print seats?
		//sc.close();
		return seatNumber;
	}
	
	public static boolean printBookingConfirmation(Float price, Cinema cinema) {
		//sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("CONFIRM BOOKING?");
		System.out.println("========================================");
		System.out.println("Price: " + price);
		System.out.println("(1) Confirm\n(2) Cancel");
		int choice = sc.nextInt();
		if(choice==1) {
			//sc.close();
			return true;
		} else {
			MovieBookingMgr.reset = true;
			//sc.close();
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
	
	//called by CSV Boundary
	public static void printEmptyLayout(char[][] seatLayout, int height, int width, int choice) {
		System.out.println(choice + ". Layout "+choice);
		for(int i=0; i<height; i++) {
			for (int j=0; j<width; j++) {
			System.out.print(seatLayout[i][j]);
			System.out.print(" ");
			}
			System.out.println();
		}
	}
}