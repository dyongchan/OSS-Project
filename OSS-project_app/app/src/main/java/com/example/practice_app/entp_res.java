package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class entp_res extends AppCompatActivity {

    private Button entp_result_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entp_res);

        entp_result_return = findViewById(R.id.entp_result_return);
        entp_result_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(entp_res.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}