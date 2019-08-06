package com.idler.java.a_inheir.a;

class Base {

  private String name = "base";
  private int age = 30;

  public Base() {
    this.name = "base change";
    this.tellName();
    printName();
  }

  public void tellName() {
    System.out.println("Base tell name: " + this.name);
  }

  public void printName() {
    System.out.println("Base print name: " + this.name);
  }
}