public class Sorting {  
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      swap(arr, i, minIndex);
    }
  }

  public static void bubbleSort(int[] arr) { 
    // Best time complexity: O(n) if array is already sorted
    // Worst time complexity: O(n^2)
    // Space complexity: O(1)
    // Explanation: https://www.geeksforgeeks.org/bubble-sort/
    for (int i = arr.length - 1; i >= 0; i--) {
      int didSwap = 0;
      for (int j = 0; j <= i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
          didSwap = 1;
        }
      }
      if (didSwap == 0) {
        break;
      }
    }
  }

  public static void insertionSort(int[] arr) {
    // Best time complexity: O(n) if array is already sorted
    // Worst time complexity: O(n^2)
    for (int i = 1; i < arr.length; i++) {
      int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
  }
  public static void main(String[] args) {
    int arr[] = { 13, 46, 24, 52, 20, 9 };
    selectionSort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }    
    bubbleSort(arr);
    System.out.println();
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    } 
    insertionSort(arr);
    System.out.println();
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }  
}