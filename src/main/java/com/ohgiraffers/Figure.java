package com.ohgiraffers;

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
abstract class FigureAbstract {
    abstract String getTypeAbs();
    abstract double getAreaAbs();
}

interface FigureInterface {
    double getAreaInt();
}

class Square extends FigureAbstract implements FigureInterface {
    private final String type = "SQUARE";
    private final double width, height;

    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getTypeAbs() {
        return type;
    }

    @Override
    public double getAreaAbs() {
        return width * height;
    }

    @Override
    public double getAreaInt() {
        return width * height;
    }

    public String getType() {
        return type;
    }
}

class Circle extends FigureAbstract implements FigureInterface {
    private final String type = "CIRCLE";
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getTypeAbs() {
        return type;
    }

    @Override
    public double getAreaAbs() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getAreaInt() {
        return Math.PI * radius * radius;
    }

    public String getType() {
        return type;
    }
}
