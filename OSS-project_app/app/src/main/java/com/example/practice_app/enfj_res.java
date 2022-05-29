package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class enfj_res extends AppCompatActivity {

    private Button enfj_result_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enfj_res);

        enfj_result_return = findViewById(R.id.enfj_result_return);
        enfj_result_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(enfj_res.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}