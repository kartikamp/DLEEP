package com.example.dleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class VerifCodeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonVerify;
    private ImageView backarrowVerif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verif_code);

        buttonVerify = (Button) findViewById(R.id.buttonVerify);
        buttonVerify.setOnClickListener(this);

        backarrowVerif = (ImageView) findViewById(R.id.backarrowVerif);
        backarrowVerif.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.buttonVerify) {
            Intent moveIntent = new Intent(VerifCodeActivity.this, com.example.dleep.UpdatePasswordActivity.class);
            startActivity(moveIntent);
        } else if (id == R.id.backarrowVerif){
            finish();
        }
    }
}