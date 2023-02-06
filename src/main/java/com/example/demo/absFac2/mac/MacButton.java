package com.example.demo.absFac2.mac;

import com.example.demo.absFac2.abst.Button;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("맥 버튼");
    }
}
