package com.ohgiraffers.figure;

public class Figure {
    public static void main(String[] args) {
        FigureAbstract squ = new Square(5, 10);
        FigureAbstract cir = new Circle(3);
        FigureAbstract[] figures = {squ, cir};

        System.out.println("추상클래스");
        for(FigureAbstract figure : figures) {
            System.out.println(figure.getTypeAbs() + "의 넓이: " + figure.getAreaAbs());
        }

        System.out.println("인터페이스");
        System.out.println(((Square)squ).getType() + "의 넓이: " + ((Square)squ).getAreaInt());
        System.out.println(((Circle)cir).getType() + "의 넓이: " + ((Circle)cir).getAreaInt());
    }
}


