package com.example.demo.strategy;

public class GameCharacter {

    // 접근점
    private Weapon weapon;

    // 교환가능하게 처리

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {

        if(weapon == null) {
            System.out.println("맨손 공격");
        } else {
            weapon.attack();
        }
        // 델리게이트

    }
}
