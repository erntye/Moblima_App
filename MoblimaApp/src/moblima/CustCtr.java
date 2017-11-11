package moblima;

public class CustCtr {
	int choice;
	public void custOperations(){
		do {
			choice = ConsoleBoundary.printStaffPage();
			switch(choice) {
			case 1: MovieBookingMgr.listByMovie(); break;
			case 2: MovieBookingMgr.listByCineplex(); break;
			}
		} while (choice != 9);
	}
}
