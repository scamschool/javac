import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for an integer
 * 2. Read inputs as "int"
 * 3. Display the number
 * 4. Use switch-case statement
 */
public class PrintNumberInWord {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
      // Declare variables
      int numberIn;   // The input number
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt and read input as "int"
      System.out.print("Enter a number: ");  // No newline for prompting message
      numberIn = in.nextInt();               // Read next input as "int"
 
      // Using switch-case to handle 11 cases (0 to 9 and others)
      switch (numberIn) {
         case 1: 
            System.out.println("ONE"); break;  // "break" needed at the end of every "case"
         case 2: 
            System.out.println("TWO"); break;
         case 3: 
            System.out.println("THREE"); break;
         case 4: 
            System.out.println("FOUR"); break;
         case 5: 
            System.out.println("FIVE"); break;
         case 6: 
            System.out.println("SIX"); break;
         case 7: 
            System.out.println("SEVEN"); break;
         case 8: 
            System.out.println("EIGHT"); break;
         case 9: 
            System.out.println("NINE"); break;
         case 0: 
            System.out.println("ZERO"); break;
         default: System.out.println("OTHER");  // "break" not needed for "default"
      }
      System.out.println("bye!");
      in.close();  // Close Scanner
   }
}