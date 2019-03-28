package com.example.omkar.adhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        ImageButton B1 = (ImageButton)findViewById(R.id.ibb);
        ImageButton B2 = (ImageButton)findViewById(R.id.imageButton2);
        ImageButton B3 = (ImageButton)findViewById(R.id.imageButton3);
        B1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // use Intent

                Intent intent1= new Intent(Home.this, Wsite.class);
                startActivity(intent1);
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // use Intent

                Intent intent1= new Intent(Home.this, Banners.class);
                startActivity(intent1);
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // use Intent

                Intent intent1= new Intent(Home.this, Register2.class);
                startActivity(intent1);
    }
});}}
