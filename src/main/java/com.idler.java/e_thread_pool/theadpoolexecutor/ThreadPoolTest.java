package com.idler.java.e_thread_pool.theadpoolexecutor;

public class ThreadPoolTest implements Runnable {
  @Override
  public void run() {
    try {
      System.out.println(Thread.currentThread().getName());
      Thread.sleep(300);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }


}