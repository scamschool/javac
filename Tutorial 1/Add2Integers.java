import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for 2 integers
 * 2. Read inputs as "int"
 * 3. Compute their sum
 * 4. Display the result
 */
public class Add2Integers {  // Save as "Add2Integers.java"
   public static void main (String[] args) {
      // Declare variables
      int number1, number2, sum;
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input

      // Put up prompting messages and read inputs as "int"
      System.out.print("Enter first integer: ");  // No newline for prompting message
      number1 = in.nextInt();                     // Read next input as "int"
      System.out.print("Enter second integer: ");
      number2 = in.nextInt();

      // Compute sum
      sum = number1 + number2;

      // Display result
      System.out.println("The sum is: " + sum);   // Print with newline
      in.close();  // Close Scanner
   }
}