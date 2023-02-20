import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for an integer
 * 2. Read input as "int"
 * 3. Check if the integer is odd or even
 * 4. Display the result
 */
public class OddEvenTut1 {  // Save as "OddEvenTut1.java"
   public static void main (String[] args) {
      // Declare variables
      int numberIn;   // input integer
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input

      // Prompt and read input as "int"
      System.out.print("Enter an integer: ");  // No newline for prompting message
      numberIn = in.nextInt();                     // Read next input as "int"

      // Check odd/even and print result
      // Use % to find the remainder dividing by 2, and compare with 0
      if (numberIn % 2 == 0) {      // double-equal for comparison
         System.out.println(numberIn + " is even");
      } else {
         System.out.println(numberIn + " is odd");
      }
      System.out.println("bye");
   }
}