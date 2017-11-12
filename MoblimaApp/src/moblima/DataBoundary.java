package moblima;
import java.io.*;
import java.util.ArrayList;


public class DataBoundary {

	public static ArrayList<Account> getStaffList() {
		ArrayList<Account> staffArray = new ArrayList<Account>();
		try {
			FileInputStream fis = new FileInputStream("staff.tmp");
			ObjectInputStream ois = new ObjectInputStream(fis);
			staffArray = (ArrayList<Account>) ois.readObject();
			ois.close();
		}
		catch (EOFException e) {
			//just to test
			e.printStackTrace();
			System.out.println("All Staff Accounts Added.");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return staffArray;
	}
	
	public static ArrayList<Account> getCustList() {
		ArrayList<Account> custArray = new ArrayList<Account>();
		try {
			FileInputStream fis = new FileInputStream("cust.tmp");
			ObjectInputStream ois = new ObjectInputStream(fis);
			custArray = (ArrayList<Account>) ois.readObject();
			ois.close();
		}
		catch (EOFException e) {
			//just to test
			e.printStackTrace();
			System.out.println("All Customer Accounts Added.");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return custArray;
	}
	
	public static ArrayList<Movie> getMovieList() {
		ArrayList<Movie> movieArray = new ArrayList<Movie>();
		try {
			FileInputStream fis = new FileInputStream("movie.tmp");
			ObjectInputStream ois = new ObjectInputStream(fis);
			movieArray = (ArrayList<Movie>) ois.readObject();
			ois.close();
		}
		catch (EOFException e) {
			//just to test
			e.printStackTrace();
			System.out.println("All Movies Added.");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return movieArray;
	}
	
	public static ArrayList<Cineplex> getCineplexList() {
		ArrayList<Cineplex> cineplexArray = new ArrayList<Cineplex>();
		try {
			FileInputStream fis = new FileInputStream("cineplex.tmp");
			ObjectInputStream ois = new ObjectInputStream(fis);
			cineplexArray = (ArrayList<Cineplex>) ois.readObject();
			ois.close();
		}
		catch (EOFException e) {
			//just to test
			e.printStackTrace();
			System.out.println("All Cineplexes, Cinemas and Shows Added.");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return cineplexArray;
	}
	
	public static void saveStaffList(ArrayList<Account> staffArray) {
		try{
			FileOutputStream fos = new FileOutputStream("staff.tmp");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(staffArray);
			oos.close();
		}
		catch (FileNotFoundException e) {}
		catch(IOException e) {}
	}
	
	public static void saveCustList(ArrayList<Account> custArray) {
		try{
			FileOutputStream fos = new FileOutputStream("cust.tmp");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(custArray);
			oos.close();
		}
		catch (FileNotFoundException e) {}
		catch(IOException e) {}
	}
	
	public static void saveMovieList(ArrayList<Movie> movieArray) {
		try{
			FileOutputStream fos = new FileOutputStream("movie.tmp");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(movieArray);
			oos.close();
		}
		catch (FileNotFoundException e) {}
		catch(IOException e) {}
	}

	public static void saveCineplexList(ArrayList<Cineplex> cineplexArray) {
		try{
			FileOutputStream fos = new FileOutputStream("cineplex.tmp");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(cineplexArray);
			oos.close();
		}
		catch (FileNotFoundException e) {}
		catch(IOException e) {}
	}
}
