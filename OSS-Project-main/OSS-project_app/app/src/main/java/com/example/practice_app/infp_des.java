package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class infp_des extends AppCompatActivity {

    private Button infp_btn_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infp_des);

        infp_btn_return = findViewById(R.id.infp_btn_return);
        infp_btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(infp_des.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}