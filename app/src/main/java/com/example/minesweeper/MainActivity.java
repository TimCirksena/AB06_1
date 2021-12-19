package com.example.minesweeper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements onCellClick{
    RecyclerView gridRecyclerView;
    MineGridRecyclerAdapter mineGridRecyclerAdapter;
    MinesweeperModel game;
    TextView smiley;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smiley = findViewById(R.id.activity_main_smiley);
        smiley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game = new MinesweeperModel(10,10);
                mineGridRecyclerAdapter.setCells(game.getMineGrid().getCells());
            }
        });

        gridRecyclerView = findViewById(R.id.activity_main_grid);
        gridRecyclerView.setLayoutManager(new GridLayoutManager(this, 10));
        game = new MinesweeperModel(10, 10);
        mineGridRecyclerAdapter = new MineGridRecyclerAdapter(game.getMineGrid().getCells(), this);
        gridRecyclerView.setAdapter(mineGridRecyclerAdapter);
        game.getMineGrid().revealAllBombs();
    }

    @Override
    public void onCellClick(Cell cell) {
        Toast.makeText(getApplicationContext(), "Cell clicked", Toast.LENGTH_SHORT).show();
    }
}