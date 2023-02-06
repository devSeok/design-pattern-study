package com.example.demo.absFac2.mac;

import com.example.demo.absFac2.abst.TextArea;

public class MacTextArea implements TextArea {
    @Override
    public String text() {
        return "mac 텍스트";
    }
}
