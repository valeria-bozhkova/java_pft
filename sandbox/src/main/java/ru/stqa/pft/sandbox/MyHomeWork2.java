package ru.stqa.pft.sandbox;

/**
 * Created by user on 3/15/2017.
 */
public class MyHomeWork2 {

  public static void main(String[] args) {

    Point p1 = new Point(2,3);
    Point p2 = new Point(-3,0);

    System.out.println("Расстояние между точкой А(" + p1.x + "; " + p1.y + ") " +
            "и точкой В(" + p1.x + "; " + p1.y + ") = " + p1.distance(p2));

  }

  /* Функция до преобразования в метод
  public static double distance(Point p1, Point p2) {

    return Math.round(Math.sqrt(Math.pow((p2.x - p1.x),2) + Math.pow((p2.y - p1.y),2)));
  }*/
}
