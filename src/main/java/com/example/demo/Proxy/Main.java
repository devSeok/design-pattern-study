package com.example.demo.Proxy;

public class Main {
    public static void main(String[] args) {
        Subject real = new RealSubject();

        Subject proxy = new Proxy(real);
        Subject proxy2 = new Proxy(real);


        proxy.action1();
        proxy2.action1();


        proxy.action2();
        proxy2.action2();

    }
}
