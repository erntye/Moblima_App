package moblima;

import java.util.ArrayList;

public class CinemaPlatinum extends Cinema{
	
	private static float premium;
	
	public CinemaPlatinum(String name, char[][] seatLayout){
		super(name, seatLayout);
	}
	
	public static void setPremium(float newPremium){
		CinemaPlatinum.premium = newPremium;
	}
}
