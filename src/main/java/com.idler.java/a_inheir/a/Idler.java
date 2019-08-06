package com.idler.java.a_inheir.a;

public class Idler extends Base {

  private String name = "Idler";

  public Idler() {
    tellName();
    printName();
  }

  public void tellName() {
    System.out.println("Idler tell name: " + name);
  }

  public void printName() {
    System.out.println("Idler print name: " + name);
  }

  public static void main(String[] args) {
    new Idler();
  }
}