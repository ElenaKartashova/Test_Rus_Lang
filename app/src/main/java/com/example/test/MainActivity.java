package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

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
