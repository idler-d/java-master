package com.idler.java.thread.threadDead;

public class ThreadTest {

  public static void main(String[] args) {

    MyRunnable myRunnable = new MyRunnable();
    Thread thread = new Thread(myRunnable);

    for (int i = 0; i < 100; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);
      if (i == 30) {
        thread.start();
      }
      if (i == 40) {
//        myRunnable.stopThread();
        thread.interrupt();
      }
    }
  }
}

