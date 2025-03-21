package com.ohgiraffers.practice;

import java.util.Scanner;

class Determination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수/짝수 판별할 정수를 입력해주세요: ");
        int a = sc.nextInt();

        System.out.println(a % 2 == 0 ? "짝수입니다." : "홀수입니다.");
    }
}
