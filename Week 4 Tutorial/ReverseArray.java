import java.util.Scanner;   // For keyboard input
public class ReverseArray {  // Save as "ReverseArray.java"
   public static void main (String[] args) {

      // Declare variables
      int numItems;
      int[] items;  // Declare array name, to be allocated after numItems is known
      boolean isEmpty;
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
      in.close();  // Close Scanner

      System.out.print("The original array is: ");
      print(items);
      System.out.print("The reverse is: ");
      reverse(items);
   }

   // The reverse() method reverses the contents of the given int array, in place
   public static void reverse(int[] array) {
      int[] reversed;
      reversed = new int[array.length];
      int arrayIdx = 0;
      for (int i = array.length - 1; i >= 0; --i) {  // Process the array from the right
         reversed[arrayIdx] = array[i];
         arrayIdx += 1;
      }
      System.out.print("[");
      for (int i = 0; i < array.length; ++i) {
         if (i == 0) {
            // Print the first item without a leading commas
            System.out.print(reversed[i]);
         } else {
            // Print the subsequent items with a leading commas
            System.out.print(", " + reversed[i]);
         }
      }
      System.out.println("]");
      return;
   }

   // The print() method prints [x1, x2, ..., xn]
   public static void print(int[] array) {
      System.out.print("[");
      for (int i = 0; i < array.length; ++i) {
         if (i == 0) {
            // Print the first item without a leading commas
            System.out.print(array[i]);
         } else {
            // Print the subsequent items with a leading commas
            System.out.print(", " + array[i]);
         }
         // or, using a one liner
         //System.out.print((i == 0) ? ...... : ......);
      }
      System.out.println("]");
      return;
   }
}