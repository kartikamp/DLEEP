package com.example.dleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandingActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button_landing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        button_landing = (Button) findViewById(R.id.button_landing);
        button_landing.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.button_landing) {
            Intent moveIntent = new Intent(LandingActivity.this, com.example.dleep.SecondLandingActivity.class);
            startActivity(moveIntent);
        }
}}