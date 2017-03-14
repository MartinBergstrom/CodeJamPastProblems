package qualCodeJam2008;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SavingTheUniverse {
	public static void main(String[] args){
		String inputFile = "src/qualCodeJam2008/A-large-practice.in";
		String outputFile = "src/qualCodeJam2008/Output.txt";

		try{
			Scanner scan = new Scanner(new File(inputFile));
			PrintWriter printer = new PrintWriter(outputFile);
			
			int cases = Integer.parseInt(scan.nextLine());
			for(int i = 0; i<cases; i++){
				int nbrEngines = Integer.parseInt(scan.nextLine());
				
				//Scan past search engines, don't need them in our solution
				for(int j = 0; j<nbrEngines; j++){
					scan.nextLine();
				}

				int nbrQueries = Integer.parseInt(scan.nextLine());
				Set<String> set = new HashSet<String>();

				int count = 0;
				//Scan in the queries
				for(int k = 0; k<nbrQueries; k++){
					String next = scan.nextLine();

					if(set.size() == nbrEngines-1){
						if(!set.contains(next)){
							set = new HashSet<String>();
							count ++;
						}
					}
					set.add(next);
				}

				printer.println("Case #" + (i+1) + ": " + count);
			}
			scan.close();
			printer.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}