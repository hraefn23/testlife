package net.sness;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LifeTest {

    @Test
    void shouldInitializeToAllZeroGrid() {
        Life life = new Life();
        String s = life.toString();
        assertEquals("000\n000\n000\n", s);
    }

}