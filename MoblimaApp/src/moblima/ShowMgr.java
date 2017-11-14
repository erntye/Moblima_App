package moblima;

import java.util.Calendar;

public class ShowMgr {
	
	//implement Singleton structure
	private static ShowMgr instance;
	public static ShowMgr getInstance() {
		if(instance == null) {
			instance = new ShowMgr();
		}
		return instance;
	}
	
	public void addShow() {
		Cinema cinemaToAddTo = ConsoleBoundary.printAddShow();
		if(cinemaToAddTo == null)
			return;
		Movie movieToAdd = ConsoleBoundary.printMovieList();
		if(movieToAdd == null)
			return;
		Calendar showTime = ConsoleBoundary.getShowTime();
		if(showTime == null)
			return;
		String showType = ConsoleBoundary.printChooseShowType();
		if(showType == null)
			return;
		cinemaToAddTo.createShow(movieToAdd.getTitle(), showTime, showType);
		cinemaToAddTo.sortShowsByTime();
	}
	
	public void removeShow() {
		Cinema cinemaToRemoveFrom = ConsoleBoundary.printRemoveShow();
		if(cinemaToRemoveFrom == null)
			return;
		Show showToRemove = ConsoleBoundary.printShowList(cinemaToRemoveFrom);
		if(showToRemove == null)
			return;
		cinemaToRemoveFrom.removeShow(showToRemove);
	}
	
	public void editShow() {
		Cinema cinemaToEditFrom = ConsoleBoundary.printEditShow();
		if(cinemaToEditFrom == null)
			return;
		Show showToEdit = ConsoleBoundary.printShowList(cinemaToEditFrom);
		if(showToEdit == null)
			return;
		ConsoleBoundary.printEditShowDetails(showToEdit);
	}
	
	public void showOps() {
		boolean loop = true;
		while(loop) {
			int opsChoice = ConsoleBoundary.printShowOps();
			switch(opsChoice) {
			case 1: addShow();break;
			case 2: removeShow(); break;
			case 3: editShow(); break;
			case 0: loop = false; break;
			}
			DataBoundary.saveCineplexList(CineplexList.cineplexList);
		}
	}
}
