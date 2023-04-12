package com.example.firstlab;

public class Calc {

    public static double calc(double x, double a){

        double answ;

        answ = 3 * x + x * 4 * (1 + (x - a/x)/(x + a/x) ) - 1;

        return answ;
    }
}
