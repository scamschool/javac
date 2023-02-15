import java.util.Scanner;   // For keyboard input
public class IntArrayMethods {  // Save as "IntArrayMethods.java"
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

      System.out.print("The values are: ");
      print(items);
      System.out.println("The min is: " + min(items));
      System.out.println("The max is: " + max(items));
      System.out.println("The sum is: " + sum(items));
      System.out.printf("The average (rounded to 2 decimal places) is: %.2f%n", average(items));
      if (isEmpty(items) == false) {
         System.out.println("This array is not empty");
      } else {
         System.out.println("This array id empty");
      }
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

   // The min() method returns the minimum
   public static int min(int[] array) {
      int min = array[0];        // Assume min is the 1st item
      for (int i = 1; i < array.length; ++i) {
         if (array[i] < min) {
            min = array[i];
         }
      }
      return min;
   }

   // The max() method returns the maximum
   public static int max(int[] array) {
      int max = array[0];        // Assume max is the 1st item
      for (int i = 1; i < array.length; ++i) {
         if (array[i] > max) {
            max = array[i];
         }
      }
      return max;
   }

   // The sum() method returns the sum
   public static int sum(int[] array) {
      int sum = 0;
      for (int i = 0; i < array.length; ++i) {
         sum += array[i];
      }
      return sum;
   }

   // The average() method returns the average in double
   public static double average(int[] array) {
      int sum = 0;
      double avg;
      for (int i = 0; i < array.length; ++i) {
         sum += array[i];
      }
      return ((double) sum / array.length);
   }

   // The isEmpty() method returns a boolean of true/false
   public static boolean isEmpty(int[] array) {
      return (array.length == 0);
   }
}