package com.example.dleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textViewForgotPw;
    private TextView textViewSignUp;
    private Button buttonLogin2;
    private ImageView backarrowLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textViewForgotPw = (TextView) findViewById(R.id.textViewForgotPw);
        textViewForgotPw.setOnClickListener(this);

        textViewSignUp = (TextView) findViewById(R.id.textViewSignUp);
        textViewSignUp.setOnClickListener(this);

        buttonLogin2 = (Button) findViewById(R.id.buttonLogin2);
        buttonLogin2.setOnClickListener(this);

        backarrowLogin = (ImageView) findViewById(R.id.backarrowLogin);
        backarrowLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.textViewForgotPw) {
            Intent moveIntent = new Intent(LoginActivity.this, com.example.dleep.ForgotPasswordActivity.class);
            startActivity(moveIntent);
        } else if (id == R.id.textViewSignUp) {
            Intent moveIntent = new Intent(LoginActivity.this, com.example.dleep.RegistrasiActivity.class);
            startActivity(moveIntent);
        } else if (id == R.id.buttonLogin2) {
            Intent moveIntent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(moveIntent);
        } else if (id == R.id.backarrowLogin) {
            finish();
        }
    }
}