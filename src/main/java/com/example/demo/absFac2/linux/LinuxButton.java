package com.example.demo.absFac2.linux;

import com.example.demo.absFac2.abst.Button;

public class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("리눅스 버튼");
    }
}
