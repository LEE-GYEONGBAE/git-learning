package com.ohgiraffers.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        //1부터 10까지의 숫자 배열 출력
        int[] arr2 = new int[10];
        for(int i = 0; i < arr2.length;) {
            arr2[i] = ++i;
        }

        System.out.println("\n1부터 10까지 숫자 배열을 출력합니다.");
        System.out.println(Arrays.toString(arr2));
    }
}


