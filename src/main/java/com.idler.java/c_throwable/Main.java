package com.idler.java.c_throwable;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws Exception {
    testException();
    testIOException();
    testMyException();
    testNullPointerException();
  }

  private static void testException() throws Exception {
    throw new Exception();
  }

  private static void testIOException() throws IOException {
    throw new IOException();
  }

  private static void testMyException() {
    throw new MyException("抛出异常");
  }

  private static void testNullPointerException() {
    throw new NullPointerException();
  }

}
