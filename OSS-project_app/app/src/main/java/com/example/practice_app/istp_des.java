package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class istp_des extends AppCompatActivity {

    private Button istp_btn_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.istp_des);

        istp_btn_return = findViewById(R.id.istp_btn_return);
        istp_btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(istp_des.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}