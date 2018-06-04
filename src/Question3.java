import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		String sr,nm,srUp,tl,tlUp,nmUp;
		
		
		
		System.out.println("What is your name?");
		nm = scan.nextLine();
		System.out.println("What is your title?");
		tl = scan.next();
		int srUp1;
		short birthyear;
		
		System.out.println("Which year were you born?");
		birthyear = scan.nextShort();
		tlUp = tl.toUpperCase();
		int length1 = nm.length();
	    int start = nm.indexOf(' ');
	    int end = nm.lastIndexOf("");
	    sr = nm.substring(start,end);
		nmUp = nm.toUpperCase();
		int start2 = nm.indexOf("");
	    int end2 = nm.lastIndexOf(' ');
	    String firstnm = nm.substring(start2,end2);
	    int nmlength = (firstnm).length();
	    srUp = sr.toUpperCase();
		
		
		System.out.println("Dear " + tlUp +" "+ srUp + ",");
		System.out.println("You are " + (2017-birthyear) + " years old. Your first nm consists of " + nmlength + " letters.");
		
		
	}

}
