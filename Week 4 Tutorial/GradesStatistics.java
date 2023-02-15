import java.util.Scanner;   // For keyboard input
public class GradesStatistics {  // Save as "GradesStatistics.java"
   public static void main (String[] args) {

      // Declare variables
      int numStudents;
      int[] grades;  // Declare array name, to be allocated after numItems is known
      Scanner in = new Scanner(System.in);  // Scan the keyboard
      System.out.print("Enter the number of students: ");
      numStudents = in.nextInt();

      // Allocate the array
      grades = new int[numStudents];

      // Prompt and read the items into the "int" array, if array length > 0
      for (int i = 0; i < grades.length; ++i) {
         System.out.print("Enter the grade for student " + (i+1) + ": ");
         grades[i] = in.nextInt();
      }
      in.close();  // Close Scanner

      //Compute average
      int sum = 0;
      for (int i = 0; i < grades.length; ++i) {
         sum += grades[i];
      }
      double average = (double) sum / numStudents;

      // Print average to 2 decimal places
      System.out.printf("The average is: %.2f%n", average);

      int min, max;
      min = grades[0];        // Assume min is the 1st item
      for (int i = 1; i < grades.length; ++i) {
         if (grades[i] < min) {
            min = grades[i];
         }
      }

      // Compute max - similar to min
      max = grades[0];        // Assume min is the 1st item
      for (int i = 1; i < grades.length; ++i) {
         if (grades[i] > max) {
            max = grades[i];
         }
      }

      System.out.println("The minimum is: " + min);
      System.out.println("The maximum is: " + max);
   }
}