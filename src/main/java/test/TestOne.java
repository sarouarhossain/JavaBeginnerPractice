package test;

import java.util.Scanner;

public class TestOne {
  public static void main(String[] args) {
      int a,b;
      Scanner scanner = new Scanner(System.in);

      System.out.print("Intput A: ");
      a = scanner.nextInt(); // 3

      System.out.print("Input B: ");
      b = scanner.nextInt(); // 5

      int result;

      result = a+b; // 8
      System.out.println("A + B = "+result);

      result = a-b; // -2
      System.out.println("A - B = "+result);

      result = a*b; // 15
      System.out.println("A * B = "+result);
      //System.out.println("A * B = "+(a*b));

      result = a/b;
      System.out.println("A / B = "+result);

      result = a%b;
      System.out.println("A % B = "+result);
  }
}
