package com.openbootcamp;

public class Datos {
    byte a = 1;
    short b = 10;
    int c = 100;
    long d = 5492966219415L;
    float e = 1.1f;
    double f = 1.000001d;
    boolean g = true;
    boolean h = false;
    char i = 'i';
    String j = "Joaquin";


    @Override
    public String toString() {
        return "Datos{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", e=" + e +
                ", f=" + f +
                ", g=" + g +
                ", h=" + h +
                ", i=" + i +
                ", j='" + j + '\'' +
                '}';
    }
}
