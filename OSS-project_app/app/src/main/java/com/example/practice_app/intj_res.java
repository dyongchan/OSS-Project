package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class intj_res extends AppCompatActivity {

    private Button intj_result_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intj_res);

        intj_result_return = findViewById(R.id.intj_result_return);
        intj_result_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(intj_res.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}