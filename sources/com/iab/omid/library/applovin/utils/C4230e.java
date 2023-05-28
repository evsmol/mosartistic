package com.iab.omid.library.applovin.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.applovin.adsession.DeviceCategory;
import com.iab.omid.library.applovin.adsession.OutputDeviceStatus;

/* renamed from: com.iab.omid.library.applovin.utils.e */
public class C4230e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static OutputDeviceStatus f10108a = OutputDeviceStatus.UNKNOWN;

    /* renamed from: com.iab.omid.library.applovin.utils.e$a */
    class C4231a extends BroadcastReceiver {
        C4231a() {
        }

        public void onReceive(Context context, Intent intent) {
            OutputDeviceStatus outputDeviceStatus;
            if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                if (intExtra == 0) {
                    outputDeviceStatus = OutputDeviceStatus.NOT_DETECTED;
                } else if (intExtra == 1) {
                    outputDeviceStatus = OutputDeviceStatus.UNKNOWN;
                } else {
                    return;
                }
                OutputDeviceStatus unused = C4230e.f10108a = outputDeviceStatus;
            }
        }
    }

    /* renamed from: a */
    public static OutputDeviceStatus m11875a() {
        return C4224a.m11846a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f10108a;
    }

    /* renamed from: a */
    public static void m11877a(Context context) {
        context.registerReceiver(new C4231a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
