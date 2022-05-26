package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class entp_des extends AppCompatActivity {

    private Button entp_btn_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entp_des);

        entp_btn_return = findViewById(R.id.entp_btn_return);
        entp_btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(entp_des.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}