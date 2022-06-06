package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class esfp_des extends AppCompatActivity {

    private Button esfp_btn_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esfp_des);

        esfp_btn_return = findViewById(R.id.esfp_btn_return);
        esfp_btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(esfp_des.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}