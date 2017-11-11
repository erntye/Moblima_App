package moblima;

import java.util.ArrayList;

public class LoginMgr {
	ArrayList<Account> staffArray;
	ArrayList<Account> custArray;
	
	public int validate(int accType, String username, String password) {
		int result;
		switch(accType) {
		case 1:
			for (Account account : staffArray) {
				result = account.verifyLogin(username, password);
					
			}
		}
	}
}