// Mergesort algorith with java
// the array is divided into smaller subarrays, sorting each subarray then merging
// the sorted subarrays back together to form final sorted subarrray
// it Uses divide and conquer
public class MergeSort {

  public static void mergesort(int[] array, int low, int high) {
    if (low < high) {
      int mid = low + (high - low) / 2;
      mergesort(array, low, mid);
      mergesort(array, mid + 1, high);
      merge(array, low, mid, high);
    }
  }

  public static void merge(int[] array, int low, int mid, int high) {
    int n1 = mid - low + 1;
    int n2 = high - mid;
    int l[] = new int[n1];
    int r[] = new int[n2];
    for (int i = 0; i < n1; i++) {
      l[i] = array[low + i];
    }
    for (int j = 0; j < n2; j++) {
      r[j] = array[mid + 1 + j];
    }
    int i = 0, j = 0, k = low;
    while (i < n1 && j < n2) {
      if (l[i] <= r[j]) {
        array[k] = l[i];
        i++;
      } else {
        array[k] = r[j];
        j++;
      }
      k++;
    }
    while (i < n1) {
      array[k] = l[i];
      i++;
      k++;
    }
    while (j < n2) {
      array[k] = r[j];
      j++;
      k++;
    }
  }

  public static void main(String[] args) {
    int[] array = { 2, 12, 5, 14, 3, 4, 45, 22 };
    mergesort(array, 0, array.length - 1);
    for (int i : array) {
      System.out.print(i + " ");
    }
  }
}
