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

public class EditProfileActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton homefootbar;
    private ImageButton discoverfootbar;
    private ImageButton alarmfootbar;
    private ImageButton profilefootbar;

    private Button editsave;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        homefootbar = (android.widget.ImageButton) findViewById(R.id.homefootbar);
        homefootbar.setOnClickListener(this);

        discoverfootbar = (android.widget.ImageButton) findViewById(R.id.discoverfootbar);
        discoverfootbar.setOnClickListener(this);

        alarmfootbar = (android.widget.ImageButton) findViewById(R.id.alarmfootbar);
        alarmfootbar.setOnClickListener(this);

        profilefootbar = (android.widget.ImageButton) findViewById(R.id.profilefootbar);
        profilefootbar.setOnClickListener(this);

        editsave = (Button) findViewById(R.id.editsave);
        editsave.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.homefootbar) {
            Intent moveIntent = new Intent(EditProfileActivity.this, com.example.dleep.MainActivity.class);
            startActivity(moveIntent);
        } else if (id == R.id.discoverfootbar) {
            // Membuat instance dari fragment yang ingin ditampilkan
            DiscoverSoundsFragment fragment = new DiscoverSoundsFragment();

            // Mendapatkan FragmentManager
            FragmentManager fragmentManager = getSupportFragmentManager();

            // Memulai transaksi fragment
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            // Mengganti tampilan utama dengan tampilan dari fragment
            transaction.replace(android.R.id.content, fragment);
            transaction.addToBackStack(null); // Opsional, ini akan menambahkan fragment ke dalam back stack

            // Melakukan commit transaksi
            transaction.commit();
        } else if (id == R.id.alarmfootbar) {
            Intent moveIntent = new Intent(EditProfileActivity.this, com.example.dleep.discvStoriesUnplayedActivity.class);
            startActivity(moveIntent);
        } else if (id == R.id.profilefootbar) {
            Intent moveIntent = new Intent(EditProfileActivity.this, com.example.dleep.MainActivity.class);
            startActivity(moveIntent);

        }else if (id == R.id.editprof) {
            Intent moveIntent = new Intent(EditProfileActivity.this, com.example.dleep.EditProfileActivity.class);
            startActivity(moveIntent);
        }

        else if (id == R.id.editsave) {
            Intent moveIntent = new Intent(EditProfileActivity.this, com.example.dleep.ProfileActivity.class);
            startActivity(moveIntent);
        }
    }
}