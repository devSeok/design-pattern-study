package com.example.demo.Prototpep;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException{
        Circle circle1 = new Circle(1,1,3);
        Circle circle2 = circle1.copy();

        System.out.println(circle1.getX() + "," +circle1.getR() +"," +circle1.getT());
        System.out.println(circle2.getX() + "," +circle2.getR() +"," +circle2.getT());
    }
}
