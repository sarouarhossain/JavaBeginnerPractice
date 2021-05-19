package test;

public class Test {
  public static void main(String[] args) {
    //
    int x = 5;
    int y = 6;
    int z = 4;
    int s = --x + y++ + ++x + --y + z++ + --z;

    System.out.println(s); // 29
    System.out.println(x); // 5
    System.out.println(y); // 6
    System.out.println(z); // 4
  }
}
