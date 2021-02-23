package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int TextViewContentNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showContentFiveClass(View view) {
    }

    public void showContentSixClass(View view) {
    }

    public void showContentSevenClass(View view) {
    }

    public void showContentEightClass(View view) {
    }

    public void showContentNineClass(View view) {
        Intent intent = new Intent(this, NineClassContentActivity.class);
        startActivity(intent);
    }

}
