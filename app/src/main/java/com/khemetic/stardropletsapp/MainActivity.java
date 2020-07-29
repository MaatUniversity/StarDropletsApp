package com.khemetic.stardropletsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gv_calendar;
    DayAdapter dayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initCalendarGridView();
    }

    private void initCalendarGridView() {
        gv_calendar = findViewById(R.id.gv_calendar);
        dayAdapter = new DayAdapter(this);
        gv_calendar.setAdapter(dayAdapter);
    }
}