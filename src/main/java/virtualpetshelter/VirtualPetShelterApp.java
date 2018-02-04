package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter myShelter = new VirtualPetShelter();

		System.out.println("Thank you for volunteering at Rochelles Virtual Pet Shelter!");
		System.out.println("This is the status of your pets:");
		System.out.println("Name:Hunger:Thirst:Play");

		input.nextLine();
		input.nextLine();

		int userChoice;

		while (true) {
			System.out.println("What would you like to do next?");
			String optionsEntered = "";

			System.out.println(" 1: Feed pets");
			System.out.println(" 2: Water pets");
			System.out.println(" 3: Play with a pet");
			System.out.println(" 4: Adopt a pet");
			System.out.println(" 5: Admit a pet");
			System.out.println(" 6: Quit");
			optionsEntered = input.nextLine();

			while (!optionsEntered.equals("6")) {
				if (optionsEntered.equals("1")) {

					System.out.println("You have fed your pet");
				}

				if (optionsEntered.equals("2"))
					System.out.println("You have watered your pet");

				if (optionsEntered.equals("3"))
					;
				System.out.println("You played with your pet");

				if (optionsEntered.equals("4"))
					;
				System.out.println("You adopted a pet!");

				if (optionsEntered.equals("5"))
					;

			}
		}
	}
}
