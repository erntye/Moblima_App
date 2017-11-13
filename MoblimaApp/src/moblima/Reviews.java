package moblima;
import java.io.*;

public class Reviews implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8819093047305119458L;
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
	
	public String getReviewer(){
		return this.reviewer;
	}
	
	public String getContent(){
		return this.content;
	}
	
}
