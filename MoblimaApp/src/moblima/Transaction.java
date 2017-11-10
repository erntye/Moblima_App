package moblima;

public class Transaction {
	private String tid;
	public String date;
	public String movieTitle;
	
	public Transaction (String tid, String date, String movieTitle) {
		this.tid = tid;
		this.date = date;
		this.movieTitle = movieTitle;
	}
	
	private String getTid() {
		return tid;
	}
	
	public String getMovieTitle() {
		return movieTitle;
	}
	
	public String getDate() {
		return date;
	}
	

}

