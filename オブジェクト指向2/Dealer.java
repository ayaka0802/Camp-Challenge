

import java.util.ArrayList;
import java.util.Collections;


public class Dealer extends Human {
	
	ArrayList<Integer> split = new ArrayList<Integer>();
	ArrayList<Integer> cards = new ArrayList<Integer>(); {
		{
			for(int j=0;j<4;j++){
				for (int i = 1; i <= 10; i++) {
					cards.add(i);
				}
				for(int i=0;i<3;i++){
					cards.add(10);
				}
			}
		}
	};

	public  ArrayList<Integer> deal() {
		Collections.shuffle(cards);
		split.add(cards.get(0));
		split.add(cards.get(1));

		return split;
	}

	public void hit() {
		Collections.shuffle(cards);
	    split.add(cards.get(0));
	}

	public ArrayList<Integer> setCard(ArrayList<Integer> al) {
		myCards.clear();
		for (int i = 0; i < split.size(); i++) {
			myCards.add(al.get(i));
		}
		return myCards;
		
	}

	public boolean checkSum() {
		int x=0;
		for (int j = 0; j < myCards.size(); j++) {
			x += myCards.get(j);
		
				if(myCards.get(j) == 1 && x<=11){
					myCards.remove(j);
					myCards.add(11);
					x += myCards.get(j);
				}
		}
		if (x <= 16) {
			
			return true;
		} else {
			return false;
		}
	}
	

	public int open() {
		int y = 0;
		for (int j = 0; j < myCards.size(); j++) {
			y += myCards.get(j);
		}
		return y;
	}

}
