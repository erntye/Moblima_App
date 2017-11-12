package moblima;
import java.io.*;
import java.util.ArrayList;


public class DataBoundary {

	public static ArrayList<Account> getStaffList() {
		ArrayList<Account> staffArray = new ArrayList<Account>();
		try {
			FileInputStream fis = new FileInputStream("staff.tmp");
			ObjectInputStream ois = new ObjectInputStream(fis);
//			while (true) {
//				staffArray.add((StaffAcc) ois.readObject());
//			}
			staffArray = (ArrayList<Account>) ois.readObject();
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
//			while (true) {
//				custArray.add((StaffAcc) ois.readObject());
//			}
			custArray = (ArrayList<Account>) ois.readObject();
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
//			while (true) {
//				movieArray.add((Movie) ois.readObject());
//			}
			movieArray = (ArrayList<Movie>) ois.readObject();
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
	
	public static void saveStaffList(ArrayList<Account> staffArray) {
		try{
			FileOutputStream fos = new FileOutputStream("staff.tmp");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(staffArray);
		}
		catch (FileNotFoundException e) {}
		catch(IOException e) {}
	}
	
	public static void saveCustList(ArrayList<Account> custArray) {
		try{
			FileOutputStream fos = new FileOutputStream("cust.tmp");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(custArray);
		}
		catch (FileNotFoundException e) {}
		catch(IOException e) {}
	}
	
	public static void saveMovieList(ArrayList<Movie> movieArray) {
		try{
			FileOutputStream fos = new FileOutputStream("movie.tmp");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(movieArray);
		}
		catch (FileNotFoundException e) {}
		catch(IOException e) {}
	}
}
