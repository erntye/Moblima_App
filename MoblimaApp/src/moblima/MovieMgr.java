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
		MovieList.removeMovie(ConsoleBoundary.printRemoveMovie());
	}
	
	public void editMovie() {
		Movie movieToEdit = ConsoleBoundary.printEditMovie();
		Movie movietoReplace = ConsoleBoundary.printEditMovie2(movieToEdit);
		int index = MovieList.movieList.indexOf(movieToEdit);
		MovieList.movieList.add(index, movietoReplace);
		MovieList.removeMovie(movieToEdit);
	}
	
	public void movieOps() {
		boolean loop = true;
		while(loop) {
			int opsChoice = ConsoleBoundary.printMovieOps();
			switch(opsChoice) {
			case 1: addMovie();break;
			case 2: removeMovie(); break;
			case 3: editMovie(); break;
			case 4: top5Sales(); break;
			case 5: top5Ratings(); break;
			case 9: loop = false; break;
			}
			DataBoundary.saveMovieList(MovieList.movieList);
		}
	}
	
	public void top5Sales() {
		MovieList.sortBySales();
		ConsoleBoundary.printTopSales();
	}
	
	public void top5Ratings() {
		MovieList.sortByRating();
		ConsoleBoundary.printTopRatings();
	}
}
