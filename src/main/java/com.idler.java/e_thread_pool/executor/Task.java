package com.idler.java.e_thread_pool.executor;

public class Task extends Thread{
  public Task(String name) {
    super(name);
  }
  @Override
  public void run() {
    try {
      sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Thread" + getName() + "：running");
  }
}
