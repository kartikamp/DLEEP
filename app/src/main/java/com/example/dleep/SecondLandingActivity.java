package com.example.dleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondLandingActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonLogin;
    private Button buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_landing);

        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(this);
        buttonSignUp = (Button) findViewById(R.id.buttonSignUp);
        buttonSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.buttonLogin) {
            Intent moveIntent = new Intent(SecondLandingActivity.this, LoginActivity.class);
            startActivity(moveIntent);
        } else if (id == R.id.buttonSignUp){
            Intent moveIntent = new Intent(SecondLandingActivity.this, RegistrasiActivity.class);
            startActivity(moveIntent);
        }
}}