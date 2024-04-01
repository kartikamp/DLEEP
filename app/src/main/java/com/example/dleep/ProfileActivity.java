package com.example.dleep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    private Button editprof;
    private TextView profsg;
    private TextView profpp;
    private ImageButton homefootbar;
    private ImageButton discoverfootbar;
    private ImageButton alarmfootbar;
    private ImageButton profilefootbar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        homefootbar = (android.widget.ImageButton) findViewById(R.id.homefootbar);
        homefootbar.setOnClickListener(this);

        discoverfootbar = (android.widget.ImageButton) findViewById(R.id.discoverfootbar);
        discoverfootbar.setOnClickListener(this);

        alarmfootbar = (android.widget.ImageButton) findViewById(R.id.alarmfootbar);
        alarmfootbar.setOnClickListener(this);

        profilefootbar = (android.widget.ImageButton) findViewById(R.id.profilefootbar);
        profilefootbar.setOnClickListener(this);

        editprof = (Button) findViewById(R.id.editprof);
        editprof.setOnClickListener(this);

        profsg = (TextView) findViewById(R.id.profsg);
        profsg.setOnClickListener(this);

        profpp = (TextView) findViewById(R.id.profpp);
        profpp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();


        if (id == R.id.homefootbar) {
            Intent moveIntent = new Intent(ProfileActivity.this, com.example.dleep.MainActivity.class);
            startActivity(moveIntent);
        } else if (id == R.id.discoverfootbar) {
            Intent moveIntent = new Intent(ProfileActivity.this, com.example.dleep.DiscoverActivity.class);
            startActivity(moveIntent);
        } else if (id == R.id.alarmfootbar) {
            Intent moveIntent = new Intent(ProfileActivity.this, com.example.dleep.discvStoriesUnplayedActivity.class);
            startActivity(moveIntent);
        } else if (id == R.id.profilefootbar) {
            Intent moveIntent = new Intent(ProfileActivity.this, com.example.dleep.ProfileActivity.class);
            startActivity(moveIntent);

        } else if (id == R.id.editprof) {
            Intent moveIntent = new Intent(ProfileActivity.this, com.example.dleep.EditProfileActivity.class);
            startActivity(moveIntent);
        } else if (id == R.id.profsg) {
            Intent moveIntent = new Intent(ProfileActivity.this, com.example.dleep.ServiceGuideActivity.class);
            startActivity(moveIntent);
        } else if (id == R.id.profpp) {
            Intent moveIntent = new Intent(ProfileActivity.this, com.example.dleep.PrivacyPolicyActivity.class);
            startActivity(moveIntent);
        }
    }
}