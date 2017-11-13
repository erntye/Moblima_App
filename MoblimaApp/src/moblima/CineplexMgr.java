package moblima;

public class CineplexMgr {
	
	//implement Singleton structure
	private static CineplexMgr instance;
	public static CineplexMgr getInstance() {
		if(instance == null) {
			instance = new CineplexMgr();
		}
		return instance;
	}
	
	public void CineplexOps() {
		
	}
}
