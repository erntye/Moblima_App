package moblima;

public class MovieMgr {
	
	//implements singleton pattern
	private static MovieMgr instance;
	public static MovieMgr getInstance() {
		if(instance == null) {
			instance = new MovieMgr();
		}
		return instance;
	}
	
	
	
	public void addMovie() {
		MovieList.addMovie(ConsoleBoundary.printAddMovie());
	}
	
	public void removeMovie() {
		Movie movieToRemove = ConsoleBoundary.printRemoveMovie();
	}
	
	public void editMovie() {
		
	}
	
	public void movieOps() {
		int opsChoice = ConsoleBoundary.printMovieOps();
		switch(opsChoice) {
		case 1: addMovie();break;
		case 2: removeMovie(); break;
		case 3: editMovie(); break;
		}
	}
	
	public void top5Sales() {
		
	}
	
	public void top5Ratings() {
		
	}
}
