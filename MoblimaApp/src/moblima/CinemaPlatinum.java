package moblima;

//import java.util.ArrayList;

public class CinemaPlatinum extends Cinema{
	
	private static float premium;
	
	public CinemaPlatinum(String name, int layoutNumber){
		super(name, layoutNumber);
		
	}
	
	public static void setPremium(float newPremium){
		CinemaPlatinum.premium = newPremium;
	}
}
