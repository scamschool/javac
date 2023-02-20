import java.util.Scanner;   // For keyboard input
public class HillPattern {  // Save as "HillPattern.java"
   public static void main (String[] args) {

      // Declare variables
      int rows;
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt and read inputs as "int"
      System.out.print("Enter the rows: ");
      rows =  in.nextInt();

      for (int row = 1; row <= rows; row++) {
         for (int col = 1; col <= rows; col++) {
            if ((row + col >= rows + 1)) {
               System.out.print("^");
            } else {
               System.out.print(" ");
            }
         }
         for (int col = 2; col <= rows; col++) {  // skip col = 1
            if (row >= col) {
               System.out.print("^");
            } else {
               System.out.print(" ");
            }
         }
         System.out.println();
      }

      in.close();  // Close Scanner
   }
}