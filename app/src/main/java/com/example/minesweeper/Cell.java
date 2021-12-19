package com.example.minesweeper;

public class Cell {
    public static final int bomb = -1;
    public static final int blank = 0;

    private int value;
    private boolean isRevealed;
    private boolean isFlagged;

    public Cell(int value){
        this.value = value;
        this.isRevealed = false;
        this.isFlagged = false;
    }

    public static int getBomb() {
        return bomb;
    }

    public static int getBlank() {
        return blank;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isRevealed() {
        return isRevealed;
    }

    public void setRevealed(boolean revealed) {
        isRevealed = revealed;
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public void setFlagged(boolean flagged) {
        isFlagged = flagged;
    }
}
