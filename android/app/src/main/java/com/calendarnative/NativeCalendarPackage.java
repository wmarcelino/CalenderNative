package com.calendarnative;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NativeCalendarPackage implements ReactPackage {

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    public List<NativeModule> createNativeModules(
            ReactApplicationContext reactApplicationContext
    ) {
        List<NativeModule> nativeModules = new ArrayList<>();
        nativeModules.add(new CalendarModule(reactApplicationContext));

        return nativeModules;
    }








}
