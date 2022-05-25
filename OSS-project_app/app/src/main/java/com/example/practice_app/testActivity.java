package com.example.practice_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class testActivity extends Activity {

    private Button test_btn_return;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_mbti);

        test_btn_return = findViewById(R.id.test_btn_return);
        test_btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(testActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
