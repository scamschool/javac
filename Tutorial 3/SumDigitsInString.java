import java.util.Scanner;   // For keyboard input
public class SumDigitsInString {  // Save as "SumDigitsInString.java"
   public static void main (String[] args) {

      // Declare variables
      String inStr;   // input String
      int inStrLen;   // length of the input String
      char c;    // each individual char in the string
      int sum = 0;
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      System.out.print("Enter a String: ");
      inStr = in.next().toLowerCase();   // use next() read an input String and convert it into lowercase to reduce the number of cases
      inStrLen = inStr.length();

      for (int inCharIdx = 0; inCharIdx < inStrLen; ++inCharIdx) {
         c = inStr.charAt(inCharIdx);
         if (Character.isDigit(c)) {
            sum += c - '0';
         }
      }

      System.out.print("The sum of all digits is: " + sum);
      in.close();  // Close Scanner
   }
}