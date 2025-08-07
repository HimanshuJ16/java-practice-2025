import java.util.*;

public class Patterns {
  public static void pattern1(int n) {
    // Example:
    // *****
    // *****
    // *****
    // *****
    // *****
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void pattern2(int n) {
    // Example:
    // *
    // **
    // ***
    // ****
    // *****
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void pattern3(int n) {
    // Example:
    // 1
    // 12
    // 123
    // 1234
    // 12345
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void pattern4(int n) {
    // Example:
    // 1
    // 22
    // 333
    // 4444
    // 55555
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public static void pattern5(int n) {
    // Example:
    // *****
    // ****
    // ***
    // **
    // *
    for (int i = n; i >= 1; i--) {
      for (int j = i; j >= 1; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void pattern6(int n) {
    // Example:
    // 12345
    // 1234
    // 123
    // 12
    // 1
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n-i+1; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void pattern7(int n) {
    // Example:
    //     *
    //    ***
    //   *****
    //  *******
    // *********
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n-i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= 2*i-1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void pattern8(int n) {
    // Example:
    // *********
    //  *******
    //   *****
    //    ***
    //     *
    for (int i = n; i >= 1; i--) {
      for (int j = n-i; j >= 1; j--) {
        System.out.print(" ");
      }
      for (int k = 2*i-1; k >= 1; k--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void pattern9(int n) {
    // Example:
    //     *
    //    ***
    //   *****
    //  *******
    // *********    
    // *********
    //  *******
    //   *****
    //    ***
    //     *
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n-i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= 2*i-1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = n; i >= 1; i--) {
      for (int j = n-i; j >= 1; j--) {
        System.out.print(" ");
      }
      for (int k = 2*i-1; k >= 1; k--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void pattern10(int n) {
    // Example:
    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *
    for (int i = 1; i <= 2*n-1; i++) {
      int stars = i;
      if (i > n) {
        stars = 2*n-i;
      }
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void pattern11(int n) {
    // Example:
    // 1
    // 01
    // 101
    // 0101
    // 10101
    for (int i = 1; i <= n; i++) {
      int start;
      if (i % 2 == 0) {
        start = 0;
      } else {
        start = 1;
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(start);
        start = 1 - start;
      }
      System.out.println();
    }
  }

  public static void pattern12(int n) {
    // Example:
    // 1        1
    // 12      21
    // 123    321
    // 1234  4321
    // 1234554321
    
    int space = 2*(n-1);
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
    
      for (int j = 1; j <= space; j++) {
        System.out.print(" ");
      }

      for (int j = i; j >= 1; j--) {
        System.out.print(j);
      }
      System.out.println();
      space -= 2;
    }
  }

  public static void pattern13(int n) {
    // Example:
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
    
    int number = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(number + " ");
        number++;
      }
      System.out.println();
    }
  }

  public static void pattern14(int n) {
    // Example:
    // A
    // AB
    // ABC
    // ABCD
    // ABCDE
    
    for (int i = 1; i <= n; i++) {
      for (char alphabet = 'A'; alphabet <= 'A'+i-1; alphabet++) {
        System.out.print(alphabet);
      }
      System.out.println();
    }
  }

  public static void pattern15(int n) {
    // Example:
    // ABCDE
    // ABCD
    // ABC
    // AB
    // A
    
    for (int i = n; i >= 1; i--) {
      for (char alphabet = 'A'; alphabet <= 'A'+i-1; alphabet++) {
        System.out.print(alphabet);
      }
      System.out.println();
    }
  }

  public static void pattern16(int n) {
    // Example:
    // A
    // BB
    // CCC
    // DDDD
    // EEEEE
    
    char alphabet = 'A';
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(alphabet);
      }
      System.out.println();
      alphabet++;
    }
  }

  public static void pattern17(int n) {
    // Example:
    //     A    
    //    ABA   
    //   ABCBA  
    //  ABCDCBA 
    // ABCDEDCBA
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
          System.out.print(" ");
      }

      char ch = 'A';
      int breakpoint = i;
      for (int j = 1; j <= 2 * i - 1; j++) {
          System.out.print(ch);
          if (j < breakpoint) ch++;
          else ch--;
      }
      System.out.println();
    }
  }

  public static void pattern18(int n) {
    // Example:
    // E
    // D E
    // C D E
    // B C D E
    // A B C D E
    
    for (int i = 1; i <= n; i++) {
      for (char ch = (char)(int)('E' - i + 1); ch <= 'E'; ch++) {        
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }

  public static void pattern19(int n) {
    // Example:
    // **********
    // ****  ****
    // ***    ***
    // **      **
    // *        *
    // *        *
    // **      **
    // ***    ***
    // ****  ****
    // **********
    
    int space = 0;
    for (int i = n; i >= 1; i--) {
      for (int j = i; j >= 1; j--) {
        System.out.print("*");
      }
    
      for (int j = space; j >= 1; j--) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
      space += 2;
    }
    int space1 = 2*(n-1);
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
    
      for (int j = 1; j <= space1; j++) {
        System.out.print(" ");
      }

      for (int j = i; j >= 1; j--) {
        System.out.print("*");
      }
      System.out.println();
      space1 -= 2;
    }
  }

  public static void pattern20(int n) {
    // Example:
    // *        *
    // **      **
    // ***    ***
    // ****  ****
    // **********
    // ****  ****
    // ***    ***
    // **      **
    // *        *

    for (int i = 1; i <= 2*n-1; i++) {
      int stars = i;
      if (i > n) {
        stars = 2*n-i;
      }
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }

      for (int j = 1; j <= 2*(n-stars); j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void pattern21(int n) {
    // Example:
    // *****
    // *   *
    // *   *
    // *   *
    // *****

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i == 1 || i == n || j == 1 || j == n) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void pattern22(int n) {
    // Example:
    // 5 5 5 5 5 5 5 5 5
    // 5 4 4 4 4 4 4 4 5
    // 5 4 3 3 3 3 3 4 5
    // 5 4 3 2 2 2 3 4 5
    // 5 4 3 2 1 2 3 4 5
    // 5 4 3 2 2 2 3 4 5
    // 5 4 3 3 3 3 3 4 5
    // 5 4 4 4 4 4 4 4 5
    // 5 5 5 5 5 5 5 5 5

    for (int i = 0; i < 2 * n - 1; i++) {
      for (int j = 0; j < 2 * n - 1; j++) {
        int top = i;
        int bottom = j;
        int right = (2 * n - 2) - j;
        int left = (2 * n - 2) - i;
        System.out.print(n - Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    pattern1(5);
    pattern2(5);
    pattern3(5);
    pattern4(5);
    pattern5(5);
    pattern6(5);
    pattern7(5);
    pattern8(5);
    pattern9(5);
    pattern10(5);
    pattern11(5);
    pattern12(5);
    pattern13(5);
    pattern14(5);
    pattern15(5);
    pattern16(5);
    pattern17(5);
    pattern18(5);
    pattern19(5);
    pattern20(5);
    pattern21(5);
    pattern22(5);
  }
}
