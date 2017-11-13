package moblima;

public class CineplexMgr {
	
	//implement Singleton structure
	private static CineplexMgr instance;
	public static CineplexMgr getInstance() {
		if(instance == null) {
			instance = new CineplexMgr();
		}
		return instance;
	}
	
	public void CineplexOps() {
		boolean loop = true;
		
		while(loop) {
			int choice = ConsoleBoundary.printCineplexOps();
			switch(choice) {
			case 1: addCineplex(); break;
			case 2: removeCineplex(); break;
			case 9: loop = false; break;
			}
		}
	}
	
	public void addCineplex() {
		String[] cineplexDetails = ConsoleBoundary.printAddCineplex();
		CineplexList.addCineplex(cineplexDetails[0], cineplexDetails[1]);
	}
	
	public void removeCineplex() {
		CineplexList.removeCineplex(ConsoleBoundary.printRemoveCineplex());
	}
}
