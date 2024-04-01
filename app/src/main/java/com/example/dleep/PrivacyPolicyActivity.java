package com.example.dleep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PrivacyPolicyActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView backarrowPriv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);

        backarrowPriv = (ImageView) findViewById(R.id.backarrowPriv);
        backarrowPriv.setOnClickListener(this);
    }

    @Override
    public void onClick (View v){
        int id = v.getId();

        if(id == R.id.backarrowPriv){
            finish();
        }
    }
}