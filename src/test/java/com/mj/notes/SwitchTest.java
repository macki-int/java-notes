package com.mj.notes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.mj.notes.Main.simpleSwitch;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwitchTest {
    @Test
    @DisplayName("Simple switch")
    void testSimpleSwitch() {
        //Given
        int i, j;

        //When
        i=1;
        j=0;

        //Then
        assertEquals("One", simpleSwitch(i));
        assertEquals("Wrong value", simpleSwitch(j));
    }
}
