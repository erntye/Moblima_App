package moblima;

public class CustCtr {
	int choice;
	
	//implement Singleton structure
	private static CustCtr instance;
	public static CustCtr getInstance() {
		if(instance == null) {
			instance = new CustCtr();
		}
		return instance;
	}
	
	public void custOperations(){
		do {
			choice = ConsoleBoundary.printStaffPage();
			switch(choice) {
			case 1: MovieBookingMgr.getInstance().listByMovie(); break;
			case 2: MovieBookingMgr.getInstance().listByCineplex(); break;
			}
		} while (choice != 9);
	}
}
