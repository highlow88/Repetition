package com.example.repetition;

public class Rep {
    private int attribute1;
    private double attribute2;
    private String attribute3;

    public Rep(int attr1, double attr2, String attr3) {
        attribute1 = attr1;
        attribute2 = attr2;
        attribute3 = attr3;
    }

    @Override
    public String toString() {
        return "Attribute 1: " + attribute1 + "\n" +
                "Attribute 2: " + attribute2 + "\n" +
                "Attribute 3: " + attribute3;
    }

    public int getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(int attribute1) {
        this.attribute1 = attribute1;
    }

    public double getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(double attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }
// Getters and setters (if needed)
}
