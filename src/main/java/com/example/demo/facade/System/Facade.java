package com.example.demo.facade.System;

public class Facade {

    private HelpSystem helpSystem;
    private HelpSystem02 helpSystem2;
    private HelpSystem03 helpSystem3;

    public Facade() {
        helpSystem = new HelpSystem();
        helpSystem2 = new HelpSystem02();
        helpSystem3 = new HelpSystem03();
    }

    public void process() {
        helpSystem.process();
        helpSystem2.process();
        helpSystem3.process();
    }
}
