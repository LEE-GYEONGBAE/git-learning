package com.ohgiraffers;

import java.util.Scanner;

public class MakeCoffee {
    public static void main(String[] args) {
        Barista barista = new Barista();
        System.out.println("커피만들기 프로그램을 실행합니다.");

        while(true) {
            System.out.println("-------------------------");
            System.out.println("전원 켜기: 1");
            System.out.println("원두 채우기: 2");
            System.out.println("물 채우기: 3");
            System.out.println("커피 만들기: 4");
            System.out.println("기기 청소하기: 5");
            System.out.println("전원 끄기: 6");
            System.out.println("상태 보기: 7");
            System.out.println("프로그램 종료: 9");
            System.out.print("실행할 항목을 입력해주세요: ");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    barista.turnOn();
                    break;
                case 2:
                    barista.fillCoffee();
                    break;
                case 3:
                    barista.fillWater();
                    break;
                case 4:
                    barista.makeCoffee();
                    break;
                case 5:
                    barista.clearMachine();
                    break;
                case 6:
                    barista.turnOff();
                    break;
                case 7:
                    barista.info();
                    break;
                case 9:
                    break;
            }

            if (number == 9) {
                break;
            }
        }

        System.out.println("프로그램이 종료됩니다.");
    }
}
