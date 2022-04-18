package org.example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
  static ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);

  public static void main(String[] args) {
    System.out.println("Threads");

    MyTask mayTask = new MyTask();
    scheduledExecutorService.scheduleAtFixedRate(mayTask, 1, 3, TimeUnit.SECONDS);

    // scheduledExecutorService.shutdown();
  } // main area
}
