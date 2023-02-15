import java.util.Scanner;   // For keyboard input
public class ReverseString {  // Save as "ReverseString.java"
   public static void main (String[] args) {

      // Declare variables
      String inStr;   // input String
      int inStrLen;   // length of the input String
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      System.out.print("Enter a String: ");
      inStr = in.next();   // use next() to read a String
      inStrLen = inStr.length();

      // Use inStr.charAt(index) in a loop to extract character at "index" from inStr.
      // The String's index begins at 0 from the left.
      System.out.print("The reverse is: ");
      for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {  // Process the String from the right
         // Print the inStr.charAt(charIdx)
         System.out.print(inStr.charAt(charIdx));
      }

      in.close();  // Close Scanner
   }
}