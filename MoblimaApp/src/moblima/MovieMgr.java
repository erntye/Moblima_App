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
	
	
	
	public void addMovie(Movie movieToAdd) {
		
	}
	
	public void removeMovie(Movie movieToRemove) {
		
	}
	
	public void editMovie(Movie movieToEdit) {
		
	}
	
	public void movieOps() {
		
	}
	
	public void top5Sales() {
		
	}
	
	public void top5Ratings() {
		
	}
}
