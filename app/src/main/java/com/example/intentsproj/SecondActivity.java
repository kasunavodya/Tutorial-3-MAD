package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final EditText numberone = (EditText) findViewById(R.id.editTextTextPersonName);
        final EditText numbertwo = (EditText) findViewById(R.id.editTextTextPersonName2);

        final TextView tv = (TextView) findViewById(R.id.textView4);

        final Button additionbutton = (Button) findViewById(R.id.button);
        final Button subtractionbutton = (Button) findViewById(R.id.button2);
        final Button multiplicationbutton = (Button) findViewById(R.id.button3);
        final Button devisionbutton = (Button) findViewById(R.id.button4);

        final String noone = getIntent().getStringExtra("numberOne");
        final String notwo = getIntent().getStringExtra("numberTwo");

        numberone.setText(noone);
        numbertwo.setText(notwo);

        additionbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Integer number1 = Integer.parseInt(numberone.getText().toString());
                Integer number2 = Integer.parseInt(numbertwo.getText().toString());

                Integer add = number1 + number2;
                tv.setText(String.format("%s + %s = %s", number1.toString(), number2.toString(), add.toString()));
            }
        });

        subtractionbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Integer number1 = Integer.parseInt(numberone.getText().toString());
                Integer number2 = Integer.parseInt(numbertwo.getText().toString());

                Integer sub = number1 - number2;
                tv.setText(String.format("%s - %s = %s", number1.toString(), number2.toString(), sub.toString()));
            }
        });

        multiplicationbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Integer number1 = Integer.parseInt(numberone.getText().toString());
                Integer number2 = Integer.parseInt(numbertwo.getText().toString());

                Integer mul = number1 * number2;
                tv.setText(String.format("%s * %s = %s", number1.toString(), number2.toString(), mul.toString()));
            }
        });

        devisionbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Integer number1 = Integer.parseInt(numberone.getText().toString());
                Integer number2 = Integer.parseInt(numbertwo.getText().toString());

                Integer div = number1 / number2;
                tv.setText(String.format("%s / %s = %s", number1.toString(), number2.toString(), div.toString()));
            }
        });


    }
}