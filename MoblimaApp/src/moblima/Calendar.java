package moblima;

import java.util.ArrayList;
import java.util.Date;

public class Calendar {					//Date class has to be created* using gregarion calendar to include pubHolList
		
	private static ArrayList<Date> pubHolList;
		
	public ArrayList<Date> getPubHolList() {
		return pubHolList;
	}
		
	public static void addPubHol(Date date) {
		pubHolList.add(date);
	}
		
	public boolean isPubHol(Date date) {
		for (int counter = 0; counter < pubHolList.size(); counter++) { 		      
			if (pubHolList.get(counter) == date)
				return true;
		} 
		return false;	
	}

}


