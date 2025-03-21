package com.ohgiraffers.figure;

public class Square extends FigureAbstract implements FigureInterface {
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
