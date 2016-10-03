package com.nkp.quizApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class CheckMainActivity extends AppCompatActivity {

    CheckBox c1, c2, c3, c4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_main);
        Button next;
        next = (Button) findViewById(R.id.next_button);
        c1 = (CheckBox) findViewById(R.id.opt_1);
        c2 = (CheckBox) findViewById(R.id.opt_2);
        c3 = (CheckBox) findViewById(R.id.opt_3);
        c4 = (CheckBox) findViewById(R.id.opt_4);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c1.isChecked() && c2.isChecked() && !c3.isChecked() && !c3.isChecked()) {
                    MainActivity.score++;
                }
                startActivity(new Intent(getApplicationContext(), TextMainActivity.class));
                MainActivity.count = 2;
            }
        });
    }
}
