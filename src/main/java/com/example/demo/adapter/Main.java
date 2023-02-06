package com.example.demo.adapter;

public class Main {

    public static void main(String[] args) {

        Adapter A = new AdapterImpl();
        System.out.println(A.halfOf(100f));
        System.out.println(A.twiceOf(40f));
    }
}
