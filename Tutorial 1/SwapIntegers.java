import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for 2 integers
 * 2. Read inputs as "int"
 * 3. Swap the contents of the two variables
 * 4. Display the result
 */
public class SwapIntegers {  // Save as "SwapIntegers.java"
   public static void main (String[] args) {
      // Declare variables
      int number1, number2, temp;  // The input numbers
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt and Read inputs as "int"
      System.out.print("Enter first integer: ");  // No newline for prompting message
      number1 = in.nextInt();                     // Read next input as "double"
      System.out.print("Enter second integer: ");
      number2 = in.nextInt();

      // Swap the contents of two variables
      temp = number1;
      number1 = number2;
      number2 = temp;

      // Display result
      System.out.println("After the swap, first integer is: " + number1 + ", second integer is: " + number2);
      in.close();  // Close Scanner
   }
}