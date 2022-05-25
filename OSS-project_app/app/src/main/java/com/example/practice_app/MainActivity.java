package com.example.practice_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_test;
    private Button btn_main_istj, btn_main_istp, btn_main_isfj, btn_main_isfp,
            btn_main_intj, btn_main_intp, btn_main_infj, btn_main_inf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_test = findViewById(R.id.btn_test);
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this ,testActivity.class);
                startActivity(intent); // 액티비티 이동
            }
        });


        btn_main_istj = findViewById(R.id.btn_main_istj);
        btn_main_istj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, istj_des.class);
                startActivity(intent1);

            }
        });
    }
}