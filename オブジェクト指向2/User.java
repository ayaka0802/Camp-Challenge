import java.util.ArrayList;
import java.util.Collections;

public class User extends Human {

	public void main(String[] args) {

		deal();
		hit();

		int x = open();
		System.out.println(x);
	}

	ArrayList<Integer> split = new ArrayList<Integer>();

	Dealer dl = new Dealer();

	public ArrayList<Integer> deal() {
		Collections.shuffle(dl.cards);
		split.add(dl.cards.get(0));
		split.add(dl.cards.get(1));

		return split;

	}

	public void hit() {
		Collections.shuffle(dl.cards);
		split.add(dl.cards.get(0));
	}

	public ArrayList<Integer> setCard(ArrayList<Integer> al) {
		myCards.clear();
		for (int i = 0; i < split.size(); i++) {
			myCards.add(al.get(i));
		}
		return myCards;

	}

	public boolean checkSum() {
		int x = 0;
		for (int j = 0; j < myCards.size(); j++) {
			x = x + myCards.get(j);
				if(myCards.get(j) == 1 && x<=11 ){
					myCards.remove(j);
					myCards.add(11);
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
			y = y + myCards.get(j);
		}
		return y;
	}

}
