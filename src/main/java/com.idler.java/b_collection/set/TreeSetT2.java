package com.idler.java.b_collection.set;

import java.util.TreeSet;

public class TreeSetT2 {

  public static void main(String[] args) {
    TreeSet<String> nums = new TreeSet<>();

    nums.add("bcd");
    nums.add("abd");
    nums.add("abc");
    System.out.println(nums.add("abc"));
    System.out.println(nums);

  }
}
