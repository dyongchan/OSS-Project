package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class entj_des extends AppCompatActivity {

    private Button entj_btn_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entj_des);

        entj_btn_return = findViewById(R.id.entj_btn_return);
        entj_btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(entj_des.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}