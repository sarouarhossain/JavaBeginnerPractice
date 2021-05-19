package test;

import java.util.Scanner;

public class TestArray {
  public static void main(String[] args) {
    //
    int[] nums = new int[6];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < nums.length; i++) {
      nums[i] = sc.nextInt();
    }
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum = sum + nums[i];
    }
    System.out.println("Sum: " + sum);
  }
}
