import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for 2 integers
 * 2. Read inputs as "int"
 * 3. Compute the sum and average of the running integers from the lowerbound to the upperbound (both inclusive)
 * 4. Display the result
 */
public class SumAverage {  // Save as "SumAverage.java"
   public static void main (String[] args) {
      // Declare variables
      int lowerbound, upperbound, sum = 0;
      double average;
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt and read inputs as "int"
      System.out.print("Enter the lowerbound: ");
      lowerbound = in.nextInt();
      System.out.print("Enter the upperbound: ");
      upperbound = in.nextInt();

      // Compute sum using a for-loop
      for (int number = lowerbound; number <= upperbound; ++number) {
         sum += number;
      }

      // Compute average
      // Take note that int/int gives int. Type casting needed.
      // The total count is (upperbound - lowerbound + 1)
      average = (double) sum / (upperbound - lowerbound + 1);

      // Display results
      System.out.println("The sum is: " + sum);
      System.out.printf("The average is: %.2f%n", average);
      in.close();  // Close Scanner
   }
}