import java.util.Scanner;   // For keyboard input
public class MagicNumber {  // Save as "MagicNumber.java"
   public static void main (String[] args) {

      // Declare variables
      int number;   // input
      int inNumber;
      int inDigit;    // each digit
      int noEights = 0;   // number of 8s
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      System.out.print("Enter a positive integer: ");
      number = in.nextInt();
      in.close();  // Close Scanner

      // Extract and drop the "last" digit repeatedly using a while-loop with modulus/divide operations
      inNumber = number;
      while (inNumber > 0) {
         inDigit = inNumber % 10; // extract the "last" digit
         // Print this digit (which is extracted in reverse order)
         if (isMagic(inDigit)) {
            noEights += 1;
         }
         inNumber /= 10;          // drop "last" digit and repeat
      }

      if (noEights == 0) {
         System.out.print(number + " is not a magic number");
      } else {
         System.out.print(number + " is a magic number");
      }
   }

   // The isMagic() method returns a boolean of true/false
   public static boolean isMagic(int number) {
      return (number == 8);
   }
}