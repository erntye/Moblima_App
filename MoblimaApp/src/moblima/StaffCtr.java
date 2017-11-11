package moblima;

public class StaffCtr {
	int choice;
	public void staffOperations(){
		do {
			choice = ConsoleBoundary.printStaffPage();
			switch(choice) {
			case 1: MovieMgr.movieOps(); break;
			case 2: ShowMgr.showOps(); break;
			case 3: SystemSettingMgr.sysSetOps(); break;
			}
		} while (choice != 9);
	} 
}
