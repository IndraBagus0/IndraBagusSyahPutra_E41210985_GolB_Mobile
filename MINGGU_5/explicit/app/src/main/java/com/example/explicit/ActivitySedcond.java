package com.example.explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

public class ActivitySedcond extends AppCompatActivity {
    TextView txtHello;
    private String nama;
    private String KEY_NAME = "NAMA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sedcond);

        txtHello = (TextView) findViewById(R.id.txtHello);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        txtHello.setText("Hello, " + nama + " !");
    }
}