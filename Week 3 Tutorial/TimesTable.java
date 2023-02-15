import java.util.Scanner;   // For keyboard input
public class TimesTable {  // Save as "TimesTable.java"
   public static void main (String[] args) {

      // Declare variables
      int size;
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt and read inputs as "int"
      System.out.print("Enter the size of the table: ");
      size =  in.nextInt();

      // Print header row
      System.out.print(" * |");
      for (int col = 1; col <= size; ++col) {
         System.out.print("   " + col);
      }
      System.out.println();   // End row with newline

      System.out.print("===+");   // print separator row
      for (int col = 1; col <= size; ++col) {
         System.out.print("====");
      }
      System.out.println();  // End row with newline

      // Print body
      for (int row = 1; row <= size; ++row) {  // outer loop
         System.out.print(" " + row + " |");   //print row header
         for (int col = 1; col <= size; ++col) {  // inner loop
            System.out.printf("%4d", row*col); // formatted output
         }
         System.out.println();  // End row with newline
      }

      in.close();  // Close Scanner
   }
}