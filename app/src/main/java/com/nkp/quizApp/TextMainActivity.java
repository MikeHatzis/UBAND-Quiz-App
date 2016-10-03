package com.nkp.quizApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TextMainActivity extends AppCompatActivity {


    EditText et_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_main);
        Button next;
        next = (Button) findViewById(R.id.next_button);
        et_answer = (EditText) findViewById(R.id.opt_1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_answer.getText().toString().equalsIgnoreCase(new String("Form"))) {
                    MainActivity.score++;
                }
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                MainActivity.count = 3;
            }
        });
    }
}
