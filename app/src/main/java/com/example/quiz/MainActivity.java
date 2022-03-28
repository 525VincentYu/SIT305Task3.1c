package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    TextView input;
    public static String name;
    public static int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.buttonNew);
        button.setOnClickListener(new ButtonListener());
        input = (TextView)findViewById(R.id.editTextTextPersonName);

    }
    class ButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            name = input.getText().toString();
            Intent intent= new Intent();
            intent.setClass(MainActivity.this, SecondActivity.class);
            startActivity(intent);
            finish();

        }
    }
}