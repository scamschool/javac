import java.util.Scanner;   // For keyboard input
public class TriangularPatternA {  // Save as "TriangularPatternA.java"
   public static void main (String[] args) {

      // Declare variables
      int size;
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt and read inputs as "int"
      System.out.print("Enter the size: ");
      size =  in.nextInt();

      for (int row = 1; row <= size; row++) {
         for (int col = 1; col <= size; col++) {
            // if (row >= col) print *
            if (row >= col) {
               System.out.print("*");
            }
         }
         // Print a newline after all the columns
         System.out.println();
      }
      in.close();  // Close Scanner
   }
}