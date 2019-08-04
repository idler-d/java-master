package com.idler.java.collection.set;

import java.util.HashSet;

public class HashSetT {
  public static void main(String[] args) {
    HashSet<String> hashSet = new HashSet<>();

    String as = "愚钝";


    String bs = "愚蠢";

    boolean b = hashSet.add(bs);
    boolean a = hashSet.add(as);

    boolean c = hashSet.add("愚蠢");


    boolean d = hashSet.add("愚笨");
    String ass = "愚钝";

    System.out.println(hashSet.contains(ass));

    //    System.out.println(a);
    //    System.out.println(b);
    //    System.out.println(c);
    System.out.println(hashSet);

    String s1 = "Ma";
    String s2 = "NB";

    System.out.println(hashSet.add(s1));
    System.out.println(hashSet.add(s2));

    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());

    System.out.println(hashSet);
  }
}
