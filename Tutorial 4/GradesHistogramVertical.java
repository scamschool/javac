import java.util.Scanner;   // For keyboard input
public class GradesHistogramVertical {  // Save as "GradesHistogramVertical.java"
   public static void main (String[] args) {

      // Declare variables
      int numStudents;
      int[] grades;     // Declare array name, to be allocated after numStudents is known
      int[] bins = new int[10];   // int array of 10 histogram bins for 0-9, 10-19, ..., 90-100

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

      // Populate the bins
      for (int i = 0; i < grades.length; ++i) {
         if (grades[i] == 100) {   // Need to handle 90-100 separately as it has 11 items.
            ++bins[9];
         } else {
            ++bins[grades[i]/10];
         }
      }

      // Compute max
      int max;
      max = bins[0];        // Assume max is the 1st item
      for (int i = 1; i < bins.length; i++) {
         if (bins[i] > max) {
            max = bins[i];
         }
      }

      // print vertical histogram
      for (int item = max; item >= 1; --item) {   // row = max down to 1
         for (int binIdx = 0; binIdx < bins.length; ++binIdx) {
            if (bins[binIdx] >= item) {
               if (binIdx == 0) {
                  System.out.print("   *  ");
               } else if (binIdx == bins.length - 1) {
                  System.out.print("    *   ");
               } else {
                  System.out.print("    *  ");
               }
            }
            else {
               if (binIdx == 0) {
                  System.out.print("      ");
               } else if (binIdx == bins.length - 1) {
                  System.out.print("        ");
               } else {
                  System.out.print("       ");
               }
            }
         }
         System.out.println();
      }
      // Print the bins
      System.out.println("  0-9   10-19  20-29  30-39  40-49  50-59  60-69  70-79  80-89  90-100");
   }

   // return the max of int[]
   public static int max(int[] arr) {
      int max = arr[0];
      for (int i = 1; i < arr.length; ++i) {
         if (arr[i] > max) max = arr[i];
      }
      return max;
   }
}