package test;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestTwo {
  public static void main(String[] args) {
    // variable declaration
    // variable_type variable_name
    int a;
    a = 5; // initialize, value assign, = assignment operator
    System.out.println(a);

    // variable declaration
    int x;

    // create object of scanner
    //    Scanner sc = new Scanner(System.in);
    //
    //    System.out.println("Enter the value of x: ");
    //    x = sc.nextInt();

    // System.out.println(x);

    IntStream.range(1, 10).forEach(System.out::println);
  }
}
