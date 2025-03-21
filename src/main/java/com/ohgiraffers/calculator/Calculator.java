package com.ohgiraffers.calculator;

public interface Calculator {

    @FunctionalInterface
    public interface Plus {
        public int plus(int a, int b);
    }

    @FunctionalInterface
    public interface Minus {
        public int minus(int a, int b);
    }

    @FunctionalInterface
    public interface Multiply {
        public int multiply(int a, int b);
    }

    @FunctionalInterface
    public interface Divide {
        public int divide(int a, int b);
    }
}
