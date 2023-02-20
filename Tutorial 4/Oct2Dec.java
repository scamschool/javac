import java.util.Scanner;
/** Convert from hexadecimal to decimal */
public class Oct2Dec {
	public static void main(String[] args) {

		String octStr;  // Input octal String
		int octStrLen;  // Length of octStr
		char octChar;   // Each char in the oct String
		int dec = 0;    // Decimal equivalent

		// Read and read input as "String"
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an octal string: ");
		octStr = in.next();
		octStrLen = octStr.length();
		in.close();

		// Process the String from the LEFT (MSD)
		for (int pos = 0; pos < octStrLen; ++pos) {
			//Extract the char using charAt()
			octChar = octStr.charAt(pos);
			int exp = octStrLen - 1 - pos;  // exponent
			int factor = (int)Math.pow(8, exp);
			// 8 cases: '0'-'7', others
			if (octChar >= '1' && octChar <= '7') {
				dec += (octChar - '0') * factor;
			} else if (octChar != '0') {
				System.out.println("invalid oct String");
				return;      // or System.exit(1);
			}     // else octChar == '0', do nothing
		}
		System.out.println("The decimal equivalent is: " + dec);
	}
}