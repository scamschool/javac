import java.util.Scanner;   // For keyboard input
public class IncomeTaxCalculatorSentinel {  // Save as "IncomeTaxCalculatorSentinel.java"
   public static void main (String[] args) {
      // Declare constants first
      final int SENTINEL = -1;    // Terminating value for input
      final double TAX_RATE_ABOVE_20K = 0.1;
      final double TAX_RATE_ABOVE_40K = 0.2;
      final double TAX_RATE_ABOVE_60K = 0.3;

      // Declare variables
      int taxableIncome;
      double taxPayable;
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Read the first input to "seed" the while loop
      System.out.print("Enter the taxable income (or -1 to end): $");
      taxableIncome = in.nextInt();

      while (taxableIncome != SENTINEL) {
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

         // Print result rounded to 2 decimal places
         System.out.printf("The income tax payable is: $%.2f%n", taxPayable);

         // Read the next input
         System.out.print("Enter the taxable income (or -1 to end): $");
         taxableIncome = in.nextInt();
            // Repeat the loop body, only if the input is not the SENTINEL value.
            // Take note that you need to repeat these two statements inside/outside the loop!
      }
      System.out.println("bye!");
      in.close();  // Close Scanner
   }
}