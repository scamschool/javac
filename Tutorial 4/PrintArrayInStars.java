import java.util.Scanner;   // For keyboard input
public class PrintArrayInStars {  // Save as "PrintArrayInStars.java"
   public static void main (String[] args) {

      // Declare variables
      int numItems;
      int[] items;  // Declare array name, to be allocated after numItems is known
      Scanner in = new Scanner(System.in);  // Scan the keyboard
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

      // Print array contents (in index: number of stars) using a nested-loop
      for (int idx = 0; idx < items.length; ++idx) {  // row
         System.out.print(idx + ": ");
         // Print value as the number of stars
         for (int starNo = 1; starNo <= items[idx]; ++starNo) {  // col
            System.out.print("*");
         }
         System.out.println("(" + items[idx] + ")");
      }
      in.close();  // Close Scanner
   }
}