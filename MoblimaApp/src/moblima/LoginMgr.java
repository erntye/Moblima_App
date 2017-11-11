package moblima;

import java.util.ArrayList;

public class LoginMgr {
	ArrayList<Account> staffArray;
	ArrayList<Account> custArray;
	
	//return 0: the account.verifyLogin functions have failed
	//return 1: login success
	//return 2: wrong password
	//return 3: user name not found in staff array
	public int validate(int accType, String username, String password) {
		int result = 0;
		switch(accType) {
		case 1:
			for (Account account : staffArray) {
				result = account.verifyLogin(username, password);
				if(result == 1) {
					return result;
				} else if(result == 2) {
					return result;
				}
			}
			return result;
		case 2:
			for (Account account : custArray) {
				result = account.verifyLogin(username, password);
				if(result == 1) {
					return result;
				} else if(result == 2) {
					return result;
				}
			}
		}
	}
}