package com.example.rahul.calculater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etext, etext2, answer;
    TextView tview, tview2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tview = (TextView)findViewById(R.id.textView);
        tview2 = (TextView)findViewById(R.id.textView2);
        etext = (EditText)findViewById(R.id.editText);
        etext2 = (EditText)findViewById(R.id.editText2);
        button = (Button)findViewById(R.id.btn);
        answer = (EditText)findViewById(R.id.ans);

        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b;
                a = Double.parseDouble(etext.getText().toString());
                b = Double.parseDouble(etext2.getText().toString());
                double c =a+b;
                answer.setText(Double.toString(c));
            }
        }));



    }
}
