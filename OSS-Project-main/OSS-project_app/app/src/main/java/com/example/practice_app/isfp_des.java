package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class isfp_des extends AppCompatActivity {

    private Button isfp_btn_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isfp_des);

        isfp_btn_return = findViewById(R.id.isfp_btn_return);
        isfp_btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(isfp_des.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}