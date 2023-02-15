import java.util.Scanner;   // For keyboard input
public class ZPattern {  // Save as "ZPattern.java"
   public static void main (String[] args) {

      // Declare variables
      int size;
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt and read inputs as "int"
      System.out.print("Enter the size: ");
      size =  in.nextInt();

      for (int row = 1; row <= size; row++) {
         for (int col = 1; col <= size; col++) {
            // if if row is 1, or row is n, or row + col = n + 1, print *
            // else print a space
            if ((row == 1) || (row == size) || (row + col == size + 1)) {
               System.out.print("*");
            }
            else {
               System.out.print(" ");
            }
         }
         // Print a newline after all the columns
         System.out.println();
      }
      in.close();  // Close Scanner
   }
}