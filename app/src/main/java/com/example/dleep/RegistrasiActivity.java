package com.example.dleep;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class RegistrasiActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextDatepicker;
    private TextView textViewLogSign;

    private Button button4;
    private ImageView backarrowRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        editTextDatepicker = findViewById(R.id.editTextDatepicker);
        editTextDatepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });

        textViewLogSign = (TextView) findViewById(R.id.textViewLogSign);
        textViewLogSign.setOnClickListener(this);

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        backarrowRegis = (ImageView) findViewById(R.id.backarrowRegis);
        backarrowRegis.setOnClickListener(this);

    }

    private void showDatePickerDialog() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                        editTextDatepicker.setText(selectedDate);
                    }
                }, year, month, dayOfMonth);
        datePickerDialog.show();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.textViewLogSign) {
            Intent moveIntent = new Intent(RegistrasiActivity.this, com.example.dleep.LoginActivity.class);
            startActivity(moveIntent);
        } else if (id == R.id.button4){
            Intent moveIntent = new Intent(RegistrasiActivity.this, MainActivity.class);
            startActivity(moveIntent);
        } else if (id == R.id.backarrowRegis){
            finish();
        }
    }
}