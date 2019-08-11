package com.idler.java.e_thread_pool.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolTest {
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(5);

    Runner.run(executorService);

    executorService.shutdown();
  }
}
