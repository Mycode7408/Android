package com.mahmood.datetimepicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.text.DateFormat;
import java.util.Calendar;

public class Timepicker extends DialogFragment implements TimePickerDialog.OnTimeSetListener {


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        // Setting current time

        final Calendar c = Calendar.getInstance();
          int hour= c.get(Calendar.HOUR);
          int minute= c.get(Calendar.MINUTE);

          return new TimePickerDialog(getActivity(),this,hour,minute, DateFormat.getTimeInstance().isLenient());


    }


    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

    }
}
