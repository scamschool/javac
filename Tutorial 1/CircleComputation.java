import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for the radius of a circle in floating point number
 * 2. Read inputs as "double"
 * 3. Compute the diameter, circumference and area of the circle
 * 4. Display the result rounded to 2 decimal places
 */
public class CircleComputation {  // Save as "CircleComputation.java"
   public static void main (String[] args) {
      // Declare variables
      double radius;  // The input floating point number
      double diameter, circumference, area;     // To compute these
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt and Read inputs as "int"
      System.out.print("Enter the radius: ");  // No newline for prompting message
      radius = in.nextDouble();                     // Read next input as "double"

      // Compute diameter, circumference and area
      area = Math.PI * radius * radius;
      diameter = 2.0 * radius;
      circumference = 2.0 * Math.PI * radius;

      // Display result
      System.out.printf("Diameter is: %.2f%n", diameter);
      System.out.printf("Circumference is: %.2f%n", circumference);
      System.out.printf("Area is: %.2f%n", area);
      in.close();  // Close Scanner
   }
}