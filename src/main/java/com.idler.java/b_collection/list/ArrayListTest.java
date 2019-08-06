package com.idler.java.b_collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("I");
    list.add("am");
    list.add("god");


    String[] a = list.toArray(new String[0]);



    System.out.println(Arrays.toString(a));
    list.add("abls");
  }
}
