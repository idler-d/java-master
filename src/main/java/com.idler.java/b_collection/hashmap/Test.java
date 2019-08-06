package com.idler.java.b_collection.hashmap;

import java.util.*;

public class Test {
  static int hashMapW = 0;
  static int hashMapR = 0;
  static int linkMapW = 0;
  static int linkMapR = 0;
  static int treeMapW = 0;
  static int treeMapR = 0;
  static int hashTableW = 0;
  static int hashTableR = 0;

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      Test test = new Test();
      test.test(100 * 10000);
      System.out.println();
    }
    System.out.println("hashMapW = " + hashMapW / 10);
    System.out.println("hashMapR = " + hashMapR / 10);
    System.out.println("linkMapW = " + linkMapW / 10);
    System.out.println("linkMapR = " + linkMapR / 10);
    System.out.println("treeMapW = " + treeMapW / 10);
    System.out.println("treeMapR = " + treeMapR / 10);
    System.out.println("hashTableW = " + hashTableW / 10);
    System.out.println("hashTableR = " + hashTableR / 10);
  }

  public void test(int size) {
    int index;
    Random random = new Random();
    Map<String, String> map;
    long start, end, insertTime, readTime;
    String[] key = new String[size];
    String[] value = new String[size];
    start = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {

      key[i] = UUID.randomUUID().toString();
      value[i] = UUID.randomUUID().toString();
    }
    end = System.currentTimeMillis();
    System.out.println("key、value耗时 = " + (end - start) + " ms");





    // TreeMap 插入
    map = new TreeMap<>();
    insertTime = insert(map, key, value);
    System.out.println("TreeMap插入耗时 = " + insertTime + " ms");
    treeMapW += insertTime;
    // TreeMap 读取
    readTime = read(map, key);
    treeMapR += readTime;
    System.out.println("TreeMap读取耗时 = " + readTime + " ms");

    // LinkedHashMap 插入
    map = new LinkedHashMap<>();
    insertTime = insert(map, key, value);
    linkMapW += insertTime;
    System.out.println("LinkedHashMap插入耗时 = " + insertTime + " ms");
    // LinkedHashMap 读取
    readTime = read(map, key);
    linkMapR += readTime;
    System.out.println("LinkedHashMap读取耗时 = " + readTime + " ms");

    // HashMap 插入
    map = new HashMap<>();
    insertTime = insert(map, key, value);
    hashMapW += insertTime;
    System.out.println("HashMap插入耗时 = " + insertTime + " ms");
    // HashMap 读取
    readTime = read(map, key);
    hashMapR += readTime;
    System.out.println("HashMap读取耗时 = " + readTime + " ms");

    // Hashtable 插入
    map = new Hashtable<>();
    insertTime = insert(map, key, value);
    hashTableW += insertTime;
    System.out.println("Hashtable插入耗时 = " + insertTime + " ms");
    // Hashtable 读取
    readTime = read(map, key);
    hashTableR += readTime;
    System.out.println("Hashtable读取耗时 = " + readTime + " ms");
  }

  private long insert(Map<String, String> map, String[] keys, String[] value) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < keys.length; i++) {
      //      key[i] = UUID.randomUUID().toString();
      //      map.put(key[i], UUID.randomUUID().toString());
      map.put(keys[i], value[i]);
    }
    long end = System.currentTimeMillis();
    return end - start;
  }

  private long read(Map<String, String> map, String[] keys) {
    Random random = new Random();
    int size = map.size();
//    System.out.println("map size: " + size);
    long start = System.currentTimeMillis();

    for (int i = 0; i < size; i++) {
      map.get(keys[random.nextInt(size)]);
//      map.get(keys[i]);
    }
    long end = System.currentTimeMillis();
    return end - start;
  }
}