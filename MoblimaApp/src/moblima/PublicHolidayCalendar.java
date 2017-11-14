package moblima;

import java.util.ArrayList;
import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PublicHolidayCalendar implements Serializable{					

	private static float publicHolidayPremium;
	
	private static final long serialVersionUID = -7989540302679891401L;
	//Date class has to be created* using gregarion calendar to include pubHolList
		
	public static ArrayList<Calendar> pubHolList = new ArrayList<Calendar>();
		
	public ArrayList<Calendar> getPubHolList() {
		return pubHolList;
	}
		
	public static void addPubHol(Calendar date) {
		pubHolList.add(date);
	}
		
	public static boolean isPubHol(Calendar date) {
		for (int counter = 0; counter < pubHolList.size(); counter++) { 		      
			if (pubHolList.get(counter).get(Calendar.MONTH) == date.get(Calendar.MONTH)){
				if(pubHolList.get(counter).get(Calendar.DAY_OF_MONTH) == date.get(Calendar.DAY_OF_MONTH))
					return true;
			}
		} 
		return false;	
	}
	
	public static void setPublicHolidayPremium(float newPremium) {
		publicHolidayPremium = newPremium;
	}
	
	public static float getPublicHolidayPremium() {
		return publicHolidayPremium;
	}

}


