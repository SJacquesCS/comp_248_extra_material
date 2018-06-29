import java.util.Scanner;

public class Sample_Test_2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int i_1, i_2, i_3;
		String s_1, s_2, s_3;
		
		System.out.print("Enter value and suit of card 1: ");
		i_1 = kb.nextInt();
		s_1 = kb.next();
		
		System.out.print("Enter value and suit of card 2: ");
		i_2 = kb.nextInt();		
		s_2 = kb.next();
		
		System.out.print("Enter value and suit of card 3: ");
		i_3 = kb.nextInt();
		s_3 = kb.next();
		
		if (i_1 > 13 || i_1 < 1 || i_2 > 13 || i_2 < 1 || i_3 > 13 || i_3 < 1) {
			System.out.println("Invalid value - bye bye");
			System.exit(0);
		}
		
		switch(i_1) {
		case 1:
			System.out.println("Your first card is: ace of " + s_1);
			break;
		case 2:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("Your first card is: " + i_1 + " of " + s_1);
			break;
		case 11:
			System.out.println("Your first card is: jack of " + s_1);
			break;
		case 12:
			System.out.println("Your first card is: queen of " + s_1);
			break;
		case 13:
			System.out.println("Your first card is: king of " + s_1);
			break;
		}
		
		String handType = "";
		
		if (i_1 == i_2 && i_2 == i_3) {
			handType += "TRIO";
		}
		else if (i_1 == i_2 || i_2 == i_3 || i_1 == i_3) {
			handType += "PAIR";
		}
		else {
			if ((i_1 + 1) == i_2 && (i_1 + 2) == i_3) {
				handType += "STRAIGHT";
			}
			
			if (s_1.equals(s_2) && s_2.equals(s_1)) {
				handType += "FLUSH";
			}
		}
		
		if (handType.equals("")) {
			handType = "NOTHING";
		}
		
		System.out.println("Your hand type is " + handType);
	}
}
