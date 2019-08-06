package com.idler.java.a_inheir.b;

public class ClassB extends ClassA {
  int count = 20;


  public void display() {
    System.out.println(this.count);
  }


  public static void main(String[] args) {
    ClassA a = new ClassB();
    ClassB b = new ClassB();
    System.out.println("a.count: " + a.count);
    System.out.println("b.count: " + b.count);
    a.display();
    b.display();

  }

}