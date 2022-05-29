package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class intp_res extends AppCompatActivity {

    private Button intp_result_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intp_res);

        intp_result_return = findViewById(R.id.intp_result_return);
        intp_result_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(intp_res.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}