import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for 2 integers
 * 2. Read inputs as "int"
 * 3. Check if the first integer is a multiple of the second integer
 * 4. Display the result
 */
public class Multiple {  // Save as "Multiple.java"
   public static void main (String[] args) {
      // Declare variables
      int number1, number2;
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input

      // Put up prompting messages and read inputs as "int"
      System.out.print("Enter 1st integer: ");  // No newline for prompting message
      number1 = in.nextInt();                     // Read next input as "int"
      System.out.print("Enter 2nd integer: ");
      number2 = in.nextInt();

      // Check if the first integer is a multiple of the second integer and print result
      // Use % to find the remainder dividing by 2, and compare with 0
      if (number1 % number2 == 0) {      // double-equal for comparison
         System.out.println(number1 + " IS a multiple of " + number2);
      } else {
         System.out.println(number1 + " IS NOT a multiple of " + number2);
      }
      in.close();  // Close Scanner
   }
}