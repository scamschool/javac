import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for 5 integers
 * 2. Read inputs as "int"
 * 3. Compute their sum, product, minimum and maximum of the five integers
 * 4. Display the result
 */
public class SumProductMinMax5 {  // Save as "SumProductMinMax5.java"
   public static void main (String[] args) {
      // Declare variables
      int number1, number2, number3, number4, number5;  // The 5 input integers
      int sum, product, min, max;     // To compute these
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt and Read inputs as "int"
      System.out.print("Enter 1st integer: ");  // No newline for prompting message
      number1 = in.nextInt();                     // Read next input as "int"
      System.out.print("Enter 2nd integer: ");
      number2 = in.nextInt();
      System.out.print("Enter 3rd integer: ");
      number3 = in.nextInt();
      System.out.print("Enter 4th integer: ");
      number4 = in.nextInt();
      System.out.print("Enter 5th integer: ");
      number5 = in.nextInt();

      // Compute sum and product
      sum = number1 + number2 + number3 + number4 + number5;
      product = number1 * number2 * number3 * number4 * number5;

      // Compute min
      // The "coding pattern" for computing min is:
      // 1. Set min to the first item
      // 2. Compare current min with the second item and update min if second item is smaller
      // 3. Continue for the next item
      min = number1;        // Assume min is the 1st item
      if (number2 < min) {  // Check if the 2nd item is smaller than current min
         min = number2;     // Update min if so
      }
      if (number3 < min) {  // Continue for the next item
         min = number3;
      }
      if (number4 < min) {  // Continue for the next item
         min = number4;
      }
      if (number5 < min) {  // Continue for the next item
         min = number5;
      }

      // Compute max - similar to min
      max = number1;        // Assume max is the 1st item
      if (number2 > max) {  // Check if the 2nd item is smaller than current max
         max = number2;     // Update max if so
      }
      if (number3 > max) {  // Continue for the next item
         max = number3;
      }
      if (number4 > max) {  // Continue for the next item
         max = number4;
      }
      if (number5 > max) {  // Continue for the next item
         max = number5;
      }

      // Display result
      System.out.println("The sum is: " + sum);   // Print with newline
      System.out.println("The product is: " + product);
      System.out.println("The min is: " + min);
      System.out.println("The max is: " + max);
      in.close();  // Close Scanner
   }
}