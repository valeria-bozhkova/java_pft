package ru.stqa.pft.sandbox;

/**
 * Created by user on 3/31/2017.
 */
public class Equality {
  public static void main(String[] args) {
    String s1 = "firefox 2.0";
    String s2 = "firefox " + Math.sqrt(4.0);

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
  }

}
