package moblima;

import java.util.ArrayList;

public class Cineplex {
	private String name;
	private String code;
	private ArrayList<Cinema> cinemas;

	public Cineplex (String name, ArrayList<Cinema> cinemas ) {
		this.name = name;
		this.cinemas = new ArrayList<Cinema>();

	}
	
	public String getCode() {
		return code;
	}
 

}
