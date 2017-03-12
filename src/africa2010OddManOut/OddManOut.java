package africa2010OddManOut;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OddManOut {
	public static void main(String[] args){
		String inputFile = "src/africa2010OddManOut/A-large-practice.in";
		String outputFile = "OutputOddManOut.txt";
		
		try{
			Scanner scan = new Scanner(new File(inputFile));
			PrintWriter printer = new PrintWriter(outputFile);
			int cases = Integer.parseInt(scan.nextLine());
			
			for(int i = 0; i<cases; i++){
				int guests = Integer.parseInt(scan.nextLine());
			
				ArrayList<Integer> uniqueNbrs = new ArrayList<Integer>();
				for(int j = 0; j<guests; j++){
					uniqueNbrs.add(scan.nextInt());
				}	
				scan.nextLine();
				
				int oddNbr = getOddNbr(uniqueNbrs);
				
				printer.println("Case #" + (i+1) + ": "+ oddNbr );				
			}			
			scan.close();
			printer.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}

	private static int getOddNbr(ArrayList<Integer> uniqueNbrs) {
		for(int k = 0; k<uniqueNbrs.size(); k++){
			if(Collections.frequency(uniqueNbrs, uniqueNbrs.get(k))==1){ //det finns bara ett element
				return uniqueNbrs.get(k);
			}
		}
		return 0;
	}
}