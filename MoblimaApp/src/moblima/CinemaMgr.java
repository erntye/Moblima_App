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
		Cineplex cineplex = ConsoleBoundary.printChooseCineplex();
		
		while(loop) {
			int choice = ConsoleBoundary.printCinemaOps(cineplex.getName());
			switch(choice) {
			case 1: addCinema(cineplex); break;
			case 2: removeCinema(cineplex); break;
			case 9: loop = false; break;
			}
		}
	}
	
	public void addCinema(Cineplex cineplex) {
		boolean cineplexLoop = true;
		while(cineplexLoop) {
			String[] movieDetails = ConsoleBoundary.printAddCinema(cineplex.getName());
			int layoutNumber = Integer.parseInt(movieDetails[1]);
			switch(Integer.parseInt(movieDetails[2])) {
			case 1: //normal
				cineplex.addCinema(new Cinema(movieDetails[0], layoutNumber));
				System.out.print("normal cinema added");
				break;
			case 2: //gold
				cineplex.addCinema(new CinemaGold(movieDetails[0], layoutNumber));
				System.out.print("Gold Class cinema added");
				break;
			case 3: //platinum
				cineplex.addCinema(new CinemaPlatinum(movieDetails[0], layoutNumber));
				System.out.print("Platinum Class cinema added");
				break;
			default: //normal
				cineplex.addCinema(new Cinema(movieDetails[0], layoutNumber));
				System.out.print("default cinema (normal) added");
				break;
			}
			
		}
	}
	
	public void removeCinema(Cineplex cineplex) {
		
	}
}
