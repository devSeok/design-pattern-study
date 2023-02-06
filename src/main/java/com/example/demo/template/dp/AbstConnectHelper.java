package com.example.demo.template.dp;

public abstract class AbstConnectHelper {

    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);


    // 템플릿 메소드
    public String requestConnection(String str) {

        // 보안 작업 -  암호화 된 문자열을 복호화
        doSecurity(str);
        authentication("11", "22");
        authorization("ss");

        return connection(str);
    }
}
