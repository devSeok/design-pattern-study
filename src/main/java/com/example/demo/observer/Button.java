package com.example.demo.observer;

public class Button {

    public void onClick() {
        System.out.println("이벤트 처리");

        if(onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public interface OnClickListener {
        public void onClick(Button button);
    }

    private OnClickListener onClickListener;


    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

}
