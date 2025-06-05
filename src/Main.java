import java.util.Arrays;

/*
 * This class contains test cases for Insertion Sort, as well as the actual
 * implementation of the algorithm.
 */
public class Main {
  public static void main(String[] args) {
    System.out.println("---------- Insertion Sort ----------");

    // Test Case 1: 2 items
    int[] array = {5, 4, 3, 2, 1};
    System.out.println("Before: " + Arrays.toString(array));
    insertionSort(array);
    System.out.println("After: " + Arrays.toString(array));

    System.out.println("");

    // Test Case 2: Many Items
    int[] array2 = {90, 20, 40, 100, 25, 60, 35, 7, 9, 1, 24, 92, 32, 12};
    System.out.println("Before: " + Arrays.toString(array2));
    insertionSort(array2);
    System.out.println("After: " + Arrays.toString(array2));

    System.out.println("");

    // Test Case 3: More Items
    int[] array3 = {90, 20, 89, 105, 807, 40, 100, 25, 6000, 60, 35, 55, 7, 9, 1, 24, 1013, 92, 32, 12, 66, 920};
    System.out.println("Before: " + Arrays.toString(array3));
    insertionSort(array3);
    System.out.println("After: " + Arrays.toString(array3));
  }

  // Insertion Sort Algorithm
  // This implementation seaches and shifts simultaneously
  public static void insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int key = array[i];
      int j = i - 1;

      // Shift elements in sorted portion if the key is less than the right most sorted element and 
      // while we're still in the sorted portion. Then insert at the correct position.
      while (j >= 0 && array[j] > key) { 
        array[j + 1] = array[j];
        j--;
      }
      array[j+1] = key;
    }
  }

  /* First Attempt - First finds the index to insert and then shifts
  public static void insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      // Find which index to insert the value
      int index = 0;
      for (int j = 0; j < i; j++) {
          if (array[i] > array[j]) {
            index++;
          } else {
            break;  // If not not bigger than item in sorted array, we've found the index
          }
      }

      // Do the insertion
      int temp = array[i];    // Element to be inserted into the sorted part of the array
      // Only shift elements needed within the sorted portion
      for (int k = i; k > index; k--) {
        array[k] = array[k - 1]; 
      }
      array[index] = temp;
    }
  }
  */

}