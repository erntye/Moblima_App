package moblima;

public class MovieBookingMgr {
	
	//implement Singleton structure
	private static MovieBookingMgr instance;
	public static MovieBookingMgr getInstance() {
		if(instance == null) {
			instance = new MovieBookingMgr();
		}
		return instance;
	}
	
	public void listByMovie(){
		
	}
	
	public void listByCineplex(){
		
	}
}
