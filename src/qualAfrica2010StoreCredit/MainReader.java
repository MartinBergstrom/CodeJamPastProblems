package qualAfrica2010StoreCredit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainReader {
	private TestCase[] cases;
	private int nbrOfCases;
	private int[][] results;
	
	public static void main(String[] args){
		new MainReader(); //reads all info	
	}
	
	private void calculateAll(){
		results = new int[nbrOfCases][2];
		for(int i = 0; i<nbrOfCases; i++){
			cases[i].calculate();
			results[i][0] = cases[i].getFirstIndex();
			results[i][1] = cases[i].getSecondIndex();
		}
	}

	public MainReader(){
		try {
			Scanner input = new Scanner(new File("src/africa2010StoreCredit/A-large-practice.in"));
			nbrOfCases = input.nextInt();
			cases = new TestCase[nbrOfCases];
			int index = 0;
			while(input.hasNextLine() && index!=nbrOfCases){
				cases[index] = new TestCase(input.nextInt(),input.nextInt());
				for(int i = 0; i<cases[index].getNbrOfItems(); i++){
					cases[index].addItemPrice(input.nextInt());
				}
				index++;
			}			
			calculateAll();			
			ResultPrinter printer = new ResultPrinter(results);
			printer.print();
		
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}			
	}
}
