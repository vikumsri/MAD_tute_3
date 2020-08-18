package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater li = getLayoutInflater();
        final View layout = li.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custome_toast_layout));


        Button btn = (Button) findViewById(R.id.okbtn);
        final TextView number1 = findViewById(R.id.Number1);
        final TextView number2 = findViewById(R.id.Number2);
        final EditText numbertxt = (EditText)findViewById(R.id.NumberText);
        final EditText number2txt = (EditText)findViewById(R.id.Number2text);

        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {

                                       Context context = getApplicationContext();

                                       CharSequence message = "You Just Clicked The Ok Button";

                                       int duration = Toast.LENGTH_SHORT;

                                       Toast toast = Toast.makeText(context, message, duration);


                                       toast.setGravity(Gravity.CENTER_VERTICAL,0, 0);

                                       toast.setView(layout);

                                       toast.show();

                                        String str1 = numbertxt.getText().toString();
                                        String str2 = number2txt.getText().toString();

                                       Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                                       intent.putExtra("Number1_msg",str1);
                                       intent.putExtra("Number2_msg",str2);
                                       startActivity(intent);

                                   }
                               }

        );


    }
}