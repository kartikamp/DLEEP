package com.example.dleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class UpdatePasswordActivity extends AppCompatActivity implements View.OnClickListener  {

    private Button buttonSubmit2;
    private ImageView backarrowUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_password);

        buttonSubmit2 = (Button) findViewById(R.id.buttonSubmit2);
        buttonSubmit2.setOnClickListener(this);

        backarrowUpdate = (ImageView) findViewById(R.id.backarrowUpdate);
        backarrowUpdate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.buttonSubmit2) {
            Intent moveIntent = new Intent(UpdatePasswordActivity.this, com.example.dleep.LoginActivity.class);
            startActivity(moveIntent);
        } else if(id == R.id.backarrowUpdate){
            finish();
        }
    }
}