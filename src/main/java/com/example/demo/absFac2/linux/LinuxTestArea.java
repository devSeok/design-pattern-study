package com.example.demo.absFac2.linux;

import com.example.demo.absFac2.abst.TextArea;

public class LinuxTestArea implements TextArea {
    @Override
    public String text() {
        return "리눅스 텍스트 ";
    }
}
