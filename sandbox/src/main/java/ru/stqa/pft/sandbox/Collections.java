package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 4/7/2017.
 */
public class Collections {

  public static void main (String[] args){
    String[] langs = {"Java", "C#", "Python", "PHP"};

   /* List<String> languages = new ArrayList<String>();
    languages.add("Java");
    languages.add("C#");
    languages.add("Python");
    languages.add("PHP");*/

   List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP");

    for (int i = 0; i < languages.size(); i++) { //String l:languages
      System.out.println("Я хочу выучить " + languages.get(i));
    }

  }
}
