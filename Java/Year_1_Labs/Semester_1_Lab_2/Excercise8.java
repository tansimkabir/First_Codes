import java.util.Scanner;

public class Excercise8 {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);

		long c;
		System.out.println("Enter a value: ");
		c = myscanner.nextLong();

		if (c%2 == 0)		
			System.out.println("Even");
		else 
			System.out.println("Odd");

	}


}
