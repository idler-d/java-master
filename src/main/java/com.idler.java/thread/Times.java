package com.idler.java.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Times {

  public static String format(Long date) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    return sdf.format(new Date(date));
  }


  public static String format(Date date) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    return sdf.format(date);
  }
}
