package moblima;

import java.util.ArrayList;

public class LoginMgr {
	ArrayList<Account> staffArray;
	ArrayList<Account> custArray;
	Account loggedInAccount;
	
	
	//implement Singleton structure
	private static LoginMgr instance;
	public static LoginMgr getInstance() {
		if(instance == null) {
			instance = new LoginMgr();
		}
		return instance;
	}
	
	//validates user's log in
	//return 0: the account.verifyLogin functions have failed
	//return 1: login success
	//return 2: wrong password
	//return 3: user name not found in array
	//return 4: account type invalid 
	public int validate(String accType, String username, String password) {
		int result = 0;
		int accountType = Integer.parseInt(accType);
		switch(accountType) {
		case 1:
			for (Account account : staffArray) {
				result = account.verifyLogin(username, password);
				if(result == 1) {
					CustAcc temp = (CustAcc)account;
					loggedInAccount = temp;
				}else if(result == 2) {
					return result;
				}
			}
			return 3;
		case 2:
			for (Account account : custArray) {
				result = account.verifyLogin(username, password);
				if(result == 1) {
					StaffAcc temp = (StaffAcc)account;
					loggedInAccount = temp;
				}else if(result == 2) {
					return result;
				}
			}
			return 3;
		default:
			return 4;
		}
	}
	
	public void addCustAccount() {
		String[] accountDetails = ConsoleBoundary.printAddCustAccount();
		double mobileNumber = Double.parseDouble(accountDetails[3]);
		int age = Integer.parseInt(accountDetails[5]);
		
		CustAcc.AgeCat ageCategory = CustAcc.AgeCat.ADULT; //defaults to ADULT
		if(age<11) {
			ageCategory = CustAcc.AgeCat.CHILD;
		}else if(age< 21) {
			ageCategory = CustAcc.AgeCat.STUDENT;
		}else if(age< 65) {
			ageCategory = CustAcc.AgeCat.ADULT;
		}else {
			ageCategory = CustAcc.AgeCat.SENIOR_CITIZEN;
		}
		
		CustAcc newAcc = new CustAcc(accountDetails[0],accountDetails[1],accountDetails[2],mobileNumber,accountDetails[4],ageCategory);
		if(custArray.add(newAcc))
			System.out.println("customer account added successfully!"); //for testing

	}
	
	public void addStaffAccount() {
		String[] accountDetails = ConsoleBoundary.printAddStaffAccount();
		StaffAcc newAcc = new StaffAcc(accountDetails[0],accountDetails[1],accountDetails[2]);
		if(staffArray.add(newAcc))
			System.out.println("staff account added successfully!"); //for testing
	}
	
	public void initialiseAccounts(ArrayList<Account> staffArray, ArrayList<Account> custArray) {
		this.staffArray = staffArray;
		this.custArray = custArray;
	}
}