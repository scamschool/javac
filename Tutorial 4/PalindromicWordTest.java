import java.util.Scanner;   // For keyboard input
public class PalindromicWordTest {  // Save as "PalindromicWordTest.java"
   public static void main (String[] args) {

      // Declare variables
      String inStr;           // The input string, need to save for output printing
      String inStrLowerCase;  // The input string in lowercase to reduce the cases in comparison
      int inStrLen;           // The length of the input string
      char forwardChar, backwardChar;   // to compare these two chars, scan forward and backward
      boolean isPalindromic;  // boolean flag
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      System.out.print("Enter a String: ");
      inStr = in.next();   // use next() to read an input string
      inStrLowerCase = inStr.toLowerCase();
      inStrLen = inStr.length();

      isPalindromic = true;     // assume it is true, unless our check fails
      for (int forwardIdx = 0, backwardIdx = inStrLen - 1; forwardIdx < inStrLen/2; ++forwardIdx, --backwardIdx) {
         forwardChar = inStrLowerCase.charAt(forwardIdx);
         backwardChar = inStrLowerCase.charAt(backwardIdx);
         if (forwardChar != backwardChar) {
            isPalindromic = false;
            break;    // upon the first encounter, no need to go further
         }
      }
      if (isPalindromic == false) {
         System.out.print("\"" + inStr + "\" is not palindromic");
      } else {
         System.out.print("\"" + inStr + "\" is palindromic");
      }
      in.close();  // Close Scanner
   }
}