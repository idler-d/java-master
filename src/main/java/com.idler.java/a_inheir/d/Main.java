package com.idler.java.a_inheir.d;

public class Main {

  static {
    System.out.println("Static init Main.");
  }

  {
    System.out.println("Instance init Main.");
  }

  public Main() {
    System.out.println("Constructor Main.");
  }

  public static void main(String[] args) {
    C c = new C();
    C c1 = new C();
//    B b = new B();
  }
}