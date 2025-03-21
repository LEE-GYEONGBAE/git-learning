package com.ohgiraffers.practice;

import java.util.Scanner;

class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("직사각형의 넓이를 구합니다.");
        System.out.print("가로의 길이: ");
        int width = Integer.parseInt(sc.nextLine());
        System.out.print("세로의 길이: ");
        int height = Integer.parseInt(sc.nextLine());

        System.out.println("직사각형의 넓이: " + width * height);
    }
}
