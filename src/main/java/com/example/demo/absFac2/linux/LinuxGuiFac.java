package com.example.demo.absFac2.linux;

import com.example.demo.absFac2.abst.Button;
import com.example.demo.absFac2.abst.GuiFac;
import com.example.demo.absFac2.abst.TextArea;

public class LinuxGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTestArea();
    }
}
