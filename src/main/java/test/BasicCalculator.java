package test;

import java.util.Stack;

public class BasicCalculator {
  public static void main(String[] args) {
    //
    String str = " 3+5 / 2 ";
    System.out.println(calculate(str));
  }

  public static int calculate(String s) {
    char[] chars = s.replaceAll("\\s+", "").toCharArray();
    StringBuilder num = new StringBuilder();
    Stack<Integer> stack = new Stack<>();
    char prevOp = '+';
    for (int i = 0; i < chars.length; i++) {
      if (isOp(chars[i])) {
        var val = Integer.valueOf(num.toString());
        val = prevOp == '+' ? val : -val;
        if (isPlusMinus(chars[i])) {
          stack.push(val);
          num.delete(0, num.length());
          prevOp = chars[i];
        } else {
          var operation = chars[i];
          StringBuilder nextNum = new StringBuilder();
          i = i + 1;
          // System.out.println("In: " + i);
          while (i < chars.length && !isOp(chars[i])) {
            nextNum.append(chars[i]);
            i++;
          }
          i--;
          var val2 = Integer.valueOf(nextNum.toString());
          var res = 0;
          if (operation == '*') {
            res = val * val2;
          } else {
            res = val / val2;
          }
          // stack.push(res);
          // System.out.println(res);
          num = new StringBuilder(String.valueOf(res));
          prevOp = '+';
        }
      } else {
        num.append(chars[i]);
      }
      // System.out.println("i: " + i);
    }

    var val = Integer.valueOf(num.toString());
    val = prevOp == '+' ? val : -val;
    stack.push(val);

    Integer res = 0;
    for (Integer x : stack) {
      res += x;
    }
    // System.out.println("Stack: " + stack);
    return res;
  }

  public static boolean isNum(char ch) {
    return ch >= '0' && ch <= '9';
  }

  public static boolean isOp(char ch) {
    return ch == '+' || ch == '-' || ch == '/' || ch == '*';
  }

  public static boolean isPlusMinus(char ch) {
    return ch == '+' || ch == '-';
  }
}
