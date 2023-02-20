import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for the base radius and height of a cylinder in floating point number
 * 2. Read inputs as "double"
 * 3. Compute the base area, surface area, and volume of the cylinder
 * 4. Display the result rounded to 2 decimal places
 */
public class CylinderComputation {  // Save as "CylinderComputation.java"
   public static void main (String[] args) {
      // Declare variables
      double radius, height;  // The input floating point numbers
      double baseArea, surfaceArea, volume;     // To compute these
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt and Read inputs as "int"
      System.out.print("Enter the radius: ");  // No newline for prompting message
      radius = in.nextDouble();                     // Read next input as "double"
      System.out.print("Enter the height: ");
      height = in.nextDouble();

      // Compute base area, surface area, and volume
      baseArea = Math.PI * radius * radius;
      surfaceArea = 2.0 * Math.PI * radius * height + 2.0 * baseArea;
      volume = baseArea * height;

      // Display result
      System.out.printf("Base area is: %.2f%n", baseArea);
      System.out.printf("Surface area is: %.2f%n", surfaceArea);
      System.out.printf("Volume is: %.2f%n", volume);
      in.close();  // Close Scanner
   }
}