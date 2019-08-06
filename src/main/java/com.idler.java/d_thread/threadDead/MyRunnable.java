package com.idler.java.d_thread.threadDead;

class MyRunnable implements Runnable {

  private boolean stop;

  @Override
  public void run() {
    for (int i = 0; i < 100 && !stop; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);

//      try {
//        Thread.sleep(100);
//      } catch (InterruptedException e) {
//        throw new MyException("InterruptedException");
//      }
    }
    if (stop) {
      throw new MyException("stop is true");
    }
  }

  public void stopThread() {
    this.stop = true;
  }

}