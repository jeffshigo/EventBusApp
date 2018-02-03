package com.example.jinming.eventbusapp;

/**
 * Created by Jinming on 11/2/17.
 */

import org.greenrobot.eventbus.EventBus;

public class GlobalBus {
    private static EventBus sBus;

    public static EventBus getBus() {
        if (sBus == null)
            sBus = EventBus.getDefault();
        return sBus;
    }
}
