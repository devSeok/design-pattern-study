package com.example.demo.adapter;

public class AdapterImpl implements Adapter{
    @Override
    public Float twiceOf(Float f) {

        return Math.doubled(f);
    }

    @Override
    public Float halfOf(Float f) {

        return Math.half(f);
    }
}
