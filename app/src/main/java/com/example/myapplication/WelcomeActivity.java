package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");

        //Welcome text view
        TextView txtview = findViewById(R.id.text_welcome);
        txtview.setText("Welcome to this App " + name);

        //Your Details
        //Email
        TextView txtViewEmail = findViewById(R.id.textViewEmail);
        txtViewEmail.setText("Your Email is: " + email);
        //Phone
        TextView txtViewPhone = findViewById(R.id.textViewPhone);
        txtViewPhone.setText("Your Phone is: " + phone);

        //Exit Button
        Button exit = findViewById(R.id.button2);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             finish();
            }
        });
    }
}