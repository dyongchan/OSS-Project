package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class isfp_res extends AppCompatActivity {

    private Button isfp_result_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isfp_res);

        isfp_result_return = findViewById(R.id.isfp_result_return);
        isfp_result_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(isfp_res.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}