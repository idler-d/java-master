package com.idler.java.b_collection.hashmap;

import java.util.Objects;

public class Key {

  private String key;

  public Key(String key) {
    this.key = key;
  }

  @Override
  public boolean equals(Object o) {
    System.out.println("equals function");
    return Objects.equals(this.key.hashCode(), o.hashCode());
//    if (this == o)
//      return true;
//    if (o == null || getClass() != o.getClass())
//      return false;
//    Key key1 = (Key) o;
//    return Objects.equals(key, key1.key);
  }

  @Override
  public int hashCode() {
    System.out.println("hashCode function:" + key.hashCode());
    return key.hashCode();
//    return Objects.hash(key);
  }
}
