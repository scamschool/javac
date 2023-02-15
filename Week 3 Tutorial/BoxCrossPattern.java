import java.util.Scanner;   // For keyboard input
public class BoxCrossPattern {  // Save as "BoxCrossPattern.java"
   public static void main (String[] args) {

      // Declare variables
      int n;
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt and read inputs as "int"
      System.out.print("Enter the size: ");
      n =  in.nextInt();

      for (int row = 1; row <= n; row++) {
         for (int col = 1; col <= n; col++) {
            // if row is 1, or row is n, or col is 1, or col is n, print *
            // else if row = col, or row + col = n + 1, print +
            // else print a space
            if ((row == 1) || (row == n) || (col == 1) || (col == n)) {
               System.out.print("*");
            } else if ((row == col) || (row + col == n + 1)) {
               System.out.print("+");
            } else {
               System.out.print(" ");
            }
         }
         // Print a newline after all the columns
         System.out.println();
      }
      in.close();  // Close Scanner
   }
}