package moblima;
import java.io.*;

public abstract class Account implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6384389949172773596L;
	private String username;
	private String password;
	private String name;

	public Account(String username, String password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}

	//return 1: login success
	//return 2: wrong password
	//return 3: wrong user name
	public int verifyLogin(String username, String password) {
		if (this.username == username) {
			if(this.password == password) {
				System.out.println("in password loop");
				return 1;
			}
			else {
				System.out.println("in password loop2");
				return 2;
			}
		}
		else {
			System.out.println("in password loop3");
			return 3;
		}
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}
}
