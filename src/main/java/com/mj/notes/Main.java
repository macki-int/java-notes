package com.mj.notes;

public class Main {

    public static void main(String[] args) {

        System.out.println(simpleSwitch(2));

    }

    static String simpleSwitch(int value) {
        String string = new String();

        switch (value) {
            case 1:
                string = "One";
                break;
            case 2:
                string = "Two";
                break;
            default:
                string="Wrong value";
        }
        return string;
    }


}
