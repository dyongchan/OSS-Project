package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class esfj_res extends AppCompatActivity {

    private Button esfj_result_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esfj_res);

        esfj_result_return = findViewById(R.id.esfj_result_return);
        esfj_result_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(esfj_res.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}