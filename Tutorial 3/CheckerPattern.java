import java.util.Scanner;   // For keyboard input
public class CheckerPattern {  // Save as "Checker Pattern.java"
   public static void main (String[] args) {

      // Declare variables
      int size;
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt and read inputs as "int"
      System.out.print("Enter the size: ");
      size =  in.nextInt();

      // Outer loop to print ALL the rows
      for (int row = 1; row <= size; row++) {
         // Use print() to print a space, if needed, before printing this row
         if (row%2 == 0) {
            System.out.print(" ");
         }
         // Inner loop to print ALL the columns of ONE row
         for (int col = 1; col <= size; col++) {
            // Use print() here
            System.out.print("# ");
         }
         // Print a newline after all the columns
         System.out.println();
      }
      in.close();  // Close Scanner
   }
}