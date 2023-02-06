package com.example.demo.AbsFac.gt;

import com.example.demo.AbsFac.abst.BikeFactory;
import com.example.demo.AbsFac.abst.Body;
import com.example.demo.AbsFac.abst.Wheel;

public class GtFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
