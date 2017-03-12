package qualAfrica2010StoreCredit;

import java.util.ArrayList;
import java.util.List;

public class TestCase {
	private int credit;
	private int nbrOfItems;
	private List<Integer> itemPrices;
	private int firstIndex;
	private int secondIndex;
	
	public TestCase(int credit, int nbrOfItems) {
		this.credit = credit;
		this.nbrOfItems = nbrOfItems;
		itemPrices = new ArrayList<Integer>();
	}
	
	public void addItemPrice(int price){
		itemPrices.add(price);
	}
	
	public int getNbrOfItems(){
		return nbrOfItems;
	}
	
	public int getFirstIndex(){
		return firstIndex;
	}
	
	public int getSecondIndex(){
		return secondIndex;
	}
	
	public void calculate(){
		for(int i = 0; i<itemPrices.size()-1; i++){
			int item1 = itemPrices.get(i);
			for(int j = i+1; j<itemPrices.size(); j++){
				int item2 = itemPrices.get(j);
				if(item1 + item2 == credit){
					firstIndex = i +1;
					secondIndex = j +1;
				}
			}
		}
	}
	
	
}
