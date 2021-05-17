package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class NineClassContentActivity extends AppCompatActivity {

    private RecyclerView contentNineClass;
    private ContentNineClassAdapter contentNineClassAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rv_content_nine_class);
        contentNineClass = findViewById(R.id.rv_content_nine_class);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        contentNineClass.setLayoutManager(layoutManager);
        contentNineClass.setHasFixedSize(true);

        contentNineClassAdapter = new ContentNineClassAdapter(2);
        contentNineClass.setAdapter(contentNineClassAdapter);
    }
}

