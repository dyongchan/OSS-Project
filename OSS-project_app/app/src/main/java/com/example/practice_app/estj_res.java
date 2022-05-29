package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class estj_res extends AppCompatActivity {

    private Button estj_result_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estj_res);

        estj_result_return = findViewById(R.id.estj_result_return);
        estj_result_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(estj_res.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}