//created by Ellie, @lonecorgi
// sept 20 2024
import java.util.*;
public class Main {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		//declaring items
		int card1 = (int)(13*Math.random())+1;
		int suit1 = (int)(4*Math.random())+1;
		int card2 = (int)(13*Math.random())+1;
		int suit2 = (int)(4*Math.random())+1;
		// probably unnecicary: (testing code) ||System.out.println("card number: " + card1 + " and suit: " + suit1);
		List<String> cardList = new ArrayList<>();
		Collections.addAll(cardList, "","ace","2","3","4","5","6","7","8","9","10","jack","queen","king");
		List<String> suitList = new ArrayList<>();
		Collections.addAll(suitList, "","clubs","spades","hearts","diamonds");
		System.out.println(cardList.get(card1) + " of " + suitList.get(suit1));
		List<Integer> cardWorthList = new ArrayList<>();
		Collections.addAll(cardWorthList, 0,11,2,3,4,5,6,7,8,9,10,10,10,10);
		System.out.println("your card is worth: " + cardWorthList.get(card1));
		System.out.println(cardList.get(card2) + " of " + suitList.get(suit2));
		System.out.println("your card is worth: " + cardWorthList.get(card2));
		int worthVar1 = cardWorthList.get(card1);
		int worthVar2 = cardWorthList.get(card2);
		System.out.println("do you want to take another card? please answer with \"yes\" or \"no\"");
		String extraCard = input.nextLine();
		// testing code ||System.out.println("/////////" + extraCard + "\\\\\\\\\\\\\\");
		// testing code ||System.out.println(extraCard.equals("yes"));
		if (extraCard.equals("yes")){
			int card3 = (int)(13*Math.random())+1;
			int suit3 = (int)(4*Math.random())+1;
			int worthVar3 = cardWorthList.get(card3);
			System.out.println("your card is worth: " + worthVar3);
			System.out.println(cardList.get(card3) + " of " + suitList.get(suit3));
			int totalWorth = (worthVar1 + worthVar2 + worthVar3);
			System.out.println("the total worth of your card is: " + totalWorth);
				if((totalWorth > 21) || (totalWorth < 16)) {
				System.out.println("you lose, please try again next time");
				System.exit(101);
			} else {
				System.out.println("you win, congrats!");
				System.exit(101);
			}
		}else{
			int totalWorth = (worthVar1 + worthVar2);
			System.out.println("the total worth of your card is: " + totalWorth);
			if((totalWorth > 21) || (totalWorth < 16)) {
				System.out.println("you lose, please try again next time");
				System.exit(101);
			} else {
				System.out.println("you win, congrats!");
				System.exit(101);
			}
		}
	}
}

//created by Ellie, @lonecorgi 
//functional game as of 9/20/24
//    :3