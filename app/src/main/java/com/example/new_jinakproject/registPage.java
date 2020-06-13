package com.example.new_jinakproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registPage extends AppCompatActivity {
    Button regist, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist_page);

        regist = findViewById(R.id.btn_regist);
        cancel = findViewById(R.id.btn_cancle);

        regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regist = new Intent(getApplication(), loginPage.class);
                startActivity(regist);
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancle = new Intent(getApplication(), loginPage.class);
                startActivity(cancle);
            }
        });
    }
}
