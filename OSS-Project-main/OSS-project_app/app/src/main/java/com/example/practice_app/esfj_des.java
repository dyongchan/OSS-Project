package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class esfj_des extends AppCompatActivity {

    private Button esfj_btn_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esfj_des);

        esfj_btn_return = findViewById(R.id.esfj_btn_return);
        esfj_btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(esfj_des.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}