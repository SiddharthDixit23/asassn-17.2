package com.developers.siddharth.servicesassignment172;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.widget.TextView;
import android.widget.Toast;

public class BoundService extends Service {

    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }

    // function which will return the current time and date
    public static String getCurrentTime() {
        SimpleDateFormat dateformat =
                new SimpleDateFormat("HH:mm:ss MM/dd/yyyy", Locale.UK);
                return (dateformat.format(new Date()));
    }

    }
