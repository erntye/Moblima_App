package moblima;
import java.util.ArrayList;


public class CustAcc extends Account{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5983626060596941305L;
	public enum AgeCat {CHILD, STUDENT, SENIOR_CITIZEN, ADULT}

	public ArrayList<Transaction> transactionList;
	private double mobileNumber;
	private String email;
	public AgeCat ageCat; //change UML diagram
		
	public CustAcc(String username, String password, String name, double mobileNumber, String email, AgeCat ageCat) {
			super(username, password, name);
			this.mobileNumber = mobileNumber;
			this.email = email;
			this.ageCat = ageCat;
			this.transactionList = new ArrayList<Transaction>();
		}
		
	public AgeCat getAgeCat() {
			return ageCat;
		}
		
	public String getEmail() {
			return email;
		}
		
	public double getMobileNumber() {
			return mobileNumber;
		}
		
	public ArrayList<Transaction> getTransactionList(){
			return transactionList;
		}	
	public void addTransaction(Transaction transactionToAdd){
		transactionList.add(transactionToAdd);
		//tell garion to save to database
		}
		
}


