package reversenumberjobe;

import java.util.Scanner;

class ReverseInput {

	public static void main(String[] args) {
		System.out.print("Enter the number to be reversed: ");

		Scanner s = new Scanner(System.in);
		String input = "";

		// check for valid user input --
		while (!s.hasNextDouble()) {
			input = s.next();
			System.out.println("That is not a number, please enter a number.");
		}

		input = s.next();

		// make StringBuilder so that we can easily reverse numbers
		StringBuilder inputA = new StringBuilder(input);

		// call reverse method to reverse the user's input
		inputA.reverse();

		// if input is palindromic, return --
		if (inputA.toString().equals(input)) {
			System.out.println("You have entered a palindromic number. The reverse of " + input + " is " + inputA + "!");
		}

		// print reverse of user's input --
		else {
			System.out.println("The reverse of your number is: " + inputA);
		}
		s.close();
	}
}
