package moblima;

public class StaffCtr {
	int choice;
	
	//implement Singleton structure
	private static StaffCtr instance;
	public static StaffCtr getInstance() {
		if(instance == null) {
			instance = new StaffCtr();
		}
		return instance;
	}
	
	public void staffOperations(){
		do {
			choice = ConsoleBoundary.printStaffPage();
			switch(choice) {
			case 1: MovieMgr.movieOps(); break;
			case 2: ShowMgr.showOps(); break;
			case 3: SystemSettingMgr.getInstance().sysSetOps(); break;
			}
		} while (choice != 9);
	} 
}
