// selection Sort Algorithm with java

// it divides the array into sorted and unsorted subarray
// select the minimum element from the unsorted subarray
// moving it to the sorted position
// the pointer in sorted array always increment and swap with the minimum element

public class SelectionSort {

  public static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static void selectionSort(int array[]) {
    for (int i = 0; i < array.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < array.length; j++) { // select minimum element from unsorted subarray
        if (array[j] < array[min]) min = j;
      }

      if (min != i) {
        swap(array, i, min);
      }
    }
  }

  public static void main(String[] args) {
    int array[] = { 4, 6, 87, 2, 3, 23 };
    selectionSort(array);
    for (int i : array) {
      System.out.print(i + " ");
    }
  }
}
