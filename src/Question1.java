import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		String firstletter,firstword;
		firstword = keyboard.next();
		firstletter = firstword.substring(0, 1);
		System.out.println("The first letter of the sentence is "+ firstletter);
		System.out.println("The first word of the sentence is "+ firstword);

		
		
	}

}
