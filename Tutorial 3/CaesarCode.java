import java.util.Scanner;   // For keyboard input
public class CaesarCode {  // Save as "CaesarCode.java"
   public static void main (String[] args) {

      // Declare variables
      String inStr;   // input String
      int inStrLen;   // length of the input String
      char inChar;    // each individual char in the string
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      System.out.print("Enter a plaintext string: ");
      inStr = in.next().toUpperCase();   // use next() to read an input string and convert it into uppercase to reduce the number of cases
      inStrLen = inStr.length();

      System.out.print("The ciphertext string is: ");
      for (int inCharIdx = 0; inCharIdx < inStrLen; ++inCharIdx) {
         inChar = inStr.charAt(inCharIdx);
         if (inChar >= 'A' && inChar <= 'W') {
            System.out.print((char) (inChar + 3));
         } else if (inChar == 'X') {
            System.out.print("A");
         } else if (inChar == 'Y') {
            System.out.print("B");
         } else if (inChar == 'Z') {
            System.out.print("C");
         }
      }

      in.close();  // Close Scanner
   }
}