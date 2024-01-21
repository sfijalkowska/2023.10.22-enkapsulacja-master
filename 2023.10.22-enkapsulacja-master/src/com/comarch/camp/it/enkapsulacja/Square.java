package com.comarch.camp.it.enkapsulacja;

public class Square {
    private int side;
    private int circle;
    private int field;

    public Square(int side, int circle, int field) {
        this.side = side;
        this.circle = circle;
        this.field = field;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
        this.circle = side * 4;
        this.field = side * side;
    }

    public int getCircle() {
        return circle;
    }

    public int getField() {
        return field;
    }
}
