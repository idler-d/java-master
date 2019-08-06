package com.idler.java.b_collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetT {
  public static void main(String[] args) {
    TreeSet<Integer> nums = new TreeSet<Integer>();

    nums.add(3);
    nums.add(1);
    nums.add(5);
    nums.add(-9);
    //1.返回第一个元素
    Integer first = nums.first();
    //打印结果为-9
    System.out.println(first);
    //2.返回最后一个元素
    Integer last = nums.last();
    //打印结果为5
    System.out.println(last);
    //3.返回上一个
    Integer lower = nums.lower(2);
    //打印结果为1
    System.out.println(lower);
    //4.返回下一个
    Integer higher = nums.higher(2);
    //打印结果为3
    System.out.println(higher);
    //5.返回小于3的子集，不包含3
    SortedSet<Integer> headSet = nums.headSet(3);
    //打印结果[-9, 1]
    System.out.println(headSet);
    //6.返回大于等于3的子集，包含3
    SortedSet<Integer> tailSet = nums.tailSet(3);
    //打印结果[3, 5]
    System.out.println(tailSet);
    //7.打印整个集合结果为[-9, 1, 3, 5]
    System.out.println(nums);
  }
}
