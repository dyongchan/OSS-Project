package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class enfp_res extends AppCompatActivity {

    private Button enfp_result_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enfp_res);

        enfp_result_return = findViewById(R.id.enfp_result_return);
        enfp_result_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(enfp_res.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}