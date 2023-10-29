package com.example;

public class CyilderAdapter implements Prism {
    private Cylinder cylinder;

    public CyilderAdapter(Cylinder cylinder) {
        this.cylinder = cylinder;
    }

    @Override
    public void calculateVolume() {
        var h = this.cylinder.getH();
        var r = this.cylinder.getR();
        var v = 3.14 * r * r * h;
        System.out.println("Volume: " + v);
    }

    @Override
    public void calculateArea() {
        var h = this.cylinder.getH();
        var r = this.cylinder.getR();
        var a = 3.14 * r * 2 * h;
        System.out.println("Area: : " + a);
    }
}
