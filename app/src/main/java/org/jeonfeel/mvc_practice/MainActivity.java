package org.jeonfeel.mvc_practice;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.jeonfeel.mvc_practice.Database.DB;
import org.jeonfeel.mvc_practice.Database.infoDTO;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FloatingActionButton btn_add;
    private DB db;
    private List<infoDTO> infoDTOS;
    private RecyclerViewAdapter recyclerViewAdapter;
    public static Context main_context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //VIEW
        setContentView(R.layout.activity_main);
        FindViewById();
        db = DB.getInstance(MainActivity.this);
        infoDTOS = db.infoDAO().getAll();
        main_context = MainActivity.this;

        if (infoDTOS == null){
            infoDTOS = new ArrayList<>();
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerViewAdapter = new RecyclerViewAdapter(infoDTOS);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // control
                Intent intent = new Intent(MainActivity.this,Activity_insert.class);
                startActivity(intent);
            }
        });
    }

    private void FindViewById(){
        recyclerView = findViewById(R.id.recyclerView);
        btn_add = findViewById(R.id.btn_add);
    }

    public void updateList(){
        infoDTOS.add(db.infoDAO().getLast());
        recyclerViewAdapter.notifyDataSetChanged();
    }

}