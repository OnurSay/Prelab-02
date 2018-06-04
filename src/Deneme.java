import java.util.Scanner;
public class Deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		String name,surname,surnameUpper,title,titleUpper,nameUpper;
		int birthyear;
		
		System.out.println("What is your name?");
		name = keyboard.nextLine();
		System.out.println("What is your title?");
		title = keyboard.next();
		System.out.println("Which year were you born?");
		birthyear = keyboard.nextInt();
		titleUpper = title.toUpperCase();
		nameUpper = name.toUpperCase();
		int namelength = name.length();
		 
		String[] words = name.split(" ");
		byte[] strByte = name.getBytes();         
		System.out.println(new String(strByte));
		System.out.println("Dear " + titleUpper +" "+ nameUpper + ",");
		System.out.println("You are " + (2017-birthyear) + " years old. Your first name consist of " + namelength + " letters.");
		
		
	}

}
