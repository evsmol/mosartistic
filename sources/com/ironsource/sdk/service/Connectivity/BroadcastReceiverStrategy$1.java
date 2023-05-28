package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ironsource.p119d.C4370a;
import org.json.JSONObject;

class BroadcastReceiverStrategy$1 extends BroadcastReceiver {

    /* renamed from: a */
    private /* synthetic */ C4971a f12715a;

    BroadcastReceiverStrategy$1(C4971a aVar) {
        this.f12715a = aVar;
    }

    public void onReceive(Context context, Intent intent) {
        String a = C4370a.m12414a(context);
        if (a.equals("none")) {
            this.f12715a.f12716a.mo34453a();
            return;
        }
        C4974d dVar = this.f12715a.f12716a;
        new JSONObject();
        dVar.mo34454a(a);
    }
}
