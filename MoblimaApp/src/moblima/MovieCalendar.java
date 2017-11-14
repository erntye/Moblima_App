package moblima;

import java.util.ArrayList;
import java.io.*;
import java.util.Calendar;

public class MovieCalendar implements Serializable{					
	/**
	 * 
	 */
	private static final long serialVersionUID = -7989540302679891401L;
	//Date class has to be created* using gregarion calendar to include pubHolList
		
	private static ArrayList<Calendar> pubHolList;
		
	public ArrayList<Calendar> getPubHolList() {
		return pubHolList;
	}
		
	public static void addPubHol(Calendar date) {
		pubHolList.add(date);
	}
		
	public boolean isPubHol(Calendar date) {
		for (int counter = 0; counter < pubHolList.size(); counter++) { 		      
			if (pubHolList.get(counter) == date)
				return true;
		} 
		return false;	
	}

}


