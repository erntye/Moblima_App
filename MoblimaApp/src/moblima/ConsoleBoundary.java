package moblima;
import java.util.Scanner;

public class ConsoleBoundary {
	static Scanner sc = new Scanner(System.in);
	static String[] loginDetails = new String[3];
	
	public static String[] loginDisplay() {	
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
		return loginDetails;
	}
}
