package moblima;
import java.io.*;

import java.util.ArrayList;

public class Cineplex implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3576833979103642973L;
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
	
	public void addCinema(Cinema cinemaToAdd) {
		
	}
}
