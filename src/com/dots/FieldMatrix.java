package com.dots;

/**
 * @author Captain Jack
 * @since 17.07.13
 */
public class FieldMatrix {

    Cell[][] cells;

    public FieldMatrix(int cellsX, int cellsY) {
        this.cells = new Cell[cellsX][cellsY];
        for (int i = 0; i < cellsX; i++) {
            for (int j = 0; j < cellsY; j++) {
                this.cells[i][j] = new Cell(i, j);
            }
        }
    }
}
