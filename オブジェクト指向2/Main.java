import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {

		ArrayList<Integer> splitdl = new ArrayList<Integer>();
		ArrayList<Integer> splitpl = new ArrayList<Integer>();
		ArrayList<Integer> dlCards = new ArrayList<Integer>();
		ArrayList<Integer> plCards = new ArrayList<Integer>();

		Dealer dl = new Dealer();
		User pl = new User();

		int a = 0;
		int b = 0;

		splitdl = dl.deal();
		splitpl = pl.deal();	

		dlCards = dl.setCard(splitdl);
		System.out.println("Dealer" + dlCards);
		plCards = pl.setCard(splitpl);
		System.out.println("User" + plCards);

		while (dl.checkSum() == true) {
			dl.hit();
			dl.setCard(splitdl);
			System.out.println("Dealer" + dlCards);
		}
		
		while (pl.checkSum() == true) {
			pl.hit();
			pl.setCard(splitpl);
			System.out.println("User" + plCards);
		}

		
		b = dl.open();
		System.out.println("Dealer["+b+"]");

		a = pl.open();
		System.out.println("User[" + a +"]");
		
		if(a>21 &&b>21 || a==b){
			System.out.println("引き分け");
		}else if (b == 21 && a < 21 || b<21 && b> a || a > 21) {
			System.out.println("Dealerの勝ち");
		} else if (a == 21 && b < 21 || b<a &&  a<21 || b > 21) {
			System.out.println("Userの勝ち");
	

	}
}
}