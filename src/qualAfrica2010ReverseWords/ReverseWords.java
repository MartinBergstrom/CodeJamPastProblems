package qualAfrica2010ReverseWords;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args){
		try {
			Scanner input = new Scanner(new File("src/africa2010ReverseWords/B-large-practice.in"));
			int nbrOfLines = input.nextInt();
			PrintWriter printer = new PrintWriter("OutputReverseWords.txt");
			input.nextLine();
			for(int i = 0; i<nbrOfLines; i++){
				String line = input.nextLine();
				String[] words = line.split(" ");
				List<String> strings = Arrays.asList(words);
				Collections.reverse(strings);
				printer.write("Case #" + (i+1) + ":");
				for(int j = 0; j<strings.size(); j++){
					printer.write(" " +strings.get(j));
				}
				if(i!= nbrOfLines-1){
					printer.println("");	
				}
			}
			printer.close();
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
