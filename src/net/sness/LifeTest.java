package net.sness;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LifeTest {

    @Test
    public void shouldInitializeToAllZeroGrid() {
        Life life = new Life();
        String s = life.toString();
        assertEquals("000\n000\n000\n", s);
    }

    @Test
    public void shouldBeAbleToInitOtherSizeGrids() {
        Life life = new Life(2,2);
        String s = life.toString();
        assertEquals("00\n00\n", s);
    }

    @Test
    public void shouldBeAbleToSetAndGetASingleCell() {
        Life life = new Life(1,1);
        life.set(1,0,0);
        int i = life.get(0,0);
        assertEquals(1, i);
    }

    @Test
    public void singleCellWithNoNeighboursShouldStep() {
        Life life = new Life(1,1);
        life.set(1,0,0);
        life.step();
        int i = life.get(0,0);
        assertEquals(0, i);
    }

}