import java.util.Scanner;   // For keyboard input
public class ComputePIa {  // Save as "ComputePIa.java"
   public static void main (String[] args) {
      // Declare variables
      int maxDenominator;  // to be input
      double sum = 0.0;
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt and read inputs as "int"
      System.out.print("Enter the maximum denominator: ");
      maxDenominator =  in.nextInt();

      for (int denominator = 1; denominator <= maxDenominator; denominator += 2) {
         // denominator = 1, 3, 5, 7, ..., maxDenominator
         if (denominator % 4 == 1) {
            // add into sum
            sum += (double) 1 / denominator;
         } else if (denominator % 4 == 3) {
            // subtract from sum
            sum -= (double) 1 / denominator;
         } else {
            System.out.println("impossible - error in logic");
         }
      }

      // Print results to 10 decimal places using printf()
      System.out.printf("The PI computed is: %.10f%n", 4 * sum);
      in.close();  // Close Scanner
   }
}