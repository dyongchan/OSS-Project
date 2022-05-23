package com.example.practice_app;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class testActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_mbti);
    }
}
