package com.example.demo.AbsFac.Sam;

import com.example.demo.AbsFac.abst.BikeFactory;
import com.example.demo.AbsFac.abst.Body;
import com.example.demo.AbsFac.abst.Wheel;

public class SamFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
