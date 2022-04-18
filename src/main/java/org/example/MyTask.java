package org.example;

public class MyTask implements Runnable{
    @Override
    public void run() {
    System.out.println("Thread name"+Thread.currentThread().getName());
    System.out.println("start task");

    System.out.println("stop task");
    }
}
