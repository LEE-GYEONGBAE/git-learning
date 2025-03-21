package com.ohgiraffers;

import java.util.Scanner;

public class TwoNumber {
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


/*


        //두 정수의 합과 차
        Calculator.main(args);

        //정수 오름차순
        Sort.main(args);

        //1부터 10까지의 숫자 배열 출력
        int[] arr2 = new int[10];
        for(int i = 0; i < arr2.length;) {
            arr2[i] = ++i;
        }
        System.out.println("\n1부터 10까지 숫자 배열을 출력합니다.");
        System.out.println(Arrays.toString(arr2));

        //홀수 짝수 판별
        Determination.main(args);




class Area{
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

class Calculator{
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

class Sort{
    public static void main(String[] args) {
        System.out.println("입력받은 배열을 정렬합니다.\n정수를 5개 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+"번째 정수: ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("정렬된 배열: " + Arrays.toString(arr));
    }
}

class Determination{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수/짝수 판별할 정수를 입력해주세요: ");
        int a = sc.nextInt();

        System.out.println(a % 2 == 0 ? "짝수입니다." : "홀수입니다.");
    }
}

 */