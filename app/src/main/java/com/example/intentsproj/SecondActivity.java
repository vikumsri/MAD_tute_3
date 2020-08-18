package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final TextView result = findViewById(R.id.equation);
        final EditText number1 = findViewById(R.id.NumberText);
        final EditText number2 = findViewById(R.id.Number2text);
        Button plusbtn = (Button) findViewById(R.id.Plusbtn);
        Button minbtn = (Button) findViewById(R.id.Minbtn);
        Button multibtn = (Button) findViewById(R.id.Multibtn);
        Button divbtn = (Button) findViewById(R.id.divbtn);

        Intent intent = getIntent();

        String str1 = intent.getStringExtra("Number1_msg");
        String str2 = intent.getStringExtra("Number2_msg");

        number1.setText(str1);
        number2.setText(str2);

        plusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int eqresult = Integer.parseInt(number1.getText().toString()) + Integer.parseInt(number2.getText().toString());
                String strResult = String.valueOf(eqresult);
                result.setText(strResult);
            }

            });

        minbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int eqresult = Integer.parseInt(number1.getText().toString()) - Integer.parseInt(number2.getText().toString());
                String strResult = String.valueOf(eqresult);
                result.setText(strResult);
            }

        });

        multibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int eqresult = Integer.parseInt(number1.getText().toString()) * Integer.parseInt(number2.getText().toString());
                String strResult = String.valueOf(eqresult);
                result.setText(strResult);
            }

        });

        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float eqresult = Float.parseFloat(number1.getText().toString()) / Float.parseFloat(number2.getText().toString());
                String strResult = String.valueOf(eqresult);
                result.setText(strResult);
            }

        });
        }
}