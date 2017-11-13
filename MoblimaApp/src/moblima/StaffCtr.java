package moblima;

public class StaffCtr {
	
	//implement Singleton structure
	private static StaffCtr instance;
	public static StaffCtr getInstance() {
		if(instance == null) {
			instance = new StaffCtr();
		}
		return instance;
	}
	
	public void staffOperations(){
		int choice;
		do {
			choice = ConsoleBoundary.printStaffPage();
			switch(choice) {
			case 1: MovieMgr.getInstance().movieOps(); break;
			case 2: ShowMgr.getInstance().showOps(); break;
			case 3: SystemSettingMgr.getInstance().sysSetOps(); break;
			case 4: CineplexMgr.getInstance().CineplexOps(); break;
			case 5: CinemaMgr.getInstance().CinemaOps(); break;
			}
		} while (choice != 9);
		ConsoleBoundary.printLogout();
	} 
}
