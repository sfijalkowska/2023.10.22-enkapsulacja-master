package com.comarch.camp.it.enkapsulacja;

public class Klasa {
    protected int cos;

    public Klasa(int cos) {
        this();
        this.cos = cos;
    }

    public Klasa() {
    }

    public void jakasMetoda() {
        System.out.println("Metoda !!");
    }

    public void jakasInnaMetoda() {
        jakasMetoda();
    }
}
