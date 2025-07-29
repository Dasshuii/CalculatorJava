package org.dashui;

import java.util.List;
import java.util.ArrayList;


public class Calculator {
    private static int timesUsed = 0;
    private List<Float> latestCalculations = new ArrayList<Float>();

    public float add(float num1, float num2) {
        return num1 + num2;
    }

    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public float multiply(float num1, float num2) {
        return num1 * num2;
    }

    public float divide(float num1, float num2) {
        return num1 / num2;
    }

    public double squareRoot(float num) {
        return Math.sqrt(num);
    }

    public double powerOf(float num, float power) {
        return Math.pow(num, power);
    }

    
}
