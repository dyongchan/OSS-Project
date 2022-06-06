package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class intj_des extends AppCompatActivity {

    private Button intj_btn_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intj_des);

        intj_btn_return = findViewById(R.id.intj_btn_return);
        intj_btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(intj_des.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}