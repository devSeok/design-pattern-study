package com.example.demo.absFac2.mac;

import com.example.demo.absFac2.abst.Button;
import com.example.demo.absFac2.abst.GuiFac;
import com.example.demo.absFac2.abst.TextArea;

public class MacGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacTextArea();
    }
}
