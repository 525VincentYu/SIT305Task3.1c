package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScoreActivity extends SixthActivity {
    TextView con;
    TextView _score;
    Button but1;
    Button but2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        con = (TextView) findViewById(R.id.textViewName);
        _score = (TextView) findViewById(R.id.textViewScore);
        but1 = (Button) findViewById(R.id.buttonNew);
        but2 = (Button) findViewById(R.id.buttonFinish);
        con.setText("Congrutulations  " + name+"!");
        _score.setText(score + "/5");
        but1.setOnClickListener(new MyonClickListener());
        but2.setOnClickListener(new MyonClickListener());


    }
    class MyonClickListener implements View.OnClickListener {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.buttonNew:
                    Intent intent= new Intent();
                    intent.setClass(ScoreActivity.this, SecondActivity.class);
                    startActivity(intent);
                    break;
                case R.id.buttonFinish:
                    finish();
                    break;
            }
        }
    }
}