package moblima;
import java.io.*;
import java.util.ArrayList;


public class DataBoundary {
	
	public ArrayList<Account> getStaffList() {
		ArrayList<Account> staffArray = new ArrayList<Account>();
		try {
			FileInputStream fis = new FileInputStream("staff.tmp");
			ObjectInputStream ois = new ObjectInputStream(fis);
			while (true) {
				staffArray.add((StaffAcc) ois.readObject());
			}
		}
		catch (EOFException e) {
			//just to test
			System.out.println("All Staff Accounts added.");
		}
		catch (FileNotFoundException e) {}
		catch (IOException e) {}
		catch (ClassNotFoundException e) {}
		return staffArray;
	}
	
	public ArrayList<Account> getCustList() {
		ArrayList<Account> custArray = new ArrayList<Account>();
		try {
			FileInputStream fis = new FileInputStream("cust.tmp");
			ObjectInputStream ois = new ObjectInputStream(fis);
			while (true) {
				custArray.add((StaffAcc) ois.readObject());
			}
		}
		catch (EOFException e) {
			//just to test
			System.out.println("All Customer Accounts added.");
		}
		catch (FileNotFoundException e) {}
		catch (IOException e) {}
		catch (ClassNotFoundException e) {}
		return custArray;
	}
}
