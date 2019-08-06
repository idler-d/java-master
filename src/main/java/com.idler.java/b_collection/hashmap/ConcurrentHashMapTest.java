package com.idler.java.b_collection.hashmap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
  public static void main(String[] args) {
    //ConcurrentHashMap key和value都不能为null
    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
    concurrentHashMap.put("111", "");

//    Map<String, String> map = new HashMap<>();
//    map.put(null,null);

  }
}
