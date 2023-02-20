import java.util.Scanner;   // For keyboard input
public class AverageWithInputValidation {  // Save as "AverageWithInputValidation.java"
   public static void main (String[] args) {
      /// Declare constant
      final int NUM_STUDENTS = 3;

      // Declare variables
      int numberIn;
      boolean isValid;   // boolean flag to control the input validation loop
      int sum = 0;
      double average;
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
         // Prompt user for mark with input validation
         isValid = false;   // reset for each student assuming input is not valid
         do {
            System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
            numberIn =  in.nextInt();
            // If input is valid, eet isValid = true to exit the loop
            // Else, print error message and repeat
            if (numberIn >= 0 && numberIn <= 100) {
               isValid = true;   // exit the loop
            } else {
               System.out.println("Invalid input, try again...");  // Print error message and repeat
            }
         } while (!isValid);
         sum += numberIn;
      }
      
      average = (double) sum / NUM_STUDENTS;
      System.out.printf("The average is: %.2f%n", average);
      in.close();  // Close Scanner
   }
}