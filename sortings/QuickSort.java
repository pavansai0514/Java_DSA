// QuickSort algorithm with java

// Quick sort is based on divide and conquer algorithm
// that pics an element as a pivot and partitions the given array
// it places the elements smaller than pivot in left subarray and
// elements larger than pivot right side of pivot element
// partition is done recursively on each side of pivot after pivot is placed in its correct positon
// this finally sorts the array

public class QuickSort {

  public static void quickSort(int[] array, int low, int high) {
    int loc;
    if (low < high) {
      loc = partition(array, low, high);
      quickSort(array, low, loc - 1);
      quickSort(array, loc + 1, high);
    }
  }

  public static int partition(int[] array, int low, int high) {
    int pivot = array[low], start = low, end = high;
    while (start < end) {
      while (array[start] <= pivot) {
        start++;
      }
      while (array[end] > pivot) {
        end--;
      }
      if (start < end) {
        swap(array, start, end);
      }
    }
    swap(array, low, end);
    return end;
  }

  public static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static void main(String[] args) {
    int[] array = { 3, 5, 1, 22, 4, 55, 6 };
    quickSort(array, 0, array.length - 1);
    for (int i : array) System.out.print(i + " ");
  }
}
