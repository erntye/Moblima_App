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
			case 3: changePremium(); break;
			case 0: loop = false; break;
			}
			DataBoundary.saveCineplexList(CineplexList.cineplexList);
		}
	}
	
	public void addCinema(Cineplex cineplex) {
		String[] movieDetails = ConsoleBoundary.printAddCinema(cineplex.getName());
		int layoutNumber = Integer.parseInt(movieDetails[1]);
		switch(Integer.parseInt(movieDetails[2])) {
		case 1: //normal
			cineplex.addCinema(new Cinema(movieDetails[0], layoutNumber));
			System.out.println("normal cinema added");
			break;
		case 2: //gold
			cineplex.addCinema(new CinemaGold(movieDetails[0], layoutNumber));
			System.out.println("Gold Class cinema added");
			break;
		case 3: //platinum
			cineplex.addCinema(new CinemaPlatinum(movieDetails[0], layoutNumber));
			System.out.println("Platinum Class cinema added");
			break;
		default: //normal
			cineplex.addCinema(new Cinema(movieDetails[0], layoutNumber));
			System.out.println("default cinema (normal) added");
			break;
		}
	}
	
	public void removeCinema(Cineplex cineplex) {
		Cinema cinemaToRemove = ConsoleBoundary.printRemoveCinema(cineplex);
		cineplex.removeCinema(cinemaToRemove);
		System.out.println("Cinema removed");
	}

	public void changePremium() {
		float[] changePremiumDetails = ConsoleBoundary.printChangePremium();
		switch((int)changePremiumDetails[0]) {
		case 1: //normal
			Cinema.setPremium(changePremiumDetails[1]);
			System.out.println("Normal Cinema premium updated!");
			break;
		case 2: //Gold Class
			CinemaGold.setPremium(changePremiumDetails[1]);
			System.out.println("Gold Class Cinema premium updated!");
			break;
		case 3: //Platinum Class
			CinemaPlatinum.setPremium(changePremiumDetails[1]);
			System.out.println("Platinum Class Cinema premium updated!");
			break;
		}
	}
}
