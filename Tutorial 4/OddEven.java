import java.util.Scanner;   // For keyboard input
/** The correct way to use Boolean method */
public class OddEven {  // Save as "OddEven.java"
	public static void main(String[] args) {
		int number;
		Scanner in = new Scanner(System.in);  // Scan the keyboard
      	System.out.print("Enter a number: ");
      	number = in.nextInt();
      	in.close();  // Close Scanner

		// one-liner shorthand conditional
		System.out.println(isOdd(number) ? number + " is an odd number" : number + " is an even number");
	}

	// The isOdd() method returns a boolean of true/false
	public static boolean isOdd(int num) {
		return (num % 2 != 0);  // or num & 1 != 0)
	}
}