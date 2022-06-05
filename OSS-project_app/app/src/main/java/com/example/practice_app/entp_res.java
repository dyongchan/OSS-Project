package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class entp_res extends AppCompatActivity {

    private Button entp_result_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entp_res);

        final TextView e_percent = (TextView) findViewById(R.id.e_percent);
        TextView i_percent = (TextView) findViewById(R.id.i_percent);
        TextView s_percent = (TextView) findViewById(R.id.s_percent);
        TextView n_percent = (TextView) findViewById(R.id.n_percent);
        TextView t_percent = (TextView) findViewById(R.id.t_percent);
        TextView f_percent = (TextView) findViewById(R.id.f_percent);
        TextView j_percent = (TextView) findViewById(R.id.j_percent);
        TextView p_percent = (TextView) findViewById(R.id.p_percent);

        final ProgressBar progressBar_e = (ProgressBar) findViewById(R.id.progressbar_e);
        ProgressBar progressBar_i = (ProgressBar) findViewById(R.id.progressbar_i);
        ProgressBar progressBar_s = (ProgressBar) findViewById(R.id.progressbar_s);
        ProgressBar progressBar_n = (ProgressBar) findViewById(R.id.progressbar_n);
        ProgressBar progressBar_t = (ProgressBar) findViewById(R.id.progressbar_t);
        ProgressBar progressBar_f = (ProgressBar) findViewById(R.id.progressbar_f);
        ProgressBar progressBar_j = (ProgressBar) findViewById(R.id.progressbar_j);
        ProgressBar progressBar_p = (ProgressBar) findViewById(R.id.progressbar_p);


        Intent intent = new Intent(this.getIntent());
        double percent_e = intent.getExtras().getDouble("percent_e");
        double percent_i = intent.getExtras().getDouble("percent_i");
        double percent_s = intent.getExtras().getDouble("percent_s");
        double percent_n = intent.getExtras().getDouble("percent_n");
        double percent_t = intent.getExtras().getDouble("percent_t");
        double percent_f = intent.getExtras().getDouble("percent_f");
        double percent_j = intent.getExtras().getDouble("percent_j");
        double percent_p = intent.getExtras().getDouble("percent_p");

        int per_e = (int)Math.ceil(percent_e);
        int per_i = (int)Math.floor(percent_i);
        int per_s = (int)Math.ceil(percent_s);
        int per_n = (int)Math.floor(percent_n);
        int per_t = (int)Math.ceil(percent_t);
        int per_f = (int)Math.floor(percent_f);
        int per_j = (int)Math.ceil(percent_j);
        int per_p = (int)Math.floor(percent_p);

        e_percent.setText(per_e + "%");
        i_percent.setText(per_i + "%");
        s_percent.setText(per_s + "%");
        n_percent.setText(per_n + "%");
        t_percent.setText(per_t + "%");
        f_percent.setText(per_f + "%");
        j_percent.setText(per_j + "%");
        p_percent.setText(per_p + "%");

        progressBar_e.setProgress(per_e);
        progressBar_i.setProgress(per_i);
        progressBar_s.setProgress(per_s);
        progressBar_n.setProgress(per_n);
        progressBar_t.setProgress(per_t);
        progressBar_f.setProgress(per_f);
        progressBar_j.setProgress(per_j);
        progressBar_p.setProgress(per_p);

        entp_result_return = findViewById(R.id.entp_result_return);
        entp_result_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(entp_res.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}