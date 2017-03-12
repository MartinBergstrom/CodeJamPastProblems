package qualAfrica2010T9Spelling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class T9Spelling {
	public static void main(String[] args){
		String inputfile = "src/qualafrica2010T9Spelling/C-large-practice.in";
		String outputfile = "OutputT9spelling.txt";
		try{
			Scanner scan = new Scanner(new File(inputfile));
			PrintWriter printer = new PrintWriter(outputfile);

			int nbrOfCases = scan.nextInt();
			System.out.println(nbrOfCases);
			scan.nextLine();
			for(int i = 0; i<nbrOfCases; i++){
				String line = scan.nextLine();
				if(!line.equals("")){
					char[] charArray = line.toCharArray();

					int prevButton = -1;
					printer.print("Case #" + (i+1) +": "); 
					
					//print out the numbers mapped to the letters
					for(int j = 0; j<charArray.length; j++){
						int res = mapping(charArray[j]);
						if(prevButton == getFirstDigit(res)){
							printer.print(" ");
						}
						printer.print(res);
						
						prevButton = getFirstDigit(res);
					}
						printer.print("\n");			
				}
			}
			
			scan.close();
			printer.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	public static int getFirstDigit(int i) {
		while (Math.abs(i) >= 10 ) {
			i = i / 10;
		}
		return Math.abs(i);
	}

	//kunde använt en hashmap<String,String> ist? 
	private static int mapping(Character c){
		switch(c){
		case ' ':
			return 0;
		case 'a':
			return 2;
		case 'b':
			return 22;
		case 'c':
			return 222;
		case 'd':
			return 3;
		case 'e':
			return 33;
		case 'f':
			return 333;
		case 'g':
			return 4;
		case 'h':
			return 44;
		case 'i':
			return 444;
		case 'j':
			return 5;
		case 'k':
			return 55;
		case 'l':
			return 555;
		case 'm':
			return 6;
		case 'n':
			return 66;
		case 'o':
			return 666;
		case 'p':
			return 7;
		case 'q':
			return 77;
		case 'r':
			return 777;
		case 's':
			return 7777;
		case 't':
			return 8;
		case 'u':
			return 88;
		case 'v':
			return 888;
		case 'w':
			return 9;
		case 'x':
			return 99;
		case 'y':
			return 999;
		case 'z':
			return 9999;
		}
		return ' ';
	}
}