package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class estp_res extends AppCompatActivity {

    private Button estp_result_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estp_res);

        estp_result_return = findViewById(R.id.estp_result_return);
        estp_result_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(estp_res.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}