package com.idler.java.inheir.d;

class B extends A {
  static {
    System.out.println("Static init B.");
  }

  {
    System.out.println("Instance init B.");
  }

  B() {
    System.out.println("Constructor B.");
  }
}