package moblima;

public class SystemSettingMgr {
	int choice;
	public void sysSetOps() {
		do {
			choice = ConsoleBoundary.printSystemSettingMenu();
			switch(choice) {
			case 1: Show.setBasePrice(ConsoleBoundary.askBasePrice()); break;
			case 2: Calendar.addPubHol(ConsoleBoundary.askPubHol()); break;
			}
		} while (choice != 9);
	}
}
