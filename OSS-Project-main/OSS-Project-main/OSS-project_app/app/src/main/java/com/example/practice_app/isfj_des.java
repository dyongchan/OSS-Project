package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class isfj_des extends AppCompatActivity {

    private Button isfj_btn_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isfj_des);

        isfj_btn_return = findViewById(R.id.isfj_btn_return);
        isfj_btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(isfj_des.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}