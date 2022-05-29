package com.calendarnative;

import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class CalendarModule extends ReactContextBaseJavaModule {
    private static String TAG = "CalenderNative - CalenderModulle";

    CalendarModule(ReactApplicationContext context) {
        super(context);
    }

    @ReactMethod
    public void createCalendarEvent(String name, String location) {
        Log.d(TAG, "createCalendarEvent --- begin name["+name+"]"+"["+location+"]");
    }

    @NonNull
    @Override
    public String getName() {
        return "CalendarModule";
    }
}
