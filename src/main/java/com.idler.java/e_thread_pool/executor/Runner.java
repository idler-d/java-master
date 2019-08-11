package com.idler.java.e_thread_pool.executor;

import java.util.concurrent.ExecutorService;

public class Runner {
  public static void run(ExecutorService executorService) {
    for (int i = 0; i < 20; i++) {
      executorService.submit(new Task("" + i));
    }
  }
}
