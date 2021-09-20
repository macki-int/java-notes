package com.mj.notes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(loopFor(4));

        List<String> stringList = new ArrayList<>();
        stringList.add("One");
        loopForEach(stringList);
    }

    static int loopFor(int maxValue) {
        int counter = 0;
        for (int i = 0; i < maxValue; i++) {
            counter++;
        }
        return counter;
    }

    static void loopForEach(List<String> stringList){
        for(String s: stringList){
            System.out.println(s);
        }
    }
}
