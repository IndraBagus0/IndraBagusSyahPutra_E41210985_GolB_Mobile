package com.example.minggu_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class linier extends AppCompatActivity {
    EditText to, subject, message;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linier);

        to= findViewById(R.id.to);
        subject = findViewById(R.id.subject);
        message = findViewById(R.id.massage);
        send = findViewById(R.id.send);
    }
}