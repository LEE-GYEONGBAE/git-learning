package com.ohgiraffers.practice;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 정수의 합과 차를 구합니다.");
        System.out.printf("첫번째 정수: ");
        long num1 = Long.parseLong(sc.nextLine());
        System.out.printf("두번째 정수: ");
        long num2 = Long.parseLong(sc.nextLine());

        System.out.println("두 정수의 합: " + add(num1, num2));
        System.out.println("두 정수의 차: " + sub(num1, num2));
    }

    static long add(long a, long b) {
        return a + b;
    }

    static long sub(long a, long b) {
        return a - b;
    }
}
