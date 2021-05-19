package test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class TestFour {
  public static void main(String[] args) {
    //
    String st = "2021-04-08T19:25:00Z";
    DateTimeFormatter formatter = DateTimeFormatter.ISO_INSTANT;
    OffsetDateTime dateTime = OffsetDateTime.parse(st, formatter);
    System.out.println(dateTime);
  }
}
