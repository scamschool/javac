import java.util.Scanner;   // For keyboard input
public class SearchArray {  // Save as "SearchArray.java"
   public static void main (String[] args) {

      // Declare variables
      int numItems;
      int[] items;  // Declare array name, to be allocated after numItems is known
      int searchKey;
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

      // Prompt and read the search key
      System.out.print("Enter the search key: ");
      searchKey = in.nextInt();
      in.close();  // Close Scanner

      if (search(items, searchKey) == -1){
         System.out.println(searchKey + " is not found");
      } else {
         System.out.println(searchKey + " is found with index " + search(items, searchKey));
      }
   }

   // The search() method returns the array index if the array contains the given int; or -1 otherwise
   public static int search(int[] array, int key) {
      int value = -1;
      for (int i = 0; i < array.length; ++i) {
         if (array[i] == key) {
            value = i;
            break;
         }
      }
      return value;
   }
}