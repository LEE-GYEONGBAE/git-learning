package com.ohgiraffers.cafe;

public class CoffeeMachine {
    private boolean isOn;
    private int coffee;
    private int water;

    public void turnOn() {
        if(!isOn) {
            isOn = true;
            System.out.println(">> 커피머신이 켜졌습니다.");
        } else {
            System.out.println(">> 커피머신이 이미 켜져있습니다.");
        }
    }

    public void fillCoffee() {  //커피는 10씩 채워진다.
        if(this.coffee == 50) {
            System.out.println(">> 원두가 가득 찼습니다.");
            return;
        } else if(this.coffee > 40) {
            this.coffee = 50;
        } else {
            this.coffee += 10;
        }
        System.out.println(">> 원두를 채웠습니다. 현재 원두량: " + this.coffee);
    }

    public void fillWater() {   //물은 20씩 채워진다.
        if(this.water == 100) {
            System.out.println(">> 물이 가득 찼습니다.");
            return;
        } else if(this.water > 80) {
            this.water = 100;
        } else {
            this.water += 20;
        }
        System.out.println(">> 물을 채웠습니다. 현재 수위: " + this.water);
    }

    public void makeCoffee() {
        if(!isOn) {
            System.out.println(">> 커피머신이 켜지지 않았습니다.");
            return;
        }

        if(this.coffee < 3) {
            System.out.println(">> 원두가 부족합니다.");
            return;
        }

        if(this.water < 8) {
            System.out.println(">> 물이 부족합니다.");
            return;
        }

        this.coffee -= 3;
        this.water -= 8;
        System.out.println(">> 커피가 추출되었습니다.");
    }

    public void clean() {
        if(isOn) {
            System.out.println(">> 커피머신이 켜져있으면 청소할 수 없습니다.");
            return;
        }
        if(this.coffee == 0 && this.water == 0) {
            System.out.println(">> 커피머신이 이미 깨끗합니다.");
            return;
        }

        this.coffee = 0;
        this.water = 0;
        System.out.println(">> 청소가 완료되었습니다.");
    }

    public void turnOff() {
        if(isOn) {
            isOn = false;
            String msg = ">> 커피머신이 꺼졌습니다.";
            if(coffee > 0 || water > 0) {
                msg += " 커피머신을 청소해주세요.";
            }
            System.out.println(msg);
        } else {
            System.out.println(">> 커피머신이 이미 꺼져있습니다.");
        }
    }

    public void info() {
        System.out.println(">> 전원 상태: " + (this.isOn ? "켜짐" : "꺼짐"));
        System.out.println(">> 커피량: " + this.coffee);
        System.out.println(">> 수위: " + this.water);
    }
}
