import java.util.Scanner;   // For keyboard input
public class PrintArray {  // Save as "PrintArray.java"
   public static void main (String[] args) {

      // Declare variables
      int numItems;
      int[] items;  // Declare array name, to be allocated after numItems is known
      Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt for a non-negative integer for the number of items;
      // and read the input as "int". No input validation.
      System.out.print("Enter the number of items: ");
      numItems = in.nextInt();

      // Allocate the array
      items = new int[numItems];

      // Prompt and read the items into the "int" array, if array length > 0
      if (items.length > 0) {
         System.out.print("Enter the value of all items (separated by space): ");
         for (int i = 0; i < items.length; ++i) {
            items[i] = in.nextInt();
         }
      }

      // Print array contents, need to handle first item and subsequent items differently
      System.out.print("The values are: [");
      for (int i = 0; i < items.length; ++i) {
         if (i == 0) {
            // Print the first item without a leading commas
            System.out.print(items[i]);
         } else {
            // Print the subsequent items with a leading commas
            System.out.print(", " + items[i]);
         }
         // or, using a one liner
         //System.out.print((i == 0) ? ...... : ......);
      }
      System.out.print("]");
      in.close();  // Close Scanner
   }
}