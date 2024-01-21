package com.comarch.camp.it.enkapsulacja.main;

import com.comarch.camp.it.enkapsulacja.a.Car;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        car.a = 10;

        com.comarch.camp.it.enkapsulacja.b.Car car2 = new com.comarch.camp.it.enkapsulacja.b.Car();
        car2.b = 15;
    }
}
