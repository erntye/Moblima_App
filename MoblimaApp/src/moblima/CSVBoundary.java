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
			int height = 0;
			while (br.readLine() != null) {
				height++;
			}
			br =  new BufferedReader(new FileReader(fileName));
			int i = 0;
			temp = br.readLine();
			temp = temp.replaceAll(",", "");
			int width = temp.length();
			seatLayout = new char[width][height];
			seatLayout[i++] =  temp.toCharArray();				
			while ((temp = br.readLine())!= null) {
				temp = temp.replaceAll(",", "");
				seatLayout[i++] =  temp.toCharArray();	
			}
			br.close();
			return seatLayout;
		}
		catch (FileNotFoundException e) {
			System.out.println("Choice not valid, setting default layout1");
			try {
				BufferedReader br =  new BufferedReader(new FileReader("layout1.csv"));
				String temp;
				int height = 0;
				while (br.readLine() != null) {
					height++;
				}
				br =  new BufferedReader(new FileReader(fileName));
				int i = 0;
				temp = br.readLine();
				temp = temp.replaceAll(",", "");
				int width = temp.length();
				seatLayout = new char[width][height];
				seatLayout[i++] =  temp.toCharArray();				
				while ((temp = br.readLine())!= null) {
					temp = temp.replaceAll(",", "");
					seatLayout[i++] =  temp.toCharArray();	
				}
				br.close();
				return seatLayout;
			}
			catch (FileNotFoundException e2) {}
			catch (IOException e2) {}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return new char[1][1];
	}
	
	public static void printAllLayout() {
		int c = 1;
		while(true) {
			String fileName = "layout" + c + ".csv";
			char[][] seatLayout;
			try {
				BufferedReader br = new BufferedReader(new FileReader(fileName));
				String temp;
				int height = 0;
				while (br.readLine() != null) {
					height++;
				}
				br =  new BufferedReader(new FileReader(fileName));
				temp = br.readLine();
				temp = temp.replaceAll(",", "");
				int width = temp.length();
				seatLayout = new char[width][height];
				int i = 0;
				seatLayout[i++] =  temp.toCharArray();	
				while ((temp = br.readLine()) != null) {
					temp = temp.replaceAll(",", "");
					seatLayout[i++] =  temp.toCharArray();
				}
				ConsoleBoundary.printEmptyLayout(seatLayout, height, width, c);
				c++;
			}
			catch (FileNotFoundException e) {
				break;
			}
			catch (IOException e) {}
		}
		
	}
}
