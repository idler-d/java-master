package com.idler.java.b_collection.hashmap;

import java.util.LinkedHashMap;

public class LinkHashMapT {
  public static void main(String[] args) {
    LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

    linkedHashMap.put("234","456");
    linkedHashMap.put("123","456");
    linkedHashMap.put("345","456");

    linkedHashMap.keySet();

    linkedHashMap.put("456","456");

    linkedHashMap.keySet();

    linkedHashMap.put("567","456");
    linkedHashMap.put("678","456");
    linkedHashMap.put("789","456");
    linkedHashMap.put("987","456");
    linkedHashMap.put("876","456");
    linkedHashMap.put("765","456");
    linkedHashMap.put("654","456");
    linkedHashMap.put("543","456");

    System.out.println(linkedHashMap);
  }
}
