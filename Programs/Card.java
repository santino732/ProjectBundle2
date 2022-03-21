package Programs;

public class Card {
	public String suite;
	public int num;
	
	public Card(String inputS, int inputNum) {
		suite = inputS;
		num = inputNum;
	}
	
	@Override
	public String toString() {
		return num + " of " + suite;
	}
}
