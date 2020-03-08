package net.sness;

import java.util.ArrayList;
import java.util.List;

public class Life {

    private int x;
    private int y;

    private List<List<Integer>> cells;

    public Life() {
        this(3,3);
    }

    public Life(int x, int y) {
        this.x = x;
        this.y = y;
        cells = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < y; j++) {
                row.add(0);
            }
            cells.add(row);
        }
    }

    public void clear() {
    }

    public void randomize() {
    }

    public void testPattern() {
    }

    public void step() {
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < x; i ++) {
            for (int j = 0; j < y; j++) {
                str.append(cells.get(i).get(j));
            }
            str.append("\n");
        }
        return str.toString();
    }
}















