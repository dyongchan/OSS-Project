package com.example.practice_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_test;
    private Button btn_main_istj, btn_main_istp, btn_main_isfj, btn_main_isfp,
            btn_main_intj, btn_main_intp, btn_main_infj, btn_main_infp;

    private Button btn_main_estj, btn_main_estp, btn_main_esfj, btn_main_esfp,
            btn_main_entj, btn_main_entp, btn_main_enfj, btn_main_enfp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_test = findViewById(R.id.btn_test);
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, testActivity.class);
                startActivity(intent); // 액티비티 이동
            }
        });

        btn_main_istj = findViewById(R.id.btn_main_istj);
        btn_main_istj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, istj_des.class);
                startActivity(intent);
            }
        });

        btn_main_istp = findViewById(R.id.btn_main_istp);
        btn_main_istp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, istp_des.class);
                startActivity(intent);
            }
        });

        btn_main_estj = findViewById(R.id.btn_main_estj);
        btn_main_estj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this ,estj_des.class);
                startActivity(intent);
            }
        });

        btn_main_estp = findViewById(R.id.btn_main_estp);
        btn_main_estp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this ,estp_des.class);
                startActivity(intent);
            }
        });

        btn_main_isfj = findViewById(R.id.btn_main_isfj);
        btn_main_isfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, isfj_des.class);
                startActivity(intent);
            }
        });

        btn_main_isfp = findViewById(R.id.btn_main_isfp);
        btn_main_isfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, isfp_des.class);
                startActivity(intent);
            }
        });

        btn_main_esfj = findViewById(R.id.btn_main_esfj);
        btn_main_esfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this ,esfj_des.class);
                startActivity(intent);
            }
        });

        btn_main_esfp = findViewById(R.id.btn_main_esfp);
        btn_main_esfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this ,esfp_des.class);
                startActivity(intent);
            }
        });

        btn_main_infj = findViewById(R.id.btn_main_infj);
        btn_main_infj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, infj_des.class);
                startActivity(intent);
            }
        });

        btn_main_infp = findViewById(R.id.btn_main_infp);
        btn_main_infp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, infp_des.class);
                startActivity(intent);
            }
        });

        btn_main_enfj = findViewById(R.id.btn_main_enfj);
        btn_main_enfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, enfj_des.class);
                startActivity(intent);
            }
        });

        btn_main_enfp = findViewById(R.id.btn_main_enfp);
        btn_main_enfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, enfp_des.class);
                startActivity(intent);
            }
        });

        btn_main_intj = findViewById(R.id.btn_main_intj);
        btn_main_intj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, intj_des.class);
                startActivity(intent);
            }
        });

        btn_main_intp = findViewById(R.id.btn_main_intp);
        btn_main_intp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, intp_des.class);
                startActivity(intent);
            }
        });

        btn_main_entj = findViewById(R.id.btn_main_entj);
        btn_main_entj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, entj_des.class);
                startActivity(intent);
            }
        });

        btn_main_entp = findViewById(R.id.btn_main_entp);
        btn_main_entp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, entp_des.class);
                startActivity(intent);
            }
        });
    }
}