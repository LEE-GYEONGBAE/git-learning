package com.ohgiraffers.thread;

public class GetNumber {
    private int number = 0;

    public synchronized void add(String name) {
        this.number++;
        System.out.println(name + " result = " + number);
    }
}
