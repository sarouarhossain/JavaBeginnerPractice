package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class MaxProductSubarray {
  public static void main(String[] args) {
    //
    int[] a = {2, 3, -2, 4};
    System.out.println(maxProduct1(a));
  }

  public int maximumProduct(int[] nums) {
    Arrays.sort(nums);
    int l = nums.length;
    int possibilityOne = nums[l - 1] * nums[l - 2] * nums[l - 3];
    int possibilityTwo = nums[0] * nums[1] * nums[l - 1];
    return Math.max(possibilityOne, possibilityTwo);
  }

  public static int maxProduct1(int[] nums) {
    int prod = 1, max = Integer.MIN_VALUE;
    for (int num : nums) {
      prod *= num;
      if (prod > max) max = prod;
      if (prod == 0) prod = 1;
    }

    prod = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      prod *= nums[i];
      if (prod > max) max = prod;
      if (prod == 0) prod = 1;
    }

    return max;
  }

  public static int maxProduct(int[] nums) {
    int p_max = nums[0], p_min = nums[0], ans = nums[0];

    for (int i = 1; i < nums.length; i++) {
      var c_max =
          Stream.of(p_max * nums[i], p_min * nums[i], nums[i]).max(Integer::compareTo).get();
      var c_min =
          Stream.of(p_max * nums[i], p_min * nums[i], nums[i]).min(Integer::compareTo).get();
      ans = Math.max(c_max, ans);
      // System.out.println(c_max + " " + c_min + " " + ans);
      p_max = c_max;
      p_min = c_min;
    }

    return ans;
  }
}
