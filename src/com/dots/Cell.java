package com.dots;

/**
 * @author Captain Jack
 * @since 17.07.13
 */
public class Cell {

    private int x;
    private int y;
    private Value value;

    enum Value {
        FREE,
        PLAYER,
        COMPUTER
    }

    private Border border;
    private boolean isSurrounded;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.value = Value.FREE;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public boolean isInBorder() {
        return border != null;
    }

    public void setBorder(Border border) {
        this.border = border;
    }

    public boolean isSurrounded() {
        return this.isSurrounded;
    }

    public void setSurrounded(boolean isSurrounded) {
        this.isSurrounded = isSurrounded;
    }
}
