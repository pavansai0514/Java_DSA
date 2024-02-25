/*  Insertion Sort Algorithm with java

split the array into sorted and unsorted . values from the unsorted part
are picked and compared with sorted subarray elements and placed in correct positoin in sorted part */

public class InsertionSort {

  public static void insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int temp = array[i]; // pick the element from unsorted subarray
      int j = i - 1; // index of left most element from sorted array
      while (j >= 0 && array[j] > temp) { // the elements grater than temp/key element should move
        array[j + 1] = array[j]; //   to on position ahead of their current position
        j--;
      }
      array[j + 1] = temp; //place the element in correct position
    }
  }

  public static void main(String[] args) {
    int[] array = { 3, 5, 2, 33, 4, 76 };
    insertionSort(array);
    for (int i : array) System.out.print(i + " ");
  }
}
