package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class istj_res extends AppCompatActivity {

    private Button istj_result_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.istj_res);

        istj_result_return = findViewById(R.id.istj_result_return);
        istj_result_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(istj_res.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}