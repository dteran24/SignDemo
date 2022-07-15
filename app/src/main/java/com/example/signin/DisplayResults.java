package com.example.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.security.Key;

public class DisplayResults extends AppCompatActivity {
    private TextView displayText;

    Intent intent = getIntent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_results);

        displayText = (TextView) findViewById(R.id.displayText);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.NAME);
        String gender = intent.getStringExtra(MainActivity.GENDER);
        String food = intent.getStringExtra(MainActivity.FOOD);

        displayText.setText("The Name is " + name + " and \nI am a "+ gender + "I like to eat "+food);



    }
}