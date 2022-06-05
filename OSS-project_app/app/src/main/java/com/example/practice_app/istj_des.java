package com.example.practice_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class istj_des extends AppCompatActivity {

    private Button istj_btn_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.istj_des);

        istj_btn_return = findViewById(R.id.istj_btn_return);
        istj_btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(istj_des.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}