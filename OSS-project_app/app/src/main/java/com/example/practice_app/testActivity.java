package com.example.practice_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class testActivity extends Activity {

    private Button test_btn_return;
    private Button test_btn_next, test_btn_before;
    /* 이전으로, 다음으로(이전으로 굳이 구현안해도 될듯)*/
    private RadioGroup Radio_group_ei, Radio_group_sn, Radio_group_tf, Radio_group_jp;
    /* 특성끼리의 라디오 그룹*/
    private RadioButton Radio_btn_e, Radio_btn_i, Radio_btn_s, Radio_btn_n, Radio_btn_t, Radio_btn_f, Radio_btn_j, Radio_btn_p;
    /* 각 특성에 해당하는 라디오버튼*/
    private TextView answer_e, answer_i, answer_s, answer_n, answer_t, answer_f, answer_j, answer_p;
    /* 각 특성에 해당하는 답안*/
    private TextView test_number_ei, test_number_sn, test_number_tf, test_number_jp; // 문제 상단 숫자
    private TextView test_progress_1, test_progress_2; // 진행도 1 = (1/8), 2 = (8/64)


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
