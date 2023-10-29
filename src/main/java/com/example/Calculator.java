package com.example;

public class Calculator {
    public static void main(String[] args) {
        Prism rectangular = new Rectangular(2, 2, 3);
        System.out.println(rectangular);
        rectangular.calculateVolume();
        rectangular.calculateArea();

        Cylinder cylinder = new Cylinder(1, 3);
        System.out.println(cylinder);
        Prism cyilderAdapter = new CyilderAdapter(cylinder);
        cyilderAdapter.calculateVolume();
        cyilderAdapter.calculateArea();
    }
}
