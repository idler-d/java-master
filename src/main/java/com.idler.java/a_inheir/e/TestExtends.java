package com.idler.java.a_inheir.e;

public class TestExtends {

  public static void main(String[] args) {
    Father f = new Son();
    Son s = new Son();
    f.FMethod();
    s.FMethod();
    System.out.println(Son.a);
  }
}
