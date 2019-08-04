package com.idler.java.collection.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {
    String s1 = "Ma1";
    String s2 = "NB";
//
//    System.out.println(s1.hashCode());
//
//    System.out.println(s2.hashCode());

    HashMap<Key, String> hashMap = new HashMap<>();

    Key keyA = new Key(s1);

    Key keyB = new Key("NB");

//    System.out.println(toFullBinaryString(1 << 30));
//
//    System.out.println(Integer.MAX_VALUE);
    hashMap.put(keyA, "a");

    hashMap.put(keyB, "b");

    hashMap.get(keyA);
//    System.out.println(hashMap);
//
//    int h;
//    h = keyA.hashCode();

//    System.out.println("h:" + h);
//    System.out.println("h >>> 16:" + (h >>> 16));
//    System.out.println((keyA == null) ? 0 : (h = keyA.hashCode()) ^ (h >>> 16));
//    System.out.println(h >>> 16);
//    HashMap<String, String> hashMap = new HashMap<>();
//
//    hashMap.put(s1, "a");
//
//    hashMap.put(s2, "b");
//
//    System.out.println(hashMap);
  }

  private static String toFullBinaryString(int x) {
    int[] buffer = new int[Integer.SIZE];
    for (int i = (Integer.SIZE - 1); i >= 0; i--) {
      buffer[i] = x >> i & 1;
    }
    String s = "";
    for (int j = (Integer.SIZE - 1); j >= 0; j--) {
      s = s + buffer[j];
    }
    return s;
  }
}
