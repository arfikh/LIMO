package com.example.ps2bidespus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_list);
    }

    public void back(View view) {
        Intent intent = new Intent(ActivityLab.this, Home.class);
        startActivity(intent);
    }
}