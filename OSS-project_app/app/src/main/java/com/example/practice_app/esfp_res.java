package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class esfp_res extends AppCompatActivity {

    private Button esfp_result_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esfp_res);

        esfp_result_return = findViewById(R.id.esfp_result_return);
        esfp_result_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(esfp_res.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}