package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class entj_res extends AppCompatActivity {

    private Button entj_result_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entj_res);

        entj_result_return = findViewById(R.id.entj_result_return);
        entj_result_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(entj_res.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}