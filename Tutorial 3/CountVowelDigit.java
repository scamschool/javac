import java.util.Scanner;   // For keyboard input
public class CountVowelDigit {  // Save as "CountVowelDigit.java"
   public static void main (String[] args) {

      // Declare variables
      String inStr;   // input String
      int inStrLen;   // length of the input String
      char c;    // each individual char in the string
      int vowels = 0, digits = 0;
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      System.out.print("Enter a String: ");
      inStr = in.next().toLowerCase();   // use next() read an input String and convert it into lowercase to reduce the number of cases
      inStrLen = inStr.length();

      for (int inCharIdx = 0; inCharIdx < inStrLen; ++inCharIdx) {
         c = inStr.charAt(inCharIdx);
         if (Character.isDigit(c)) {
            digits += 1;
         } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            vowels += 1;
         }
      }

      System.out.printf("Number of vowels is: %d (%.2f%%)", vowels, (double) vowels / inStrLen * 100);
      System.out.println();
      System.out.printf("Number of digits is: %d (%.2f%%)", digits, (double) digits / inStrLen *100);
      in.close();  // Close Scanner
   }
}