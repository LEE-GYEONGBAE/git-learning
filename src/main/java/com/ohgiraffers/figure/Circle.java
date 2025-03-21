package com.ohgiraffers.figure;

public class Circle extends FigureAbstract implements FigureInterface {
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
