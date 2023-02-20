import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for the radius of a sphere in floating point number
 * 2. Read inputs as "double"
 * 3. Compute the volume and surface area of the sphere
 * 4. Display the result rounded to 2 decimal places
 */
public class SphereComputation {  // Save as "SphereComputation.java"
   public static void main (String[] args) {
      // Declare variables
      double radius;  // The input floating point number
      double volume, surfaceArea;     // To compute these
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt and Read inputs as "int"
      System.out.print("Enter the radius: ");  // No newline for prompting message
      radius = in.nextDouble();                     // Read next input as "double"

      // Compute volume surface area
      surfaceArea = 4 * Math.PI * radius * radius;
      volume = (4 * Math.PI * radius * radius * radius) / 3;   // But this does not work?! Why?

      // Display result
      System.out.printf("Surface Area is: %.2f%n", surfaceArea);
      System.out.printf("Volume is: %.2f%n", volume);
      in.close();  // Close Scanner
   }
}