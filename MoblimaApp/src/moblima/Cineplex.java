package moblima;

import java.util.ArrayList;

public class Cineplex {
	public static String name; //changed to public
	private String code;
	public ArrayList<Cinema> cinemas; // changed to public

	public Cineplex (String name) {
		this.name = name;

	}
	
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
 
	public ArrayList<Cinema> getCinemas() {
		return cinemas;
	}
	
	
}
