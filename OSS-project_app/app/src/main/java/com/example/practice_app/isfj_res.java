package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class isfj_res extends AppCompatActivity {

    private Button isfj_result_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isfj_res);

        isfj_result_return = findViewById(R.id.isfj_result_return);
        isfj_result_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(isfj_res.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}