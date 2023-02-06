package com.example.demo.absFac2.connreate;

import com.example.demo.absFac2.abst.GuiFac;
import com.example.demo.absFac2.linux.LinuxGuiFac;
import com.example.demo.absFac2.mac.MacGuiFac;

public class FactoryInstance {

    private FactoryInstance() {

    }

    public static GuiFac getGuiFac(String string) {

        if(string == "1") {
            return new LinuxGuiFac();
        } else if(string == "2"){
            return new MacGuiFac();
        }

        return null;
    }
}
