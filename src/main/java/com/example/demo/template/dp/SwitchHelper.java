package com.example.demo.template.dp;

public class SwitchHelper {

    public static void test(String string) {

        if(DefaultConnectHelper.NAME.equals(string)) {
            new DefaultConnectHelper().requestConnection(string);
        } else if(DevConnectHelper.NAME.equals(string)) {
            new DevConnectHelper().requestConnection(string);
        }
    }
}
