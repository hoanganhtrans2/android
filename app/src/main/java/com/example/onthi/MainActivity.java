package com.example.onthi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvName;
    private  NameListAdapter nameListAdapter;
    private ArrayList<String> nameArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvName = findViewById(R.id.rcvName);
        nameArrayList = new ArrayList<>();
        nameArrayList.add("hoang anh");
        nameArrayList.add("hoang anh");
        nameArrayList.add("hoang anh");
        nameArrayList.add("hoang anh");
        nameListAdapter = new NameListAdapter(this, nameArrayList);

        rcvName.setAdapter(nameListAdapter);
        rcvName.setLayoutManager(new LinearLayoutManager(this));
    }
}