package test;

import java.util.Arrays;

public class NumArray {
  public static void main(String[] args) {
    //
    // int[] nums = {5, 2, 9, -3, 5, 20, 10, -7, 2, 3, -4, 0, -2, 15, 5};
    int[] nums = {7, 2, 7, 2, 0};
    NumArray numArray = new NumArray(nums);
    System.out.println(Arrays.toString(nums));
    System.out.println("Tree: " + Arrays.toString(numArray.tree));
    numArray.update(4, 6);
    System.out.println("After Update 4,6 :" + Arrays.toString(nums));
    System.out.println("Tree: " + Arrays.toString(numArray.tree));
    numArray.update(0, 2);
    System.out.println("After Update 0,2 :" + Arrays.toString(nums));
    System.out.println("Tree: " + Arrays.toString(numArray.tree));
    numArray.update(0, 9);
    System.out.println("After Update 0,9 :" + Arrays.toString(nums));
    System.out.println("Tree: " + Arrays.toString(numArray.tree));

    System.out.println(numArray.sumRange(4, 4));

    numArray.update(3, 8);
    System.out.println("After Update 3,8 :" + Arrays.toString(nums));
    System.out.println("Tree: " + Arrays.toString(numArray.tree));

    System.out.println(numArray.sumRange(0, 4));

    numArray.update(4, 1);
    System.out.println("After Update 4,1 :" + Arrays.toString(nums));
    System.out.println("Tree: " + Arrays.toString(numArray.tree));

    System.out.println(numArray.sumRange(0, 3));
    System.out.println(numArray.sumRange(0, 4));

    numArray.update(0, 4);
    System.out.println("After Update 0,4 :" + Arrays.toString(nums));
    System.out.println("Tree: " + Arrays.toString(numArray.tree));
  }

  int[] tree;
  int[] nums;

  public NumArray(int[] nums) {
    this.nums = nums;
    tree = new int[nums.length + 2];
    // System.out.println(Arrays.toString(tree));
    for (int i = 0; i < nums.length; i++) updateTree(tree, nums[i], i);
  }

  public void updateTree(int[] tree, int value, int index) {
    index = index + 1;
    while (index <= tree.length) {
      // System.out.println(index);
      tree[index] += value;
      index += index & (-index);
    }
    //    System.out.println(Arrays.toString(tree));
  }

  public void update(int index, int val) {
    var x = val - nums[index];
    nums[index] = val;
    updateTree(tree, x, index);
  }

  public int sumRange(int left, int right) {
    var x = sum(right + 1) - sum(left);
    // System.out.println(x);
    return x;
  }

  public int sum(int index) {
    int sum = 0;
    while (index >= 1) {
      sum += tree[index];
      index -= index & (-index);
    }
    return sum;
  }
}
