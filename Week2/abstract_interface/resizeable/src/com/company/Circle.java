package com.company;

public class Circle extends Shape implements Resizeable{
    public double radius;

    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }


    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getPerimeter(){
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius() +
                ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double ratio) {
        radius = radius * Math.sqrt(ratio);
    }
}