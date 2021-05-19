package array;

public class LogicalOp {
  public static void main(String[] args) {
    //
    boolean var1 = false;
    boolean var2 = true;

    boolean res = !((var1 && var2) || var1);
    System.out.println("Result var1 && var2: " + res);

    if (!(var1 && var2) || var1) {
      System.out.println("Hello");
    }
  }
}
