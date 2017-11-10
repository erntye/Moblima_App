package moblima;

public class Reviews {
	private String content;
	private int rating;
	private String reviewer;
	
	public Reviews(String content, int rating, String reviewer){
		this.content = content;
		this.rating = rating;
		this.reviewer = reviewer;
	}
	
	public int getRating(){
		return this.rating;
	}
	
}
