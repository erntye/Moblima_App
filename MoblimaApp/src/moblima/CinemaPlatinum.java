package moblima;

//import java.util.ArrayList;

public class CinemaPlatinum extends Cinema{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5548834023821324115L;
	private static float premium;
	
	public CinemaPlatinum(String name, int layoutNumber){
		super(name, layoutNumber);
		
	}
	
	public static void setPremium(float newPremium){
		CinemaPlatinum.premium = newPremium;
	}
}
