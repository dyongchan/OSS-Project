package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class istp_res extends AppCompatActivity {

    private Button istp_result_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.istp_res);

        istp_result_return = findViewById(R.id.istp_result_return);
        istp_result_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(istp_res.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}