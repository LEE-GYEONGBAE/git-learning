package com.ohgiraffers.thread;

public class ImplRunnerble implements Runnable {
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
