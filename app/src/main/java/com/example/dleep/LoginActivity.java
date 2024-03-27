package com.example.dleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textViewSignUp;
    private Button buttonLogin2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textViewSignUp = (TextView) findViewById(R.id.textViewSignUp);
        textViewSignUp.setOnClickListener(this);

        buttonLogin2 = (Button) findViewById(R.id.buttonLogin2);
        buttonLogin2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.textViewSignUp) {
            Intent moveIntent = new Intent(LoginActivity.this, RegistrasiActivity.class);
            startActivity(moveIntent);
        } else if (id == R.id.buttonLogin2) {
            Intent moveIntent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(moveIntent);
        }

    }
}

