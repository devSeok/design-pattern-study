package com.example.demo.template.dp;

public class DevConnectHelper extends AbstConnectHelper{

    public static String NAME = "DEV";
    @Override
    protected String doSecurity(String string) {

        System.out.println("개발자 알고리즘 디코드");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {

        System.out.println("아이디와 패스워드는 개발자것이다.");
        return false;
    }

    @Override
    protected int authorization(String userName) {

        System.out.println("개발자 권한 확인.");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속 개발자 접속!");
        return null;
    }
}
