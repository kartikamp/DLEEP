package com.example.dleep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton homefootbar;
    private ImageButton discoverfootbar;
    private ImageButton alarmfootbar;
    private ImageButton profilefootbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homefootbar = (android.widget.ImageButton) findViewById(R.id.homefootbar);
        homefootbar.setOnClickListener(this);

        discoverfootbar = (android.widget.ImageButton) findViewById(R.id.discoverfootbar);
        discoverfootbar.setOnClickListener(this);

        alarmfootbar = (android.widget.ImageButton) findViewById(R.id.alarmfootbar);
        alarmfootbar.setOnClickListener(this);

        profilefootbar = (android.widget.ImageButton) findViewById(R.id.profilefootbar);
        profilefootbar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.homefootbar) {
            Intent moveIntent = new Intent(MainActivity.this, com.example.dleep.MainActivity.class);
            startActivity(moveIntent);
        } else if (id == R.id.discoverfootbar) {
            Intent moveIntent = new Intent(MainActivity.this, com.example.dleep.DiscoverActivity.class);
            startActivity(moveIntent);
        } else if (id == R.id.alarmfootbar) {
            Intent moveIntent = new Intent(MainActivity.this, com.example.dleep.discvStoriesUnplayedActivity.class);
            startActivity(moveIntent);
        } else if (id == R.id.profilefootbar) {
            Intent moveIntent = new Intent(MainActivity.this, com.example.dleep.ProfileActivity.class);
            startActivity(moveIntent);

        }
    }
}