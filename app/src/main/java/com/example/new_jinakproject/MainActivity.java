package com.example.new_jinakproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar=findViewById(R.id.loading);
        textView = findViewById(R.id.persen);

        progressBar.setMax(100);
        progressBar.setScaleY(2f);

        progressAnimation();
    }

    public void progressAnimation(){
        loading load = new loading(this, progressBar, textView, 0f, 100f);
        load.setDuration(2000);

        progressBar.setAnimation(load);
    }
}