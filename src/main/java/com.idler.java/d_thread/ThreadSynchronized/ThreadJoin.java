package com.idler.java.d_thread.ThreadSynchronized;

public class ThreadJoin {

  static Thread thread1 = new Thread(() -> System.out.println("Thread1"));
  static Thread thread2 = new Thread(() -> System.out.println("Thread2"));
  static Thread thread3 = new Thread(() -> System.out.println("Thread3"));

  public static void main(String[] args) throws InterruptedException {
    thread1.start();
    thread1.join();
    thread2.start();
    thread2.join();
    thread3.start();
  }
}
