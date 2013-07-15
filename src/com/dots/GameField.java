package com.dots;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Captain Jack
 * @since 15.07.13
 */

class GameField extends JPanel {

    private int cellsX;
    private int cellsY;
    private int gridStep;
    private List<CellClickListener> cellClickListeners = new ArrayList<CellClickListener>();

    public GameField(int cellsX, int cellsY, int gridStep) {
        this.cellsX = cellsX;
        this.cellsY = cellsY;
        this.gridStep = gridStep;
        if (this.gridStep <= 0) this.gridStep = 10;
        setPreferredSize(new Dimension(cellsX * (gridStep), cellsY * (gridStep)));
        setBackground(new Color(255, 255, 230));
        this.setBorder(new LineBorder(Color.RED));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintGrid(g);
    }

    public Dimension getPreferredDimension() {
        return new Dimension(cellsX * (gridStep), cellsY * (gridStep));
    }

    private void paintGrid(Graphics g) {
        g.setColor(Color.gray);
        int borderWidth = gridStep / 2;

        for (int i = 0; i < cellsX; i++) {
            g.drawLine(borderWidth, i * gridStep + borderWidth, cellsX * gridStep - borderWidth - 1, i * gridStep + borderWidth);
        }
        for (int i = 0; i < cellsY; i++) {
            g.drawLine(i * gridStep + borderWidth, borderWidth, i * gridStep + borderWidth, cellsY * gridStep - borderWidth - 1);
        }
    }

    public void addCellClickListener(CellClickListener listener) {
        cellClickListeners.add(listener);
    }

    public interface CellClickListener {
        void onCellClick(CellClickEvent e);
    }

    public class CellClickEvent {

        private Cell cell;

        public CellClickEvent(Cell cell) {
            this.cell = cell;
        }

        public Cell getCell() {
            return this.cell;
        }
    }

    public class Cell {
        private int x;
        private int y;

        public Cell(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }
    }
}