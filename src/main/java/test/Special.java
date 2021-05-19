package test;

public class Special {
  public static void main(String[] args) {
    //
    Integer x = 11;
    System.out.println(Integer.toBinaryString(x));
    System.out.println(Integer.toBinaryString(-x));
    System.out.println(x & -x);
    System.out.println(Integer.toBinaryString(x + (x & -x)));
  }
}
