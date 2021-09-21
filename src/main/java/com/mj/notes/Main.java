package com.mj.notes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(loopFor(4));

        List<String> stringList = new ArrayList<>();
        stringList.add("One");
        System.out.println(loopForEach(stringList));

        System.out.println(loopWhile(3));
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

    static int loopWhile(int value) {
        int i = 0;
        int j = 0;
        while (i < value) {
            i++;
            j=j+i;
        }

        return j;
    }
}
