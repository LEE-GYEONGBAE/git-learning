package com.ohgiraffers;

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

class ExtendThread extends Thread {
    private GetNumber num;
    ExtendThread(GetNumber num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try{
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            num.add(Thread.currentThread().getName());
        }
    }
}

class ImplRunnerble implements Runnable {
    private GetNumber num;

    ImplRunnerble(GetNumber num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            num.add(Thread.currentThread().getName());
        }
    }
}

class GetNumber {
    private int number = 0;

    public synchronized void add(String name) {
        this.number++;
        System.out.println(name + " result = " + number);
    }
}