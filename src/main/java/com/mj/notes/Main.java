package com.mj.notes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(loopFor(4));

        List<String> stringList = new ArrayList<>();
        stringList.add("One");
        System.out.println(loopForEach(stringList));
    }

    static int loopFor(int maxValue) {
        int counter = 0;
        for (int i = 0; i < maxValue; i++) {
            counter++;
        }
        return counter;
    }

    static String loopForEach(List<String> stringList) {
        String string = new String();

        for (String s : stringList) {
            string += s;
        }
        return string;
    }
}
