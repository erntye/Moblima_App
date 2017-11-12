package moblima;

public class SystemSettingMgr {
	int choice;
	
	//implement Singleton structure
	private static SystemSettingMgr instance;
	public static SystemSettingMgr getInstance() {
		if(instance == null) {
			instance = new SystemSettingMgr();
		}
		return instance;
	}
	
	public void sysSetOps() {
		do {
			choice = ConsoleBoundary.printSystemSettingMenu();
			switch(choice) {
			case 1: Show.setBasePrice(ConsoleBoundary.askBasePrice()); break;
			case 2: MovieCalendar.addPubHol(ConsoleBoundary.askPubHol()); break;
			}
		} while (choice != 9);
	}
}
