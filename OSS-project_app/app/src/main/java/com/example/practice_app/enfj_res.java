package com.example.mbti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class enfj_res extends AppCompatActivity {

    private Button enfj_result_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enfj_res);

        TextView e_percent = (TextView) findViewById(R.id.e_percent);
        TextView i_percent = (TextView) findViewById(R.id.i_percent);
        TextView s_percent = (TextView) findViewById(R.id.s_percent);
        TextView n_percent = (TextView) findViewById(R.id.n_percent);
        TextView t_percent = (TextView) findViewById(R.id.t_percent);
        TextView f_percent = (TextView) findViewById(R.id.f_percent);
        TextView j_percent = (TextView) findViewById(R.id.j_percent);
        TextView p_percent = (TextView) findViewById(R.id.p_percent);

        Intent intent = getIntent();

        // testActivity에서 전달받은 데이터
        int e = intent.getExtras().getInt("e_percent");
        int i = intent.getExtras().getInt("i_percent");
        int s = intent.getExtras().getInt("s_percent");
        int n = intent.getExtras().getInt("n_percent");
        int t = intent.getExtras().getInt("t_percent");
        int f = intent.getExtras().getInt("f_percent");
        int j = intent.getExtras().getInt("j_percent");
        int p = intent.getExtras().getInt("p_percent");

        e_percent.setText(String.valueOf(e));
        i_percent.setText(String.valueOf(i));
        s_percent.setText(String.valueOf(s));
        n_percent.setText(String.valueOf(n));
        t_percent.setText(String.valueOf(t));
        f_percent.setText(String.valueOf(f));
        j_percent.setText(String.valueOf(j));
        p_percent.setText(String.valueOf(p));

        enfj_result_return = findViewById(R.id.enfj_result_return);
        enfj_result_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(enfj_res.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
