package qualAfrica2010StoreCredit;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class ResultPrinter {
	private int[][] results;
	
	public ResultPrinter(int[][] results) {
		this.results = results;
	}

	public void print(){
			BufferedWriter writer = null;
			try {
				writer = new BufferedWriter(new OutputStreamWriter(
						new FileOutputStream("Output.txt"), "utf-8"));
				
				for(int i = 0; i<results.length-1; i++){
					writer.write("Case #" +(i+1)+":" + " " + results[i][0] + " " + results[i][1]);
					writer.newLine();
				}
				writer.write("Case #" +(results.length)+":" + " " + results[results.length-1][0] + " " + results[results.length-1][1]);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try { writer.close(); } catch (IOException e) {}
			}
	}

}
