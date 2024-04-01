package com.example.dleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ForgotPasswordActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonSubmit1;
    private ImageView backarrowForgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        buttonSubmit1 = (Button) findViewById(R.id.buttonSubmit1);
        buttonSubmit1.setOnClickListener(this);

        backarrowForgot = (ImageView) findViewById(R.id.backarrowForgot);
        backarrowForgot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.buttonSubmit1) {
            Intent moveIntent = new Intent(ForgotPasswordActivity.this, com.example.dleep.VerifCodeActivity.class);
            startActivity(moveIntent);
        } else if(id == R.id.backarrowForgot){
            finish();
        }
    }
}