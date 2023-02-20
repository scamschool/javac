import java.util.Scanner;   // For keyboard input
public class PhoneKeyPad {  // Save as "PhoneKeyPad.java"
   public static void main (String[] args) {

      // Declare variables
      String inStr;   // input String
      int inStrLen;   // length of the input String
      char inChar;    // each individual char in the string
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      System.out.print("Enter a String: ");
      inStr = in.next().toLowerCase();   // use next() read an input String and convert it into lowercase to reduce the number of cases
      inStrLen = inStr.length();

      System.out.print("The phone number is: ");
      for (int inCharIdx = 0; inCharIdx < inStrLen; ++inCharIdx) {
         inChar = inStr.charAt(inCharIdx);
         switch (inChar) {
            case 'a': case 'b': case 'c':   // same as: if (inChar == 'a' || inChar == 'b' || inChar == 'c')
               System.out.print(2); break;
            case 'd': case 'e': case 'f':
               System.out.print(3); break;
            case 'g': case 'h': case 'i':
               System.out.print(4); break;
            case 'j': case 'k': case 'l':
               System.out.print(5); break;
            case 'm': case 'n': case 'o':
               System.out.print(6); break;
            case 'p': case 'q': case 'r': case 's':
               System.out.print(7); break;
            case 't': case 'u': case 'v':
               System.out.print(8); break;
            case 'w': case 'x': case 'y': case 'z':
               System.out.print(9); break;
            default:
               System.out.print(inChar);
         }
      }

      in.close();  // Close Scanner
   }
}