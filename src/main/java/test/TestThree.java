package test;

public class TestThree {
  public static void main(String[] args) {
    //
    int i;
    for (i = 1; i <= 10; i = i + 1) {
      System.out.println(i);
    }

    System.out.println("Finished loop... and latest value of i = " + i);

    int j = 1;
    while (j <= 10) {
      System.out.println(j);
      j = j + 1;
    }

    System.out.println("Finished While loop.. latest value of j = " + j);

    int k = 1;
    do {
      System.out.println(k);
      k = k + 1;
    } while (k <= 10);

    System.out.println("Finished loop.. Latest value of k = " + k);

    int x = 12;
    while (x <= 10) {
      System.out.println(x);
      x = x + 1;
    }

    int y = 12;
    do {
      System.out.println(y);
      y = y + 1;
    } while (y <= 10);
  }
}
