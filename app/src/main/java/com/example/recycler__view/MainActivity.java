package com.example.recycler__view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter_char adapter;
    private ArrayList<PlayerStat> playerStatsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        adapter=new Adapter_char(playerStatsArray);
        RecyclerView.LayoutManager LayoutManager= new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(LayoutManager);
        recyclerView.setAdapter(adapter);

    }

    void addData(){
        playerStatsArray=new ArrayList<>();
        playerStatsArray.add(new PlayerStat("Ryan","Attacker","Nittoryu"));
        playerStatsArray.add(new PlayerStat("Han","Jumper","Mogura"));
    }
}
