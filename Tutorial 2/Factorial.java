import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for an integer
 * 2. Read input as "int"
 * 3. Compute the factorial of the integer
 * 4. Display the result
 */
public class Factorial {  // Save as "Factorial.java"
   public static void main (String[] args) {
      // Declare variables
      int n, product = 1;
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt and read input as "int"
      System.out.print("Enter an integer: ");
      n = in.nextInt();

      // Compute factorial using a for-loop
      for (int number = 1; number <= n; ++number) {
         product = product * number;
      }

      // Display results
      System.out.println("The Factorial of " + n + " is: " + product);
      in.close();  // Close Scanner
   }
}