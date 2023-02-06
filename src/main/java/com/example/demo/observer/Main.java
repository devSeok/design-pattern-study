package com.example.demo.observer;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();

        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(Button button) {
                System.out.println(button + "클릭");
            }
        });
        button.onClick();
    }
}

class ButtionClick implements Button.OnClickListener {

    @Override
    public void onClick(Button button) {
        System.out.println(button + "클릭");
    }
}
