public class Recursion {
  public static void printntimes(String s, int n) {
    if (n == 0) return;
    System.out.println(s);
    printntimes(s, n-1);
  }

  public static void print1ton(int n) {
    if (n == 0) return;
    print1ton(n-1);
    System.out.println(n);
  }

  public static void printnto1(int n) {
    if (n == 0) return;
    System.out.println(n);
    printnto1(n-1);
  }

  public static int sumofnnatural(int n) {
    if (n == 0) return 0;
    return n + sumofnnatural(n-1);
  }

  public static int fact(int n) {
    if (n == 0) return 1;
    return n * fact(n-1);
  }

  public static int fib(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fib(n-1) + fib(n-2);
  }

  static void printRevesedArray(int arr[], int n) {
    System.out.print("Reversed array is:- \n");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  static void reverseArray(int arr[], int n) {
    int p1 = 0, p2 = n - 1;
    while (p1 < p2) {
      int tmp = arr[p1];
      arr[p1] = arr[p2];
      arr[p2] = tmp;
      p1++;
      p2--;
    }
    printRevesedArray(arr, n);
  }

  static boolean isPalindrome(int i, String s) {
    if (i >= s.length()/2) return true;
    if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
    return isPalindrome(i + 1, s);
  }

  public static void main(String[] args) {
    printntimes("himanshu", 7);
    print1ton(10);
    printnto1(10);
    System.out.println(sumofnnatural(10));
    System.out.println(fact(5));
    System.out.println(fib(10));
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    reverseArray(arr, 10);
    System.out.println(isPalindrome(0, "madam"));
  }
}
