package com.appsgeyser.sdk.push;

import android.content.Context;
import android.util.Log;
import com.onesignal.OneSignal;

public class OneSignalCreator {
    public static void init(Context context, String str) {
        Log.d("OneSignalCreator", "OneSignalCreator.init()");
        if (str != null && !str.isEmpty()) {
            Log.d("OneSignalCreator", "oneSignalAppId : " + str);
            OneSignal.initWithContext(context.getApplicationContext());
            OneSignal.setAppId(str);
        }
    }
}
