package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class intp_des extends AppCompatActivity {

    private Button intp_btn_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intp_des);

        intp_btn_return = findViewById(R.id.intp_btn_return);
        intp_btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(intp_des.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}