package com.idler.java.collection.set;

import java.util.EnumSet;

public class EnumSetT {
  public static void main(String[] args) {
    EnumSet<Season> es = EnumSet.allOf(Season.class);

    System.out.println("es: "  + es);

    EnumSet<Season> es2 = EnumSet.noneOf(Season.class);

    System.out.println("es2: "  + es2);

    es2.add(Season.AUTUMN);
    es2.add(Season.WINTER);
    System.out.println("es2: "  + es2);

    EnumSet<Season> es3 = EnumSet.of(Season.SPRING, Season.SUMMER);
    System.out.println("es3: "  + es3);

    EnumSet<Season> es4 = EnumSet.range(Season.SPRING, Season.AUTUMN);
    System.out.println("es4: "  + es4);

    EnumSet<Season> es5 = EnumSet.complementOf(es4);
    System.out.println("es5: "  + es5);
  }

  enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
  }
}
