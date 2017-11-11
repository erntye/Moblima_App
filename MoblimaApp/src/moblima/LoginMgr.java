package moblima;

import java.util.ArrayList;

public class LoginMgr {
	ArrayList<Account> staffArray;
	ArrayList<Account> custArray;
	
	//return 0: the account.verifyLogin functions have failed
	//return 1: login success
	//return 2: wrong password
	//return 3: user name not found in array
	//return 4: account type invalid 
	public int validate(int accType, String username, String password) {
		int result = 0;
		switch(accType) {
		case 1:
			for (Account account : staffArray) {
				result = account.verifyLogin(username, password);
				if(result == 1 || result == 2) {
					return result;
				}
			}
			return 3;
		case 2:
			for (Account account : custArray) {
				result = account.verifyLogin(username, password);
				if(result == 1 || result == 2) {
					return result;
				}
			}
			return 3;
		default:
			return 4;
		}
	}
	
	public void addCustAccount() {
		
	}
	
	public void addStaffAccount() {
		String[] accountDetails = ConsoleBoundary.printAddStaffAccount();
		StaffAcc newAcc = new StaffAcc(accountDetails[0],accountDetails[1],accountDetails[2]);
		if(staffArray.add(newAcc))
			System.out.println("staff account added successfully!"); //for testing
	}
	
	public void initialiseAccounts() {
		
	}
}