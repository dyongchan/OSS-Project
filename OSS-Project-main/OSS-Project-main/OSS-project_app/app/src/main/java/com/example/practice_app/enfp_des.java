package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class enfp_des extends AppCompatActivity {

    private Button enfp_btn_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enfp_des);

        enfp_btn_return = findViewById(R.id.enfp_btn_return);
        enfp_btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(enfp_des.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}