package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActicity extends SecondActivity {

    TextView welcome;
    TextView error;
    private Button but1;
    private Button but2;
    private Button but3;
    private Button butsub;
    private int res = 0;
    public static int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acticity_third);
        welcome = (TextView) findViewById(R.id.textViewWel);
        error = (TextView)findViewById(R.id.textViewError) ;
        welcome.setText("Wellcome  " + name);
        but1 = findViewById(R.id.button1);
        but2 = findViewById(R.id.button2);
        but3 = findViewById(R.id.button3);
        butsub = findViewById(R.id.buttonsub);
        but1.setOnClickListener(new ThirdActicity.MyonClickListener());
        but2.setOnClickListener(new ThirdActicity.MyonClickListener());
        but3.setOnClickListener(new ThirdActicity.MyonClickListener());
        butsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag == 0&&res == 0){
                    error.setText("You haven't chosen the answer yet");

                }
                else if (flag == 0 && res == 1) {
                    but1.setBackground(getResources().getDrawable(R.drawable.shape2));
                    but2.setBackground(getResources().getDrawable(R.drawable.shape3));
                    flag = 1;
                    butsub.setText("Next");
                    welcome.setText(null);
                }
                else if (flag == 0 && res == 2) {

                    but2.setBackground(getResources().getDrawable(R.drawable.shape3));
                    score +=1;
                    flag = 1;
                    butsub.setText("Next");
                    welcome.setText(null);
                }
                else if (flag == 0 && res == 3) {
                    but3.setBackground(getResources().getDrawable(R.drawable.shape2));
                    but2.setBackground(getResources().getDrawable(R.drawable.shape3));
                    flag = 1;
                    butsub.setText("Next");
                    welcome.setText(null);
                }
                /*else {butsub.setText("ggg");
                    Intent intent= new Intent();
                    intent.setClass(ThirdActicity.this, FourthActicity.class);
                    startActivity(intent);

                }*/
                else{
                    flag = 0 ;
                    Intent intent= new Intent();
                    intent.setClass(ThirdActicity.this ,FourthActicity.class);
                    startActivity(intent);
                    finish();

                }
            }
        });
    }

    class MyonClickListener implements View.OnClickListener {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button1:
                        res = 1;
                        break;
                    case R.id.button2:
                        res = 2;

                        break;
                    case R.id.button3:
                        res = 3;
                        break;
                }
            }
        }

    }


