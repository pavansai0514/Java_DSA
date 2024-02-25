/* Bubble Sort Algorithm using Java */

public class BubbleSort {

  public static void bubblesort(int[] array) {
    int n = array.length;
    int temp;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int array[] = { 4, 2, 52, 1, 5, 12 };
    bubblesort(array);
    for (int i : array) System.out.print(i + " ");
  }
}
