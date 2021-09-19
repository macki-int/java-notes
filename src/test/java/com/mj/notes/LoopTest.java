package com.mj.notes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.mj.notes.Main.loopFor;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoopTest {
    @Test
    @DisplayName("Simple loop For")
    void testLoopFor(){
//        int counterMaxValue = 3;
        int resultLoopFor = loopFor(3);

        assertEquals(3, resultLoopFor);
    }

}
