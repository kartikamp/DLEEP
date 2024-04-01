package com.example.dleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ServiceGuideActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView backarrowGuide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_guide);

        backarrowGuide = (ImageView) findViewById(R.id.backarrowGuide);
        backarrowGuide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.backarrowGuide) {
            finish();
        }
    }

}