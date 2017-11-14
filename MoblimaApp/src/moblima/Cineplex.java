package moblima;
import java.io.*;

import java.util.ArrayList;

public class Cineplex implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3576833979103642973L;
	private String name;
	private String code;
	private ArrayList<Cinema> cinemaList;

	public Cineplex (String name, String code) {
		this.name = name;
		this.code = code;
		cinemaList = new ArrayList<Cinema>();
	}
	
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
 
	public ArrayList<Cinema> getCinemaList() {
		return cinemaList;
	}
	
	public void addCinema(Cinema cinemaToAdd) {
		cinemaList.add(cinemaToAdd);
	}
	
	public void removeCinema(Cinema cinemaToRemove) {
		cinemaList.remove(cinemaToRemove);
	}
}
