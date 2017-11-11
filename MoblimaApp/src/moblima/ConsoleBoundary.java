package moblima;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ConsoleBoundary {
	static Scanner sc;
	
	public static String[] printLoginPage() {	
		sc = new Scanner(System.in);
		String[] loginDetails = new String[3];
		System.out.println("========================================");
		System.out.println("WELCOME TO  MOBLIMA");
		System.out.println("========================================");
		System.out.println("Account Type:\n(1) Staff\n(2) Customer");
		loginDetails[0] = sc.nextLine();
		System.out.println("Username: ");
		loginDetails[1] = sc.nextLine();
		System.out.println("Password: ");
		loginDetails[2] = sc.nextLine();
		System.out.println("Verifying...");
		sc.close();
		return loginDetails;
	}
	
	public static String[] printAddStaffAccount() {
		String[] accountDetails = new String[3];
		Scanner sc = new Scanner(System.in);
		
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
	
	public static Date askPubHol() {
		sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("ADD PUBLIC HOLIDAY");
		System.out.println("========================================");
		System.out.println("Enter New Public Holiday Date (DD-MMM-YYYY):");
		String dateInput = sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		Date date = null;
		try{
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		sc.close();
		return date;
	}
	
	public static void printLogout() {
		System.out.println("========================================");
		System.out.println("GOOD BYE! SEE YOU SOON!");
		System.out.println("========================================");
	}
}
