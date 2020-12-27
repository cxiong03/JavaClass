package com.codewithchang;

public class Main {

    public static void main(String[] args) {
        int myValue = 1000;

        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinValue);
        System.out.println("Integer Maximum Value = " + myMaxValue);
        System.out.println("Busted MAX value = " + (myMaxValue + 1));
        System.out.println("Busted MIN value = " + (myMinValue + 1));

        int myMaxIntTest = 2_147_483_647;
    }
}
