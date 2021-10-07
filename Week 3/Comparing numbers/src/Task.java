import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		int x = 5;
		Scanner myScanner = new Scanner(System.in);
		int input = myScanner.nextInt();
		
		if (input > x) {
			System.out.println("Your number is larger than 5!");
		} else {
			System.out.println("Your number is less than or equal to 5!");
		}
	}
}