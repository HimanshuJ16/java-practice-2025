import java.util.ArrayList;

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

  public static void merge(int[] arr, int low, int mid, int high) {
    ArrayList<Integer> temp = new ArrayList<>(); // temporary array
    int left = low;      // starting index of left half of arr
    int right = mid + 1;   // starting index of right half of arr

    // storing elements in the temporary array in a sorted manner

    while (left <= mid && right <= high) {
      if (arr[left] < arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        right++;
      }
    }

    // if elements on the left half are still left
    while (left <= mid) {
      temp.add(arr[left]);
      left++;
    }

    // if elements on the right half are still left
    while (right <= high) {
      temp.add(arr[right]);
      right++;
    }

    // transfering all elements from temporary to arr
    for (int i = low; i <= high; i++) {
      arr[i] = temp.get(i - low);
    }
  }   

  public static void mergeSort(int[] arr, int low, int high) {
    // Divide and Conquer/Merge
    // Best time complexity: O(n log n)
    // Worst time complexity: O(n)
    if (low < high) {
      int mid = (low + high) / 2;
      mergeSort(arr, low, mid);
      mergeSort(arr, mid + 1, high);
      merge(arr, low, mid, high);
    }
  }

  public static int partition(int[] arr, int low, int high) {
    // Approach 1
    // int pivot = arr[high];
    // int i = low - 1;
    // for (int j = low; j <= high - 1; j++) {
    //   if (arr[j] < pivot) {
    //     i++;
    //     swap(arr, i, j);
    //   }
    // }
    // swap(arr, i + 1, high);
    // return i + 1;

    // Approach 2
    int pivot = arr[low];
    int start = low, end = high;
    while (start < end) {
      while (arr[start] <= pivot && start < high) {
        start++;
      }
      while (arr[end] > pivot && end >= low + 1) {
        end--;
      }
      if (start < end) {
        swap(arr, start, end);
      }
    }
    swap(arr, low, end);
    return end;
  } 

  public static void quickSort(int[] arr, int low, int high) {
    // Divide and Conquer/Partition
    // Best time complexity: O(n log n)
    // Worst time complexity: O(n^2)
    if (low < high) {
      int pIndex = partition(arr, low, high);
      quickSort(arr, low, pIndex - 1);
      quickSort(arr, pIndex + 1, high);
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
    mergeSort(arr, 0, arr.length - 1);
    System.out.println();
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    quickSort(arr, 0, arr.length - 1);
    System.out.println();
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }  
}