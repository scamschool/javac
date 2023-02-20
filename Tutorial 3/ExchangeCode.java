import java.util.Scanner;   // For keyboard input
public class ExchangeCode {  // Save as "ExchangeCode.java"
   public static void main (String[] args) {

      // Declare variables
      String inStr;   // input String
      int inStrLen;   // length of the input String
      int plainTextChar, cipherTextChar;    // each individual char in the string
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      System.out.print("Enter a plaintext string: ");
      inStr = in.next().toUpperCase();   // use next() to read an input string and convert it into uppercase to reduce the number of cases
      inStrLen = inStr.length();

      System.out.print("The ciphertext string is: ");
      for (int inCharIdx = 0; inCharIdx < inStrLen; ++inCharIdx) {
         plainTextChar = inStr.charAt(inCharIdx);
         cipherTextChar = 'A' + 'Z' - (int) plainTextChar;
         System.out.print((char) cipherTextChar);
      }

      in.close();  // Close Scanner
   }
}