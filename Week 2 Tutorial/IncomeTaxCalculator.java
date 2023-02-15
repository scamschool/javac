import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for an integer
 * 2. Read input as "int"
 * 3. Compute the factorial of the integer
 * 4. Display the result
 */
public class IncomeTaxCalculator {  // Save as "IncomeTaxCalculator.java"
   public static void main (String[] args) {
      // Declare constants first (variables may use these constants)
      // The keyword "final" marked these as constant (i.e., cannot be changed).
      // Use uppercase words joined with underscore to name constants
      final double TAX_RATE_ABOVE_20K = 0.1;
      final double TAX_RATE_ABOVE_40K = 0.2;
      final double TAX_RATE_ABOVE_60K = 0.3;

      // Declare variables
      int taxableIncome;
      double taxPayable;
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt and read input as "int"
      System.out.print("Enter the taxable income: $");
      taxableIncome = in.nextInt();
      
      // Compute tax payable in "double" using a nested-if to handle 4 cases
      if (taxableIncome <= 20000) {         // [0, 20000]
         taxPayable = 0;
      } else if (taxableIncome <= 40000) {  // [20001, 40000]
         taxPayable = TAX_RATE_ABOVE_20K * (taxableIncome - 20000);
      } else if (taxableIncome <= 60000) {  // [40001, 60000]
         taxPayable = TAX_RATE_ABOVE_20K * 20000 + TAX_RATE_ABOVE_40K * (taxableIncome - 40000);
      } else {                              // [60001, ]
         taxPayable = TAX_RATE_ABOVE_20K * 20000 + TAX_RATE_ABOVE_40K * 20000 + TAX_RATE_ABOVE_60K * (taxableIncome - 60000);
      }

      // Display results
      System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
      in.close();  // Close Scanner
   }
}