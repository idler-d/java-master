package com.idler.java.d_thread.ThreadSynchronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutor {

  static Thread thread1 = new Thread(() -> System.out.println("Thread1"));
  static Thread thread2 = new Thread(() -> System.out.println("Thread2"));
  static Thread thread3 = new Thread(() -> System.out.println("Thread3"));

  public static void main(String[] args) {
    ExecutorService executorService = Executors.newSingleThreadExecutor();

    executorService.execute(thread1);
    executorService.execute(thread2);
    executorService.execute(thread3);

    executorService.shutdown();
  }
}
