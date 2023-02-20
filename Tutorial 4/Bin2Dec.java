import java.util.Scanner;
/** Convert a binary string to decimal equivalence */
public class Bin2Dec {  // Save as "Bin2Dec.java"
   public static void main(String[] args) {
      // Declare variables
      String binStr;    // The input binary string
      int binStrLen;    // Length of binStr
      char binChar;     // Each char in the binary String
      int dec = 0;      // Equivalent decimal number

      // Prompt and Read input as "String"
      Scanner in = new Scanner(System.in);  // Scan the keyboard
      System.out.print("Enter a binary string: ");
      binStr = in.next();
      binStrLen = binStr.length();
      in.close();  // Scanner not needed, close

      // Process the String from the RIGHT (i.e. LSB)
      for (int exp = 0; exp < binStrLen ; ++exp) {
         //Extract each char using charAt()
         binChar = binStr.charAt(binStrLen - 1 - exp);
         // 3 cases: '0', '1', others
         if (binChar == '0') {
            // do nothing (multiply by 0)
         } else if (binChar == '1') {
            dec += (int)Math.pow(2, exp);  // multiply by 1
         } else{
            System.err.println("invalid binary string");
            return; // exit main()
            //or System.exit(1) to terminate with exitcode 1
         }
      }
      System.out.println("The decimal equivalent is: " + dec);
   }
}
