package com.idler.java.a_inheir.d;

class C extends B {

  static {
    System.out.println("Static init C.");
  }

  {
    System.out.println("Instance init C.");
  }

  C() {
    System.out.println("Constructor C.");
  }
}