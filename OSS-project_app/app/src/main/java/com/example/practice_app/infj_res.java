package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class infj_res extends AppCompatActivity {

    private Button infj_result_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infj_res);

        infj_result_return = findViewById(R.id.infj_result_return);
        infj_result_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(infj_res.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}