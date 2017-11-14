package moblima;

import java.io.Console;

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
			choice = ConsoleBoundary.printCustPage();
			switch(choice) {
			case 1: MovieBookingMgr.getInstance().bookByMovie(); break;
//			case 2: MovieBookingMgr.getInstance().bookByCineplex(); break;
			case 2: ConsoleBoundary.printAllMovieList().addReviews(ConsoleBoundary.printAddReview());; break;
			case 3: ConsoleBoundary.printBookingHistory((CustAcc) LoginMgr.getInstance().loggedInAccount); break;
			case 4: MovieList.sortByRating(); ConsoleBoundary.printTopRatings(); break;
			case 5: MovieList.sortBySales(); ConsoleBoundary.printTopSales();break;
			}
		} while (choice != 0);
		ConsoleBoundary.printLogout();
	}
}
