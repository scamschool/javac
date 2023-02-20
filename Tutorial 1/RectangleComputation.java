import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for the length and width of a rectangle in integer
 * 2. Read inputs as "int"
 * 3. Compute the perimeter and area of the rectangle
 * 4. Display the result
 */
public class RectangleComputation {  // Save as "RectangleComputation.java"
   public static void main (String[] args) {
      // Declare variables
      int length, width;  // The 2 input integers
      int perimeter, area;     // To compute these
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt and Read inputs as "int"
      System.out.print("Enter the length: ");  // No newline for prompting message
      length = in.nextInt();                     // Read next input as "int"
      System.out.print("Enter the width: ");
      width = in.nextInt();

      // Compute perimeter and area
      perimeter = 2 * length + 2 * width;
      area = length * width;

      // Display result
      System.out.println("The perimeter is: " + perimeter);   // Print with newline
      System.out.println("The area is: " + area);
      in.close();  // Close Scanner
   }
}