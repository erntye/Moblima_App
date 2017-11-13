package moblima;

public class CinemaMgr {

	//implement Singleton structure
	private static CinemaMgr instance;
	public static CinemaMgr getInstance() {
		if(instance == null) {
			instance = new CinemaMgr();
		}
		return instance;
	}
	
	public void CinemaOps() {
		boolean loop = true;
		
		while(loop) {
			int choice = ConsoleBoundary.printCinemaOps();
			switch(choice) {
			case 1: addCinema(); break;
			case 2: removeCinema(); break;
			case 9: loop = false; break;
			}
		}
	}
	
	public void addCinema() {
		boolean cineplexLoop = true;
		while(cineplexLoop) {
			Cineplex cineplex = ConsoleBoundary.printChooseCineplex();
			
		}
	}
	
	public void removeCinema() {
		
	}
}
