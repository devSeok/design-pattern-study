package com.example.demo.absFac2;

import com.example.demo.absFac2.abst.Button;
import com.example.demo.absFac2.abst.GuiFac;
import com.example.demo.absFac2.abst.TextArea;
import com.example.demo.absFac2.connreate.FactoryInstance;
import com.example.demo.absFac2.linux.LinuxGuiFac;
import com.example.demo.absFac2.mac.MacGuiFac;

public class Main {
    public static void main(String[] args) {

        GuiFac guiFac = FactoryInstance.getGuiFac("2");

        Button button = guiFac.createButton();
        TextArea textArea = guiFac.createTextArea();


        System.out.println(textArea.text());
        button.click();
    }
}
