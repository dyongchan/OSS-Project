package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class infj_des extends AppCompatActivity {

    private Button infj_btn_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infj_des);

        infj_btn_return = findViewById(R.id.infj_btn_return);
        infj_btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(infj_des.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}