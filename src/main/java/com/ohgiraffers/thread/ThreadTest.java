package com.ohgiraffers.thread;

public class ThreadTest {
    public static void main(String[] args) {
        GetNumber num = new GetNumber();
        ExtendThread thread1 = new ExtendThread(num);
        thread1.setName("Thread");
        Thread thread2 = new Thread(new ImplRunnerble(num), "Runnerble");

        thread1.start();
        thread2.start();
    }
}

