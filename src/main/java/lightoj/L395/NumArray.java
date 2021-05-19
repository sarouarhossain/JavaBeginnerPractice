package lightoj.L395;

import java.util.ArrayList;
import java.util.List;

public class NumArray {
  int[] nums;

  public NumArray(int[] nums) {
    this.nums = nums;
  }

  public int sumRange(int left, int right) {
    int sum = 0;
    for (int i = left; i <= right; i++) {
      sum = sum + nums[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    //
    List<Integer> integers = new ArrayList<>();

    int[] nums = {-2, 0, 3, -5, 2, -1};
    NumArray numArray = new NumArray(nums);
    // [0, 2], [2, 5], [0, 5]
    System.out.println(numArray.sumRange(0, 2));
    System.out.println(numArray.sumRange(2, 5));
    System.out.println(numArray.sumRange(0, 5));
    // System.out.println(numArray.sumRange(0, 2));
  }
}
