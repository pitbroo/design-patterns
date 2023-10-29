package com.example;

public class Rectangular implements Prism {
    private int a;
    private int b;
    private int c;

    public Rectangular(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void calculateVolume() {
        System.out.println("Volume: " + a * b * c);
    }

    @Override
    public void calculateArea() {
        System.out.println("Area: " + 2 * (a * b + a * c + c * b));
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
