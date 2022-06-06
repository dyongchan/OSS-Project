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
import android.widget.Toast;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class testActivity extends Activity {

    int inspection_number = 1;
    int e_point, i_point, s_point, n_point, t_point, f_point, j_point, p_point = 0;
    double percent_e, percent_i, percent_s, percent_n, percent_t, percent_f, percent_j, percent_p;

    private Button test_btn_return;
    private Button test_btn_next; // 다음으로
    private RadioGroup Radio_group_ei, Radio_group_sn, Radio_group_tf, Radio_group_jp;
    /* 특성끼리의 라디오 그룹*/
    private RadioButton Radio_btn_e, Radio_btn_i, Radio_btn_s, Radio_btn_n, Radio_btn_t, Radio_btn_f, Radio_btn_j, Radio_btn_p;
    /* 각 특성에 해당하는 라디오버튼*/
    private TextView test_number_ei, test_number_sn, test_number_tf, test_number_jp; // 문제 상단 숫자
    private TextView test_progress_1, test_progress_2; // 진행도 1 = (1/8), 2 = (8/64)
    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;


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
        Radio_group_ei=findViewById(R.id.Radio_group_ei);
        Radio_group_sn=findViewById(R.id.Radio_group_sn);
        Radio_group_tf=findViewById(R.id.Radio_group_tf);
        Radio_group_jp=findViewById(R.id.Radio_group_jp);


        Radio_btn_e = (RadioButton) findViewById(R.id.Radio_btn_e);
        Radio_btn_i = (RadioButton) findViewById(R.id.Radio_btn_i);
        Radio_btn_s = (RadioButton) findViewById(R.id.Radio_btn_s);
        Radio_btn_n = (RadioButton) findViewById(R.id.Radio_btn_n);
        Radio_btn_t = (RadioButton) findViewById(R.id.Radio_btn_t);
        Radio_btn_f = (RadioButton) findViewById(R.id.Radio_btn_f);
        Radio_btn_p = (RadioButton) findViewById(R.id.Radio_btn_p);
        Radio_btn_j = (RadioButton) findViewById(R.id.Radio_btn_j);



        test_btn_next = findViewById(R.id.test_btn_next);
        test_btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int inspection_point = 0;//답하지 않은 문제가 있는지 확인(next누를때마다 0으로 초기화해서 4개안풀면 안넘어가고 Toast발생)

                if(Radio_btn_e.isChecked()){
                    e_point++;
                    inspection_point++;
                }
                if(Radio_btn_i.isChecked()){
                    i_point++;
                    inspection_point++;
                }
                if(Radio_btn_s.isChecked()){
                    s_point++;
                    inspection_point++;
                }
                if(Radio_btn_n.isChecked()){
                    n_point++;
                    inspection_point++;
                }
                if(Radio_btn_t.isChecked()){
                    t_point++;
                    inspection_point++;
                }
                if(Radio_btn_f.isChecked()){
                    f_point++;
                    inspection_point++;
                }
                if(Radio_btn_j.isChecked()){
                    j_point++;
                    inspection_point++;
                }
                if(Radio_btn_p.isChecked()){
                    p_point++;
                    inspection_point++;
                }

                if (inspection_point >=4 ){
                    inspection_number++;
                    next1();
                    Checkoff(); //다음으로 버튼 누르면 라디오버튼 체크가 해제
                }
                else{
                    Toast.makeText(getApplicationContext(), "답하지 않은 문제가 있습니다.", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    public void Checkoff(){
        Radio_group_ei.clearCheck();
        Radio_group_sn.clearCheck();
        Radio_group_tf.clearCheck();
        Radio_group_jp.clearCheck();
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
        TextView test_number_ei = (TextView)  findViewById(R.id.test_number_ei);
        TextView test_number_sn = (TextView)  findViewById(R.id.test_number_sn);
        TextView test_number_tf = (TextView)  findViewById(R.id.test_number_tf);
        TextView test_number_jp = (TextView)  findViewById(R.id.test_number_jp);
        TextView test_progress_1 = (TextView)  findViewById(R.id.test_progress_1);
        TextView test_progress_2 = (TextView)  findViewById(R.id.test_progress_2);



        if (inspection_number == 2) {
            test_progress_1.setText("2/8");
            test_progress_2.setText("16/64");
            test_number_ei.setText("⑤");
            test_number_sn.setText("⑥");
            test_number_tf.setText("⑦");
            test_number_jp.setText("⑧");
            answer_e.setText("여러 사람들 사이에 끼어\n함께 대화를 나누는 편이다.");
            answer_i.setText("한 번에 한 사람씩\n대화를 나누는편이다.");
            answer_s.setText("현실 감각이 있는 사람과 잘 어울린다.");
            answer_n.setText("상상력이 풍부한 사람과 잘 어울린다.");
            answer_t.setText("꾸준하고 합리적인\n사람으로 불리는게 더 좋다.");
            answer_f.setText("솔직하고 감정적인\n사람으로 불리는게 더 좋다.");
            answer_j.setText("모임을 미리 여유있게\n계획하는 편이다.");
            answer_p.setText("모임은 상황에 따라 별\n계획없이 자유로운 편이다.");
        }

        if (inspection_number == 3) {
            test_progress_1.setText("3/8");
            test_progress_2.setText("24/64");
            test_number_ei.setText("⑨");
            test_number_sn.setText("⑩");
            test_number_tf.setText("⑪");
            test_number_jp.setText("⑫");
            answer_e.setText("사람들이 많은 그룹 내에서\n다른 사람을 소개하는 편이다.");
            answer_i.setText("사람들이 많은 그룹 내에서\n다른 사람이 나를 소개하는 편이다");
            answer_s.setText("실제적이고 현실감각적인\n사람으로 인정받기를 원한다.");
            answer_n.setText("재능과 창의력이 있는\n사람으로 인정받기를 원한다.");
            answer_t.setText("평소에 감상보다는\n논리를 더 중요시 한다.");
            answer_f.setText("평소에 논리보다는\n감상을 더 중요시 한다.");
            answer_j.setText("치밀하게 짜여진 계획에\n따라 일을 더 잘 처리한다.");
            answer_p.setText("갑작스러운 업무나 일을\n신속하게  더 잘 처리한다.");
        }

        if (inspection_number == 4) {
            test_progress_1.setText("4/8");
            test_progress_2.setText("32/64");
            test_number_ei.setText("⑬");
            test_number_sn.setText("⑭");
            test_number_tf.setText("⑮");
            test_number_jp.setText("⑯");
            answer_e.setText("다양한 사람들과 폭\n넓은 우정을 맺는 편이다.");
            answer_i.setText("소수의 사람들과 깊은\n우정을 맺는 편이다.");
            answer_s.setText("보수적이고 남에게 드러나지\n않는 사람을 더 존경한다.");
            answer_n.setText("독창적,개성적이고 드러나는\n것에 개의치 않는 사람을 존경한다.");
            answer_t.setText("비합리적인 면이\n단점이라고 느낀다.");
            answer_f.setText("동정심이 없는 면이\n단점이라고 느낀다.");
            answer_j.setText("짜여진 시간표를 따르는 일이 좋다.");
            answer_p.setText("짜여진 시간표를 따르는\n일이 답답하게 느껴진다.");
        }

        if (inspection_number == 5) {
            test_progress_1.setText("5/8");
            test_progress_2.setText("40/64");
            test_number_ei.setText("⑰");
            test_number_sn.setText("⑱");
            test_number_tf.setText("⑲");
            test_number_jp.setText("⑳");
            answer_e.setText("많은 사람들에 대한\n소식에나 소문에 밝은 편이다.");
            answer_i.setText("소식이나 소문을 제일\n늦게 듣는 편이다.");
            answer_s.setText("현실감각이 있는 사람을\n친구로 사귀고 싶다.");
            answer_n.setText("새로운 아이디어를 자아내는\n사람을 친구로 사귀고 싶다.");
            answer_t.setText("언제나 공정한 사람\n밑에서 일하는 것이 좋다.");
            answer_f.setText("항상 친절한 사람\n밑에서 일하는 것이 좋다.");
            answer_j.setText("해야할 일 목록을 작성하는\n것에 대해 좋다고 생각한다.");
            answer_p.setText("해야할 일 목록을 작성하는\n것에 대해 별로 내키지 않는다.");

        }

        if (inspection_number == 6) {
            test_progress_1.setText("6/8");
            test_progress_2.setText("48/64");
            test_number_ei.setText("㉑");
            test_number_sn.setText("㉒");
            test_number_tf.setText("㉓");
            test_number_jp.setText("㉔");
            answer_e.setText("누구하고나 쉽게\n대화를 나누는 편이다.");
            answer_i.setText("일정한 사람이나 상황이 될 때\n얘기를 잘 나누는 편이다.");
            answer_s.setText("의도한 바를 정확히 표현하는\n작가를 좋아하는 편이다.");
            answer_n.setText("기묘하거나 독창적인\n작가의 표현을 즐기는 편이다.");
            answer_t.setText("지나친 온정을 보이는\n것이 단점이라고 생각한다.");
            answer_f.setText("적당한 온정을 보이지\n않는 것이 단점이라고 생각한다.");
            answer_j.setText("일상적인 일에 관해서\n별 부담없이 해나가는 편이다.");
            answer_p.setText("일상적인 일에 관해서 필요하지만\n매일 한다는 사실이 부담스럽다.");

        }

        if (inspection_number == 7) {
            test_progress_1.setText("7/8");
            test_progress_2.setText("56/64");
            test_number_ei.setText("㉕");
            test_number_sn.setText("㉖");
            test_number_tf.setText("㉗");
            test_number_jp.setText("㉘");
            answer_e.setText("새로운 유행이 시작될 때\n앞장서서 시도해보는 편이다.");
            answer_i.setText("새로운 유행이 시작될 때\n별 관심이 없는 편이다.");
            answer_s.setText("선익을 위해서 만들어진\n기존 체제방식을 지지하는 편이다.");
            answer_n.setText("기존 방식의 잘못을 분석하고\n해결하려 도전하는 편이다.");
            answer_t.setText("나는 분석하는 일에 관심이 있다.");
            answer_f.setText("나는 공감하는 일에 관심이 있다.");
            answer_j.setText("사소한 일이 있을 때 기억하기\n위해 메모지에 적어 두는 편이다.");
            answer_p.setText("사소한 일이 있을 때 자주 잊고\n있다가 나중에야 기억하는 편이다.");

        }

        if (inspection_number == 8) {
            test_progress_1.setText("8/8");
            test_progress_2.setText("64/64");
            test_number_ei.setText("㉗");
            test_number_sn.setText("㉘");
            test_number_tf.setText("㉙");
            test_number_jp.setText("㉚");
            answer_e.setText("나는 다른 사람들과\n쉽게 사귈 수 있는 편이다.");
            answer_i.setText("나는 다른 사람들과\n쉽게 사귀기 어려운 편이다.");
            answer_s.setText("나는 현실에 초점을 맞추는 편이다.");
            answer_n.setText("나는 이념에 초점을 맞추는 편이다.");
            answer_t.setText("나는 정의로운 편이다.");
            answer_f.setText("나는 자비로운 편이다.");
            answer_j.setText("계속적인 변화보다 틀에 박힌\n일상적인 일에 더 적응하기 어렵다.");
            answer_p.setText("일상적인 일보다 계속적인\n변화하는 일에 더 적응하기 어렵다.");
            test_btn_next.setText("결과보기");

        }
        if (inspection_number == 9) {
            inspection_result();

        }
    }

    public void inspection_result() {
        String result_four_property;
        String first, second, third, fourth;

        if (e_point >= 5) {
            first = "e";
            percent_e = e_point * 12.5;
            percent_i = 100 - percent_e;
        } else {
            first = "i";
            percent_i = i_point * 12.5;
            percent_e = 100 - percent_i;
        }

        if (s_point >= 5) {
            second= "s";
            percent_s = s_point * 12.5;
            percent_n = 100 - percent_s;
        } else {
            second = "n";
            percent_n = n_point * 12.5;
            percent_s = 100 - percent_n;
        }

        if (t_point >= 5) {
            third = "t";
            percent_t = t_point * 12.5;
            percent_f = 100 - percent_t;
        } else {
            third= "f";
            percent_f = f_point * 12.5;
            percent_t = 100 - percent_f;
        }

        if (j_point >= 5) {
            fourth = "j";
            percent_j = j_point * 12.5;
            percent_p = 100 - percent_j;
        } else {
            fourth= "p";
            percent_p = p_point * 12.5;
            percent_j = 100 - percent_p;
        }

        result_four_property = first + second + third + fourth;
        intent_mbti(result_four_property, percent_e,percent_i,percent_s,percent_n,percent_t,percent_f,percent_j,percent_p);
        //Toast toast = Toast.makeText(this.getApplicationContext(), result_four_property,Toast.LENGTH_SHORT);
        //toast.show(); 정상적인 출력이 되는 지 확인을 위한 Toast message
    }


    public void intent_mbti(String result_four_property, double percent_e, double percent_i, double percent_s, double percent_n, double percent_t, double percent_f,double percent_j, double percent_p) {
        if (result_four_property.equals("istp")) {
            Intent intent = new Intent(getApplicationContext(), istp_res.class);
            intent.putExtra("percent_e",percent_e);
            intent.putExtra("percent_i",percent_i);
            intent.putExtra("percent_s",percent_s);
            intent.putExtra("percent_n",percent_n);
            intent.putExtra("percent_t",percent_t);
            intent.putExtra("percent_f",percent_f);
            intent.putExtra("percent_j",percent_j);
            intent.putExtra("percent_p",percent_p);
            startActivity(intent);
        }

        if (result_four_property.equals("istj")) {
            Intent intent = new Intent(getApplicationContext(), istj_res.class);
            intent.putExtra("percent_e",percent_e);
            intent.putExtra("percent_i",percent_i);
            intent.putExtra("percent_s",percent_s);
            intent.putExtra("percent_n",percent_n);
            intent.putExtra("percent_t",percent_t);
            intent.putExtra("percent_f",percent_f);
            intent.putExtra("percent_j",percent_j);
            intent.putExtra("percent_p",percent_p);
            startActivity(intent);
        }

        if (result_four_property.equals("isfp")) {
            Intent intent = new Intent(getApplicationContext(), isfp_res.class);
            intent.putExtra("percent_e",percent_e);
            intent.putExtra("percent_i",percent_i);
            intent.putExtra("percent_s",percent_s);
            intent.putExtra("percent_n",percent_n);
            intent.putExtra("percent_t",percent_t);
            intent.putExtra("percent_f",percent_f);
            intent.putExtra("percent_j",percent_j);
            intent.putExtra("percent_p",percent_p);
            startActivity(intent);
        }

        if (result_four_property.equals("isfj")) {
            Intent intent = new Intent(getApplicationContext(), isfj_res.class);
            intent.putExtra("percent_e",percent_e);
            intent.putExtra("percent_i",percent_i);
            intent.putExtra("percent_s",percent_s);
            intent.putExtra("percent_n",percent_n);
            intent.putExtra("percent_t",percent_t);
            intent.putExtra("percent_f",percent_f);
            intent.putExtra("percent_j",percent_j);
            intent.putExtra("percent_p",percent_p);
            startActivity(intent);
        }

        if (result_four_property.equals("intp")) {
            Intent intent = new Intent(getApplicationContext(), intp_res.class);
            intent.putExtra("percent_e",percent_e);
            intent.putExtra("percent_i",percent_i);
            intent.putExtra("percent_s",percent_s);
            intent.putExtra("percent_n",percent_n);
            intent.putExtra("percent_t",percent_t);
            intent.putExtra("percent_f",percent_f);
            intent.putExtra("percent_j",percent_j);
            intent.putExtra("percent_p",percent_p);
            startActivity(intent);
        }

        if (result_four_property.equals("intj")) {
            Intent intent = new Intent(getApplicationContext(), intj_res.class);
            intent.putExtra("percent_e",percent_e);
            intent.putExtra("percent_i",percent_i);
            intent.putExtra("percent_s",percent_s);
            intent.putExtra("percent_n",percent_n);
            intent.putExtra("percent_t",percent_t);
            intent.putExtra("percent_f",percent_f);
            intent.putExtra("percent_j",percent_j);
            intent.putExtra("percent_p",percent_p);
            startActivity(intent);
        }

        if (result_four_property.equals("infp")) {
            Intent intent = new Intent(getApplicationContext(), infp_res.class);
            intent.putExtra("percent_e",percent_e);
            intent.putExtra("percent_i",percent_i);
            intent.putExtra("percent_s",percent_s);
            intent.putExtra("percent_n",percent_n);
            intent.putExtra("percent_t",percent_t);
            intent.putExtra("percent_f",percent_f);
            intent.putExtra("percent_j",percent_j);
            intent.putExtra("percent_p",percent_p);
            startActivity(intent);
        }

        if (result_four_property.equals("infj")) {
            Intent intent = new Intent(getApplicationContext(), infj_res.class);
            intent.putExtra("percent_e",percent_e);
            intent.putExtra("percent_i",percent_i);
            intent.putExtra("percent_s",percent_s);
            intent.putExtra("percent_n",percent_n);
            intent.putExtra("percent_t",percent_t);
            intent.putExtra("percent_f",percent_f);
            intent.putExtra("percent_j",percent_j);
            intent.putExtra("percent_p",percent_p);
            startActivity(intent);
        }

        if (result_four_property.equals("estp")) {
            Intent intent = new Intent(getApplicationContext(), estp_res.class);
            intent.putExtra("percent_e",percent_e);
            intent.putExtra("percent_i",percent_i);
            intent.putExtra("percent_s",percent_s);
            intent.putExtra("percent_n",percent_n);
            intent.putExtra("percent_t",percent_t);
            intent.putExtra("percent_f",percent_f);
            intent.putExtra("percent_j",percent_j);
            intent.putExtra("percent_p",percent_p);
            startActivity(intent);
        }

        if (result_four_property.equals("estj")) {
            Intent intent = new Intent(getApplicationContext(), estj_res.class);
            intent.putExtra("percent_e",percent_e);
            intent.putExtra("percent_i",percent_i);
            intent.putExtra("percent_s",percent_s);
            intent.putExtra("percent_n",percent_n);
            intent.putExtra("percent_t",percent_t);
            intent.putExtra("percent_f",percent_f);
            intent.putExtra("percent_j",percent_j);
            intent.putExtra("percent_p",percent_p);
            startActivity(intent);
        }

        if (result_four_property.equals("esfp")) {
            Intent intent = new Intent(getApplicationContext(), esfp_res.class);
            intent.putExtra("percent_e",percent_e);
            intent.putExtra("percent_i",percent_i);
            intent.putExtra("percent_s",percent_s);
            intent.putExtra("percent_n",percent_n);
            intent.putExtra("percent_t",percent_t);
            intent.putExtra("percent_f",percent_f);
            intent.putExtra("percent_j",percent_j);
            intent.putExtra("percent_p",percent_p);
            startActivity(intent);
        }

        if (result_four_property.equals("esfj")) {
            Intent intent = new Intent(getApplicationContext(), esfj_res.class);
            intent.putExtra("percent_e",percent_e);
            intent.putExtra("percent_i",percent_i);
            intent.putExtra("percent_s",percent_s);
            intent.putExtra("percent_n",percent_n);
            intent.putExtra("percent_t",percent_t);
            intent.putExtra("percent_f",percent_f);
            intent.putExtra("percent_j",percent_j);
            intent.putExtra("percent_p",percent_p);
            startActivity(intent);
        }

        if (result_four_property.equals("entp")) {
            Intent intent = new Intent(getApplicationContext(), entp_res.class);
            intent.putExtra("percent_e",percent_e);
            intent.putExtra("percent_i",percent_i);
            intent.putExtra("percent_s",percent_s);
            intent.putExtra("percent_n",percent_n);
            intent.putExtra("percent_t",percent_t);
            intent.putExtra("percent_f",percent_f);
            intent.putExtra("percent_j",percent_j);
            intent.putExtra("percent_p",percent_p);
            startActivity(intent);
        }

        if (result_four_property.equals("entj")) {
            Intent intent = new Intent(getApplicationContext(), entj_res.class);
            intent.putExtra("percent_e",percent_e);
            intent.putExtra("percent_i",percent_i);
            intent.putExtra("percent_s",percent_s);
            intent.putExtra("percent_n",percent_n);
            intent.putExtra("percent_t",percent_t);
            intent.putExtra("percent_f",percent_f);
            intent.putExtra("percent_j",percent_j);
            intent.putExtra("percent_p",percent_p);
            startActivity(intent);
        }

        if (result_four_property.equals("enfp")) {
            Intent intent = new Intent(getApplicationContext(), enfp_res.class);
            intent.putExtra("percent_e",percent_e);
            intent.putExtra("percent_i",percent_i);
            intent.putExtra("percent_s",percent_s);
            intent.putExtra("percent_n",percent_n);
            intent.putExtra("percent_t",percent_t);
            intent.putExtra("percent_f",percent_f);
            intent.putExtra("percent_j",percent_j);
            intent.putExtra("percent_p",percent_p);
            startActivity(intent);
        }

        if (result_four_property.equals("enfj")) {
            Intent intent = new Intent(getApplicationContext(), enfj_res.class);
            intent.putExtra("percent_e",percent_e);
            intent.putExtra("percent_i",percent_i);
            intent.putExtra("percent_s",percent_s);
            intent.putExtra("percent_n",percent_n);
            intent.putExtra("percent_t",percent_t);
            intent.putExtra("percent_f",percent_f);
            intent.putExtra("percent_j",percent_j);
            intent.putExtra("percent_p",percent_p);
            startActivity(intent);
        }

    }

}