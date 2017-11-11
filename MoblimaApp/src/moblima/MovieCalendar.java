package moblima;

import java.util.ArrayList;
import java.util.Calendar;

public class MovieCalendar {					
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


