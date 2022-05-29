package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class infp_res extends AppCompatActivity {

    private Button infp_result_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infp_res);

        infp_result_return = findViewById(R.id.infp_result_return);
        infp_result_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(infp_res.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}