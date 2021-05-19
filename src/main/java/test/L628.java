package test;

import java.util.Arrays;

public class L628 {
  public static void main(String[] args) {
    //
    int[] arr = {-1, -2, -4, -3, 0, 1, 2, 4};
    // {-3,-2,-1,0,1,2,4} -> O(nlogn)
    // -3, -2, 4 = 24 // min1, min2 -> O(n)
    // 4,2,1 = 8 // max1, max2, max3
    var res = maximumProduct(arr);
    System.out.println(res);
  }

  public static int maximumProduct(int[] nums) {
    int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

    int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
    for (int n : nums) {
      if (n <= min1) {
        min2 = min1; // -2
        min1 = n; // -4
      } else if (n <= min2) {
        min2 = n;
      }

      // max
      if (n >= max1) {
        max3 = max2;
        max2 = max1;
        max1 = n; // 4
      } else if (n >= max2) {
        max3 = max2;
        max2 = n;
      } else if (n >= max3) {
        max3 = n;
      }
    }

    var poss1 = min1 * min2 * max1;
    var poss2 = max1 * max2 * max3;
    return Math.max(poss1, poss2);
  }
}
