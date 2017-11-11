package moblima;
import java.util.Scanner;

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
		System.out.println("What would you like to do:\n(1)See Movies\n(2)Book Tickets\n(9) Logout");
		choice = sc.nextInt();
		sc.close();
		return choice;
	}
	
	public static void printLogout() {
		System.out.println("========================================");
		System.out.println("GOOD BYE! SEE YOU SOON!");
		System.out.println("========================================");
	}
}
