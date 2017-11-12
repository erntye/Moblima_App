package moblima;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVBoundary {
	
	public static char[][] getLayout(int choice) {
		char[][] seatLayout;
		String fileName = "layout"+choice+".csv";
		try {
			BufferedReader br =  new BufferedReader(new FileReader(fileName));
			String temp;
			int i = 0;
			temp = br.readLine();
			temp = temp.replaceAll(",", "");
			int size = temp.length();
			seatLayout = new char[size][size];
			seatLayout[i++] =  temp.toCharArray();				
			while ((temp = br.readLine())!= null) {
				temp = temp.replaceAll(",", "");
				seatLayout[i++] =  temp.toCharArray();	
			}
			br.close();
			return seatLayout;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return new char[10][10];
	}
}
