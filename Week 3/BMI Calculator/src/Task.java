import java.util.Scanner;

public class Task {
	
	public static void main(String[] args) {
		// Create scanner
		Scanner myScanner = new Scanner(System.in);
		
		// Get user's weight and height
		System.out.println("Enter your weight in kilograms: ");
		double weight = myScanner.nextDouble();
		
		System.out.println("Enter your height in meters: ");
		double height = myScanner.nextDouble();
		
		// Calculate BMI
		double bmi = weight / Math.pow(height, 2);
		
		// Print BMI category
		if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if (bmi < 25) {
			System.out.println("Healthy");
		} else if (bmi < 30) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obese");
		}
	}
}
