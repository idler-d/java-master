package com.idler.java.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetT {
  public static void main(String[] args) {
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

    linkedHashSet.add("语文");
    linkedHashSet.add("数学");
    linkedHashSet.add("英语");

//    linkedHashSet.remove("语文");
    //重新添加
    System.out.println(linkedHashSet.add("语文"));
    //打印结果为[数学, 英语, 语文]
    System.out.println(linkedHashSet);
  }
}
