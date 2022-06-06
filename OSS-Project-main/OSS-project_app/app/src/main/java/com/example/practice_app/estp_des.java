package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class estp_des extends AppCompatActivity {

    private Button estp_btn_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estp_des);

        estp_btn_return = findViewById(R.id.estp_btn_return);
        estp_btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(estp_des.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}