package com.example.exercise_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    int x,y,ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button plusBtn = (Button) findViewById(R.id.plus);
        Button minusBtn = (Button)findViewById(R.id.minus);
        Button productBtn = (Button)findViewById(R.id.product);
        Button quotientBtn = (Button)findViewById(R.id.quotient);
        TextView answer = (TextView) findViewById(R.id.answer);
        EditText n1 = (EditText) findViewById(R.id.n1);
        EditText n2 = (EditText) findViewById(R.id.n2);
        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=Integer.parseInt(n1.getText().toString());
                y=Integer.parseInt(n2.getText().toString());
                ans =x+y;
                answer.setText(ans +" ");
            }
        });
        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=Integer.parseInt(n1.getText().toString());
                y=Integer.parseInt(n2.getText().toString());
                ans =x-y;
                answer.setText(ans +" ");
            }
        });
        productBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=Integer.parseInt(n1.getText().toString());
                y=Integer.parseInt(n2.getText().toString());
                ans =x*y;
                answer.setText(ans +" ");
            }
        });
        quotientBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=Integer.parseInt(n1.getText().toString());
                y=Integer.parseInt(n2.getText().toString());
                ans =x/y;
                answer.setText(ans +" ");
            }
        });
    }
}
