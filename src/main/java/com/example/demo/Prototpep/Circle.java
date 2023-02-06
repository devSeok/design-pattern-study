package com.example.demo.Prototpep;

public class Circle extends Shape{

    private int x,t,r;

    public Circle(int x, int t, int r) {
        this.x = x;
        this.t = t;
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Circle copy() throws CloneNotSupportedException{
        Circle circle = (Circle) clone();

        circle.x += 1;

        return circle;
    }
}
