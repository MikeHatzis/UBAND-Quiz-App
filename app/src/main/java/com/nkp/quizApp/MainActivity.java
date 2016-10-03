package com.nkp.quizApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static int count = 1;
    public static int score = 0;
    RadioButton o1, o2, o3, o4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final Button next;
        next = (Button) findViewById(R.id.next_button);
        o1 = (RadioButton) findViewById(R.id.opt_1);
        o2 = (RadioButton) findViewById(R.id.opt_2);
        o3 = (RadioButton) findViewById(R.id.opt_3);
        o4 = (RadioButton) findViewById(R.id.opt_4);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (o1.isChecked()) {
                    MainActivity.score++;
                }
                startActivity(new Intent(getApplicationContext(), CheckMainActivity.class));
                MainActivity.count = 1;
            }
        });
        if (count == 3) {
            TextView tv_que = (TextView) findViewById(R.id.question);
            //RadioButton o1, o2, o3, o4;
            o1 = (RadioButton) findViewById(R.id.opt_1);
            o2 = (RadioButton) findViewById(R.id.opt_2);
            o3 = (RadioButton) findViewById(R.id.opt_3);
            o4 = (RadioButton) findViewById(R.id.opt_4);
            tv_que.setText(getResources().getText(R.string.q4));
            o1.setText("CSS");
            o2.setText("JavaScript");
            o3.setText("nodeJS");
            o4.setText("C++");
            next.setText("Finish");
            next.setBackgroundResource(R.drawable.right_corners);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (o1.isChecked()) {
                        MainActivity.score = MainActivity.score + 2;
                    }
                    Toast.makeText(getApplicationContext(), "Score:" + score, Toast.LENGTH_LONG).show();
                    next.setOnClickListener(null);
                }
            });
        }
    }
}
