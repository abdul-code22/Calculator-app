package com.example.appdev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView answer;
    Button addButton,minusButton,multipButton,divideButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        answer=findViewById(R.id.answer);
        addButton=findViewById(R.id.addButton);
        minusButton=findViewById(R.id.minusButton);
        multipButton=findViewById(R.id.multipButton);
        divideButton=findViewById(R.id.divideButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1,val2,ans;
                val1=Integer.parseInt(num1.getText().toString());
                val2=Integer.parseInt(num2.getText().toString());

                ans= val1+val2;

                answer.setText("Answer is "+ans);
            }


        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1,val2,ans;
                val1=Integer.parseInt(num1.getText().toString());
                val2=Integer.parseInt(num2.getText().toString());

                ans= val1-val2;

                answer.setText("Answer is "+ans);
            }


        });

        multipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1,val2,ans;
                val1=Integer.parseInt(num1.getText().toString());
                val2=Integer.parseInt(num2.getText().toString());

                ans= val1*val2;

                answer.setText("Answer is "+ans);
            }


        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1,val2,ans;
                val1=Integer.parseInt(num1.getText().toString());
                val2=Integer.parseInt(num2.getText().toString());

                ans= val1/val2;

                answer.setText("Answer is "+ans);
            }


        });
    }
}