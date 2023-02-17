package com.example.minggu_2;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class Relative extends AppCompatActivity {
    private void RelativeLayout(){
        EditText field = findViewById(R.id.field_date);
        Button btn_date = findViewById(R.id.btn_date);
        TextView selected_date = findViewById(R.id.txt_selected);

        final Calendar cldr = Calendar.getInstance();
        int day = cldr.get(Calendar.DAY_OF_MONTH);
        int month = cldr.get(Calendar.MONTH);
        int year = cldr.get(Calendar.YEAR);

        field.setOnClickListener(v -> {
            DatePickerDialog picker = new DatePickerDialog(Relative.this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int yearr, int monthOfYear, int dayOfMonth) {
                    field.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + yearr);
                }
            }, year, month, day);
            picker.show();
        });

        btn_date.setOnClickListener(v -> {
            selected_date.setText("Selected Date : " + field.getText());
        });
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        RelativeLayout();
        ActionBar bar = getSupportActionBar();
        bar.setTitle(R.string.app_name);
        bar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}