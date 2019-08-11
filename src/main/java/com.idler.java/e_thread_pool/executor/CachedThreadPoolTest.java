package com.idler.java.e_thread_pool.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolTest {

  public static void main(String[] args) {
    ExecutorService executorService = Executors.newCachedThreadPool();

    Runner.run(executorService);
  }
}
