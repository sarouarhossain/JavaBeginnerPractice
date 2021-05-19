package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test3 {
  public static void main(String[] args) {

    //

    File file = new File("/home/sarouarhossain/Desktop/facebook.txt");
    var count = 0;
    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
      String line;

      while ((line = br.readLine()) != null) {
        // process the line.
        if (line.contains("buddy_id")) {
          String[] list = line.split(",");
          for (String s : list) {
            //
            if (s.contains("buddy_id")) {
              count++;
              System.out.println(s);
            }
          }
          // System.out.println(line);
          System.out.println();
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("Count: " + count);
  }
}
