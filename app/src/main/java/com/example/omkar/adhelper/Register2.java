package com.example.omkar.adhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Register2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        Button B1 = (Button)findViewById(R.id.btnSignUp);
        Button B2 = (Button)findViewById(R.id.btnSingIn);
        B1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // use Intent

                Intent intent1= new Intent(Register2.this, Register3.class);
                startActivity(intent1);
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // use Intent

                Intent intent1= new Intent(Register2.this, Register.class);
                startActivity(intent1);
            }
        });
    }
}
