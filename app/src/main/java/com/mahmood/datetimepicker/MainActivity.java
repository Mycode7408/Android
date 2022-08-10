package com.mahmood.datetimepicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    public void showTimePicker(View view) {

        DialogFragment newfragment= new Timepicker();
        newfragment.show(getSupportFragmentManager(),"Time picker");
    }

    public void showDatePicker(View view) {

        DialogFragment newFragment= new Datepicker();
        newFragment.show(getSupportFragmentManager(),"Date Picker");
    }
}