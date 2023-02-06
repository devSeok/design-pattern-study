package com.example.demo.strategy;

import org.springframework.beans.factory.annotation.Autowired;

public class AObj {

    Ainterface ainterface;

    public AObj() {
        this.ainterface = new AinterfaceImpl();
    }

    public void funcAA() {
        ainterface.funcA();
        ainterface.funcA();
    }
}
