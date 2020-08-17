package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity<lasts, message> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        final EditText numberone = (EditText) findViewById(R.id.editTextTextPersonName);
        final EditText numbertwo = (EditText) findViewById(R.id.editTextTextPersonName2);

        final Button submitbutton = (Button) findViewById(R.id.button);
        submitbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
                CharSequence message = "You just clicked the OK button";
                //Display string
                int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

                final String noone = numberone.getText().toString();
                final String notwo = numbertwo.getText().toString();

                Intent activityIntent = new Intent(FirstActivity.this, SecondActivity.class);
                activityIntent.putExtra("numberOne", noone);
                activityIntent.putExtra("numberTwo", notwo);
                FirstActivity.this.startActivity(activityIntent);
            }
        });


    }
}