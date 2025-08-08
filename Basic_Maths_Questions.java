import java.util.*;

public class Basic_Maths_Questions {
  public static int countNumbers(int n) {
    int count = (int) Math.floor(Math.log10(n) + 1);
    return count;
  }

  public static int reverse(int x) {
    int num = Math.abs(x);
    int rev = 0;        
    while (num != 0) {
      int ld = num % 10;
      if (rev > (Integer.MAX_VALUE - ld) / 10) {
        return 0;
      }            
      rev = rev * 10 + ld;
      num = num / 10;
    }        
    return (x < 0) ? (-rev) : rev;
  }

  public static boolean isPalindrome(int x) {
    String s = String.valueOf(x);
    int n = s.length();
    for (int i=0; i<n/2; i++) {
      if (s.charAt(i) != s.charAt(n-i-1)) return false;
    }
    return true;
  }

  public static boolean isArmstrong(int n) {
    int x = countNumbers(n);
    int num = n;
    int sum = 0;
    while (num != 0) {
      int ld = num % 10;
      sum += Math.pow(ld, x);
      num /= 10;
    }
    return sum == n;
  }

  public static void printDivisors(int n) {
    // //Approach 1
    // for (int i = 1; i <= n; i++) {
    //   if (n % i == 0) {
    //     System.out.print(i + " ");
    //   }
    // }

    // //Approach 2
    List<Integer> divisors = new ArrayList<>();
    for (int i = 1; Math.pow(i, 2) <= n; i++) {
      if (n % i == 0) {
        divisors.add(i);
        if (n / i != i) {
          divisors.add(n / i);
        }
      }
    }
    Collections.sort(divisors);
    for (int i = 0; i < divisors.size(); i++) {
      System.out.print(divisors.get(i) + " ");
    }
    System.out.println();
  }

  public static boolean isPrime(int n) {
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) return false;
    }
    return true;
  }

  public static int gcd(int a, int b) {
    // // Approach 1: Euclidean Algorithm O(log(min(a, b)))
    // if (b == 0) return a;
    // return gcd(b, a % b);

    // // Approach 2: Euclidean Algorithm O(log(min(a, b)))
    while(a > 0 && b > 0) {
      if (a > b) a = a % b;
      else b = b % a;
    }
    if (a == 0) return b;
    return a;
  }
  public static void main(String[] args) {
    System.out.println(countNumbers(100));
    System.out.println(reverse(-1009));
    System.out.println(isPalindrome(121));
    System.out.println(isArmstrong(153));
    printDivisors(100);
    System.out.println(isPrime(11));
    System.out.println(gcd(20, 160));
  }
}
