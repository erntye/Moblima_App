package moblima;
//defunct class
public class GeneralLayout {
	protected char[][] seats;
	private boolean isOccupied = false;


	public void bookSeats(char row, int column) {
		int tempRow = Character.getNumericValue(row) - 10;
		seats[tempRow][column] = 'X';
		this.isOccupied = true;
	}

	public boolean isOccupied(char row, int column) {
		int tempRow = Character.getNumericValue(row) - 10;
		if (seats[tempRow][column] == 'X')
			return true;
		else 
			return false;
	}

}
