import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for an integer
 * 2. Read inputs as "int"
 * 3. Display the day
 * 4. Use nested-if statement
 */
public class PrintDayInWord {   // Save as "PrintDayInWord.java"
   public static void main(String[] args) {
      // Declare variables
      int dayNumber;   // The input number
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt and read input as "int"
      System.out.print("Enter the day number: ");  // No newline for prompting message
      dayNumber = in.nextInt();                     // Read next input as "int"
 
      // Using nested-if to handle the 8 cases (0 to 6 and others)
      if (dayNumber == 0) {   // double-equal for comparison
         System.out.println("Sunday");
      } else if (dayNumber == 1) {
         System.out.println("Monday");
      } else if (dayNumber == 2) {
         System.out.println("Tuesday");
      } else if (dayNumber == 3) {
         System.out.println("Wednesday");
      } else if (dayNumber == 4) {
         System.out.println("Thursday");
      } else if (dayNumber == 5) {
         System.out.println("Friday");
      } else if (dayNumber == 6) {
         System.out.println("Saturday");
      } else {
         System.out.println("Not a valid day");
      }
      System.out.println("bye");
      in.close();  // Close Scanner
   }
}