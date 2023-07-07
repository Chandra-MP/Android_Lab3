package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
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


        ImageView instagramBtn = findViewById(R.id.imageView7);
        ImageView gitBtn = findViewById(R.id.imageView6);
        ImageView linkBtn = findViewById(R.id.imageView8);

        instagramBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.instagram.com/idk_nd_idc_2/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        gitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlGit = "https://github.com/Chandra-MP";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlGit));
                startActivity(intent);
            }
        });

        linkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlLink = "https://www.linkedin.com/in/chandra-mani-pandey-ba994513a/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlLink));
                startActivity(intent);
            }
        });



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