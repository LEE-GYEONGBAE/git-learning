package com.ohgiraffers.practice;

import java.util.Arrays;
import java.util.Scanner;

class Sort {
    public static void main(String[] args) {
        System.out.println("입력받은 배열을 정렬합니다.\n정수를 5개 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "번째 정수: ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("정렬된 배열: " + Arrays.toString(arr));
    }
}
