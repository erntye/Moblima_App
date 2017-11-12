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
			case 1: MovieBookingMgr.getInstance().bookByMovie(); break;
//			case 2: MovieBookingMgr.getInstance().bookByCineplex(); break;
//			case 3: Addreview
			}
		} while (choice != 9);
	}
}
