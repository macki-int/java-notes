package com.mj.notes;

public class Main {

    public static void main(String[] args) {
        System.out.println(loopFor(4));
    }

    static int loopFor(int maxValue) {
        int counter = 0;
        for (int i = 0; i < maxValue; i++) {
            counter++;
        }
        return counter;
    }
}
