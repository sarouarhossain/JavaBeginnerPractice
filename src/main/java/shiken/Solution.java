package shiken;

import java.util.Arrays;

public class Solution {
  public static void main(String[] args) {
    //
    int[] arr = {1, 3, 4, 5, 6, 7, 8};
    int[] res = Arrays.copyOfRange(arr, 2, 9);
    System.out.println(Arrays.toString(res));
    // System.out.println(solution(1, 1, 7));
  }

  public static String solution(int A, int B, int C) {
    // write your code in Java SE 8
    int currentA = 0, currentB = 0, currentC = 0;
    int totalLength = A + B + C;

    StringBuilder sb = new StringBuilder();

    int i = 0;
    while (i < totalLength) {
      if ((A >= B && A >= C && currentA != 2) || (A > 0 && (currentB == 2 || currentC == 2))) {
        sb.append("a");
        currentA++;
        currentB = 0;
        currentC = 0;
        A--;
      } else if ((B >= A && B >= C && currentB != 2)
          || (B > 0 && (currentA == 2 || currentC == 2))) {
        sb.append("b");
        currentB++;
        currentA = 0;
        currentC = 0;
        B--;
      } else if ((C >= B && C >= A && currentC != 2)
          || (C > 0 && (currentA == 2 || currentB == 2))) {
        sb.append("c");
        currentC++;
        currentA = 0;
        currentB = 0;
        C--;
      }
      i++;
    }
    return sb.toString();
  }
}
