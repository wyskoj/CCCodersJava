import java.util.Scanner;

public class Task {
	
	public static void main(String[] args) {
		// Create a scanner
		Scanner myScanner = new Scanner(System.in);
		
		// Ask for two numbers
		System.out.println("Enter the first number: ");
		int numA = myScanner.nextInt();
		
		System.out.println("Enter the second number: ");
		int numB = myScanner.nextInt();
		
		// If both numbers are greater than 0
		if (numA > 0 && numB > 0) {
			System.out.println("Both numbers are positive!");
		}
		
		// If A is 4, or B is 4
		if (numA == 4 || numB == 4) {
			System.out.println("A or B is 4!");
		}
		
		// Ask for a word
		System.out.println("Enter a word: ");
		String word = myScanner.next();
		if (!word.endsWith("ly")) {
			System.out.println("Your word is not an adverb!");
		} else {
			System.out.println("Your word is an adverb!");
		}
	}
}