public class QuickSort {

  static int partition(int[] array, int start, int end) {
      int pivot = array[end]; // use the value at the end index as the pivot
      int i = start - 1; // index of smaller element

      for (int j = start; j < end; j++) { // run the loop from start to end-1
          if (array[j] <= pivot) {
              i++;
              // swap array[i] and array[j]
              int temp = array[i];
              array[i] = array[j];
              array[j] = temp;
          }
      }

      // swap array[i+1] and array[end] (or pivot)
      int temp = array[i + 1];
      array[i + 1] = array[end];
      array[end] = temp;

      return i + 1; // return the correct pivot index
  }

  public static void quickSort(int[] array, int start, int end) {
      if (start < end) {
          int pivotIndex = partition(array, start, end); // get the pivot index
          quickSort(array, start, pivotIndex - 1); // sort the left part
          quickSort(array, pivotIndex + 1, end); // sort the right part
      }
  }

  public static void printArray(int[] array) {
      for (int i = 0; i < array.length; i++) {
          System.out.print(array[i] + "  ");
      }
      System.out.println();
  }
}