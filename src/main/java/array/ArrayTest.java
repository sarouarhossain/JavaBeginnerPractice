package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
  public static void main(String[] args) {
    //
    Scanner scanner = new Scanner(System.in);
    int[] nums;
    int inputSize;
    System.out.println("Input size: ");
    inputSize = scanner.nextInt();

    nums = new int[inputSize];

    for (int i = 0; i < inputSize; i++) {
      nums[i] = scanner.nextInt();
    }

    System.out.println(Arrays.toString(nums));

    int sum = 0;
    for (int i = 0; i < inputSize; i++) {
      sum = sum + nums[i]; //
    }
  }
}
