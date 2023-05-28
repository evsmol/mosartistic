package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.Connectivity.a */
public final class C4971a implements C4973c {

    /* renamed from: a */
    final C4974d f12716a;

    /* renamed from: b */
    private BroadcastReceiver f12717b = new BroadcastReceiverStrategy$1(this);

    public C4971a(C4974d dVar) {
        this.f12716a = dVar;
    }

    /* renamed from: a */
    public final void mo34706a() {
        this.f12717b = null;
    }

    /* renamed from: a */
    public final void mo34707a(Context context) {
        try {
            context.registerReceiver(this.f12717b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo34708b(Context context) {
        try {
            context.unregisterReceiver(this.f12717b);
        } catch (IllegalArgumentException unused) {
        } catch (Exception e) {
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e);
        }
    }

    /* renamed from: c */
    public final JSONObject mo34709c(Context context) {
        return new JSONObject();
    }
}
