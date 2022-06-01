package com.example.practice_app;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class testActivity extends Activity {

    int inspection_number = 1;
    int e_point, i_point, s_point, n_point, t_point, f_point, j_point, p_point = 0;

    private Button test_btn_return;
    private Button test_btn_next, test_btn_before;
    /* 이전으로, 다음으로(이전으로 굳이 구현안해도 될듯)*/
    private RadioGroup Radio_group_ei, Radio_group_sn, Radio_group_tf, Radio_group_jp;
    /* 특성끼리의 라디오 그룹*/
    private RadioButton Radio_btn_e, Radio_btn_i, Radio_btn_s, Radio_btn_n, Radio_btn_t, Radio_btn_f, Radio_btn_j, Radio_btn_p;
    /* 각 특성에 해당하는 라디오버튼*/
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


        test_btn_next = findViewById(R.id.test_btn_next);
        test_btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inspection_number++;
                next1();
                next2();

            }
        });
    }

    public void next1() {
        final TextView answer_e = (TextView) findViewById(R.id.answer_e);
              TextView answer_i = (TextView) findViewById(R.id.answer_i);
              TextView answer_s = (TextView) findViewById(R.id.answer_s);
              TextView answer_n = (TextView) findViewById(R.id.answer_n);
              TextView answer_t = (TextView) findViewById(R.id.answer_t);
              TextView answer_f = (TextView) findViewById(R.id.answer_f);
              TextView answer_j = (TextView) findViewById(R.id.answer_j);
              TextView answer_p = (TextView) findViewById(R.id.answer_p);



        if (inspection_number == 2) {
            answer_e.setText("안녕");
            answer_i.setText("2번쨰야");
            answer_s.setText("");
            answer_n.setText("");
            answer_t.setText("");
            answer_f.setText("");
            answer_j.setText("");
            answer_p.setText("");
        }

        if (inspection_number == 3) {
            answer_e.setText("안녕");
            answer_i.setText("2번쨰야");
            answer_s.setText("");
            answer_n.setText("");
            answer_t.setText("");
            answer_f.setText("");
            answer_j.setText("");
            answer_p.setText("");
        }

        if (inspection_number == 4) {
            answer_e.setText("안녕");
            answer_i.setText("2번쨰야");
            answer_s.setText("");
            answer_n.setText("");
            answer_t.setText("");
            answer_f.setText("");
            answer_j.setText("");
            answer_p.setText("");
        }

        if (inspection_number == 5) {
            answer_e.setText("안녕");
            answer_i.setText("2번쨰야");
            answer_s.setText("");
            answer_n.setText("");
            answer_t.setText("");
            answer_f.setText("");
            answer_j.setText("");
            answer_p.setText("");

        }




        }

    public void next2() {
        final RadioButton Radio_btn_e = (RadioButton) findViewById(R.id.Radio_btn_e);

        if (inspection_number == 2) {


        }
    }


    }

