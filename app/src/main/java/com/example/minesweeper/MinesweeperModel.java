package com.example.minesweeper;

import android.util.Log;
import java.util.Random;

public class MinesweeperModel {
    private MineGrid mineGrid;

    public MinesweeperModel(int size, int numberOfBombs){
        mineGrid = new MineGrid(size);
        mineGrid.generateGrid(numberOfBombs);
    }

    public MineGrid getMineGrid(){
        return mineGrid;
    }
}
