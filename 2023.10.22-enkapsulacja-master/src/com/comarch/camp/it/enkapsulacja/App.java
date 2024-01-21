package com.comarch.camp.it.enkapsulacja;

public class App {
    public static void main(String[] args) {
        Square k = new Square(5, 20, 25);
        System.out.println(k.getSide());
        System.out.println(k.getCircle());
        System.out.println(k.getField());

        k.setSide(10);

        System.out.println(k.getSide());
        System.out.println(k.getCircle());
        System.out.println(k.getField());

        Client c1 = new Client();
        c1.setName("Janusz");

        Klasa klasa = new Klasa();
        klasa.cos = 14;
    }
}
