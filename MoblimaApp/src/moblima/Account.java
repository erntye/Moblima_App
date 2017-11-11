package moblima;
//test
public abstract class Account {
	private String username;
	private String password;
	private String name;

	public Account(String username, String password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}

	public boolean verifyLogin(String username, String password) {
		if ("username" == username && "password" == password) 
			return true;
		else
			return false;
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
