package com.mj.notes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static com.mj.notes.Main.loopFor;
import static com.mj.notes.Main.loopForEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoopTest {
    @Test
    @DisplayName("Simple loop For")
    void testLoopFor(){
//        int counterMaxValue = 3;
        int resultLoopFor = loopFor(3);

        assertEquals(3, resultLoopFor);
    }

    @Test
    @DisplayName("For Each loop")
    void testLoopForEach(){
        //Given
        List<String> stringList = new LinkedList<>();

        //When
        stringList.add("One");
        stringList.add("Two");

        //Then
        assertEquals("OneTwo", loopForEach(stringList));

    }

}
