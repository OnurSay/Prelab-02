import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		double radius;
		
		System.out.print("Enter radius: ");
		radius = keyboard.nextDouble();
		final double pi = 3.14;
		int volumeint;
		volumeint = (int)(4*pi*radius*radius*radius/3);
		float volumefloat;
		volumefloat = (float)(4*pi*radius*radius*radius/3);
		double volumedouble;
		volumedouble = (double)((4.0/3.0)*pi*radius*radius*radius);
		
		System.out.println("\n"+"The volume");
		System.out.println("for float type: "+volumefloat);
		System.out.println("for double type: "+ volumedouble);
		System.out.println("for int type: "+ volumeint);
		
		
		
		
	}

}
