package com.example.demo.AbsFac;

import com.example.demo.AbsFac.Sam.SamFactory;
import com.example.demo.AbsFac.abst.BikeFactory;
import com.example.demo.AbsFac.abst.Body;
import com.example.demo.AbsFac.abst.Wheel;
import com.example.demo.AbsFac.gt.GtFactory;

public class Main {
    public static void main(String[] args) {
        BikeFactory factory = new GtFactory();

        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());
    }
}
