package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FloatingActionButton btn_fab;
    RecyclerView.LayoutManager layoutManager;
    RecyclerViewAdapter recyclerViewAdapter;

    int []arr={
            R.drawable.aaa,R.drawable.haa,R.drawable.kaa,R.drawable.laa,
            R.drawable.naa,R.drawable.paa,R.drawable.taa, R.drawable.uaa,
            R.drawable.waa,R.drawable.zaa};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        layoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter=new RecyclerViewAdapter(arr);

        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setHasFixedSize(true);

    }
}