import java.util.Scanner;

public class Excercise6b {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);

		String animal = "";
		int leg_num;

		System.out.println("Enter the animal name");
		animal = myscanner.nextLine();

		switch (animal) {
		case "llama": case "goat": case "Baboon": case "Ocelot": 
		case "Cobra": case "Dog": case "Cat":
			leg_num = 4;
			System.out.println(animal + " has " + leg_num + " legs");
			break;	

		case "Centipede": 
			leg_num = 100;
			System.out.println(animal + " has " + leg_num + " legs");
			break;

		case "Tarantula": case "Octopus": case "Black Scorpion": 
			leg_num = 8;
			System.out.println(animal + " has " + leg_num + " legs");
			break;

		case "Human": case "Klingon":
			leg_num = 2;
			System.out.println(animal + " has " + leg_num + " legs");
			break;

		default:
			System.out.println("Unknown");			
		}

		







	}


}
