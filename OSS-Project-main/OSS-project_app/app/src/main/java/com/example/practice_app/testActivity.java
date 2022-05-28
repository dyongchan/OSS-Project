package com.example.practice_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class testActivity extends Activity {

    private Button test_btn_return,test_btn_next;
    private TextView tv_result1,tv_result2,tv_result3,tv_result4,tv_result5,tv_result6,tv_result7,tv_result8;
    private CheckBox checkbox_1_1_1,checkbox_1_1_2,checkbox_1_2_1,checkbox_1_2_2, checkbox_1_3_1,
            checkbox_1_3_2,checkbox_1_4_1,checkbox_1_4_2,checkbox_1_5_1,checkbox_1_5_2;
    int mbti_e_1p,mbti_i_1p,mbti_s_1p,mbti_n_1p,mbti_t_1p,mbti_f_1p,mbti_j_1p,mbti_p_1p;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_mbti);

        checkbox_1_1_1=findViewById(R.id.checkbox_1_1_1);
        checkbox_1_1_2=findViewById(R.id.checkbox_1_1_2);
        checkbox_1_2_1=findViewById(R.id.checkbox_1_2_1);
        checkbox_1_2_2=findViewById(R.id.checkbox_1_2_2);
        checkbox_1_3_1=findViewById(R.id.checkbox_1_3_1);
        checkbox_1_3_2=findViewById(R.id.checkbox_1_3_2);
        checkbox_1_4_1=findViewById(R.id.checkbox_1_4_1);
        checkbox_1_4_2=findViewById(R.id.checkbox_1_4_2);
        checkbox_1_5_1=findViewById(R.id.checkbox_1_5_1);
        checkbox_1_5_2=findViewById(R.id.checkbox_1_5_2);

        tv_result1=findViewById(R.id.tv_result1);
        tv_result2=findViewById(R.id.tv_result2);
        tv_result3=findViewById(R.id.tv_result3);
        tv_result4=findViewById(R.id.tv_result4);
        tv_result5=findViewById(R.id.tv_result5);
        tv_result6=findViewById(R.id.tv_result6);
        tv_result7=findViewById(R.id.tv_result7);
        tv_result8=findViewById(R.id.tv_result8);

        test_btn_return = findViewById(R.id.test_btn_return);
        test_btn_next=findViewById(R.id.test_btn_next);

        test_btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mbti_e_1p=0;
                mbti_i_1p=0;
                mbti_s_1p=0;
                mbti_n_1p=0;
                mbti_t_1p=0;
                mbti_f_1p=0;
                mbti_j_1p=0;
                mbti_p_1p=0;
                if (checkbox_1_1_1.isChecked()){
                    mbti_e_1p++;
                }
                if (checkbox_1_1_2.isChecked()){
                    mbti_i_1p++;
                }
                if (checkbox_1_2_1.isChecked()){
                    mbti_s_1p++;
                }
                if (checkbox_1_2_2.isChecked()){
                    mbti_n_1p++;
                }
                if (checkbox_1_3_1.isChecked()){
                    mbti_t_1p++;
                }
                if (checkbox_1_3_2.isChecked()){
                    mbti_f_1p++;
                }
                if (checkbox_1_4_1.isChecked()){
                    mbti_j_1p++;
                }
                if (checkbox_1_4_2.isChecked()){
                    mbti_p_1p++;
                }
                if (checkbox_1_5_1.isChecked()){
                    mbti_e_1p++;
                }
                if (checkbox_1_5_2.isChecked()){
                    mbti_i_1p++;
                }
                tv_result1.setText("e="+mbti_e_1p);
                tv_result2.setText("i="+mbti_i_1p);
                tv_result3.setText("s="+mbti_s_1p);
                tv_result4.setText("n="+mbti_n_1p);
                tv_result5.setText("t="+mbti_t_1p);
                tv_result6.setText("f="+mbti_f_1p);
                tv_result7.setText("j="+mbti_j_1p);
                tv_result8.setText("p="+mbti_p_1p);
            }
        });


        test_btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(testActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

